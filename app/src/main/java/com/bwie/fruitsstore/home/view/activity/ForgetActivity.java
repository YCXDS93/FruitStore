package com.bwie.fruitsstore.home.view.activity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.base.BaseActivity;
import com.bwie.fruitsstore.utils.Utils_Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.OnClick;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;

import static android.widget.Toast.makeText;

/**
 * 类用途 :忘记密码
 * 作者 : 于帅光
 * 时间 : 2017/8/9
 */

public class ForgetActivity extends BaseActivity {

    @BindView(R.id.forget_back)
    ImageView mForgetBack;
    @BindView(R.id.et_phone)
    EditText mEtPhone;
    @BindView(R.id.getyzm)
    Button mGetyzm;
    @BindView(R.id.et_phone_code)
    EditText mEtPhoneCode;
    @BindView(R.id.et_password)
    EditText mEtPassword;
    @BindView(R.id.et_invite_code)
    EditText mEtInviteCode;
    @BindView(R.id.que_btn)
    Button mQueBtn;
    public EventHandler eh; //事件接收器
    private TimeCount mTimeCount;//计时器
    private SQLiteDatabase mDatabase;
    private ContentValues mValues;
    private MySQLiteOpenHelper helper;

    @Override
    public int getLayoutID() {
        return R.layout.activity_forget;
    }

    @Override
    public void initView() {
        mTimeCount = new TimeCount(60000, 1000);
        helper = new MySQLiteOpenHelper(this);
    }

    @Override
    public void initData() {

    }

    @OnClick({R.id.forget_back, R.id.relat_register, R.id.getyzm, R.id.que_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.forget_back:
                startActivity(new Intent(ForgetActivity.this, LoginActivity.class));
                break;
            case R.id.getyzm://获取验证码
                /**
                 * 获取短信验证码   = =！
                 */
                eh = new EventHandler() {
                    @Override
                    public void afterEvent(int event, int result, Object data) {
                        if (result == SMSSDK.RESULT_COMPLETE) { //回调完成
                            if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) { //提交验证码成功
//                                startActivity(new Intent(RegisterActivity.this, LoginActivity.class)); //页面跳转
                            } else if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) { //获取验证码成功
                            } else if (event == SMSSDK.EVENT_GET_SUPPORTED_COUNTRIES) { //返回支持发送验证码的国家列表
                            }
                        } else {
                            ((Throwable) data).printStackTrace();
                        }
                    }
                };
                SMSSDK.registerEventHandler(eh); //注册短信回调
                if (!mEtPhone.getText().toString().trim().equals("")) {
                    if (checkTel(mEtPhone.getText().toString().trim())) {
                        SMSSDK.getVerificationCode("+86", mEtPhone.getText().toString());//获取验证码
                        mTimeCount.start();
                    } else {
                        makeText(ForgetActivity.this, "请输入正确的手机号码", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    makeText(ForgetActivity.this, "请输入手机号码", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.que_btn: //确认
                if (!mEtPhone.getText().toString().trim().equals("")) {
                    if (checkTel(mEtPhone.getText().toString().trim())) {
                        if (!mEtPhoneCode.getText().toString().trim().equals("")) {
                            SMSSDK.submitVerificationCode("+86", mEtPhone.getText().toString().trim(), mEtPhoneCode.getText().toString().trim());//提交验证
                            if (!mEtPassword.getText().toString().trim().equals("")) {
                                if (!mEtInviteCode.getText().toString().trim().equals("")) {

                                    mDatabase = helper.getReadableDatabase();
                                    mValues = new ContentValues();
                                    mValues.put("phone", mEtPhone.getText().toString());
                                    mValues.put("pwd", mEtPassword.getText().toString());
                                    mDatabase.insert("logins", null, mValues);
                                    //关闭数据库
                                    mDatabase.close();
                                    //注册完成 跳转
                                    Intent intent = new Intent(ForgetActivity.this, LoginActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast toast = makeText(ForgetActivity.this, "请输入客户邀请码", Toast.LENGTH_SHORT);
                                    Utils_Toast.showMyToast(toast, 1000);
                                }
                            } else {
                                Toast toast = makeText(ForgetActivity.this, "密码格式有误", Toast.LENGTH_SHORT);
                                Utils_Toast.showMyToast(toast, 1000);
                            }
                        } else {
                            Toast toast = Toast.makeText(ForgetActivity.this, "请输入验证码", Toast.LENGTH_SHORT);
                            Utils_Toast.showMyToast(toast, 1000);
                        }
                    } else {
                        Toast toast = makeText(ForgetActivity.this, "请输入正确的手机号码", Toast.LENGTH_SHORT);
                        Utils_Toast.showMyToast(toast, 1000);
                    }
                } else {
                    Toast toast = makeText(ForgetActivity.this, "请输入手机号码", Toast.LENGTH_SHORT);
                    Utils_Toast.showMyToast(toast, 1000);
                }
                break;
        }
    }

    /**
     * 计时器
     */
    class TimeCount extends CountDownTimer {

        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {
            mGetyzm.setClickable(false);
            mGetyzm.setText(l / 1000 + "秒后重新获取");
        }

        @Override
        public void onFinish() {
            mGetyzm.setClickable(true);
            mGetyzm.setText("获取验证码");
        }
    }

    /**
     * 正则匹配手机号码
     *
     * @param tel
     * @return
     */
    public boolean checkTel(String tel) {
        Pattern p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$");
        Matcher matcher = p.matcher(tel);
        return matcher.matches();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SMSSDK.unregisterEventHandler(eh);
    }
}