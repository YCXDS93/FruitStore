package com.bwie.fruitsstore.home.view.activity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.base.BaseActivity;
import com.bwie.fruitsstore.utils.Utils_Toast;

import butterknife.BindView;

/**
 * 登录页面
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.login_close)
    ImageView loginClose;
    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.register)
    TextView register;
    @BindView(R.id.forget)
    TextView forget;
    @BindView(R.id.logo)
    ImageView mLogo;
    @BindView(R.id.login)
    TextView mLogin;
    private String mEtphone;
    private String mEtpassword;
    private MySQLiteOpenHelper helper;
    private SQLiteDatabase mDb;
    private String img = "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3552649236,3399850653&fm=26&gp=0.jpg";

    @Override
    public int getLayoutID() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        loginClose.setOnClickListener(this);//关闭
        register.setOnClickListener(this);//注册
        forget.setOnClickListener(this);//忘记密码
        helper = new MySQLiteOpenHelper(this);
    }

    @Override
    public void initData() {
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEtphone = etPhone.getText().toString();
                mEtpassword = etPassword.getText().toString();
                if (mlogin(mEtphone, mEtpassword)) {

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("phone", mEtphone);
                    intent.putExtra("img", img);
                    startActivity(intent);
                } else {
                    Toast toast = Toast.makeText(LoginActivity.this, "手机号不正确", Toast.LENGTH_LONG);
                    Utils_Toast.showMyToast(toast, 1000);
                }
            }
        });
    }

    //验证登录
    public boolean mlogin(String mEtphone, String mEtpassword) {
        mDb = helper.getReadableDatabase();
        String sql = "select * from logins where phone=? and pwd=?";
        Cursor cursor = mDb.rawQuery(sql, new String[]{mEtphone, mEtpassword});
        if (cursor.moveToFirst() == true) {
            cursor.close();
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_close:
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
                break;
            case R.id.register:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
            case R.id.forget:
                startActivity(new Intent(LoginActivity.this, ForgetActivity.class));
                break;
        }
    }
}
