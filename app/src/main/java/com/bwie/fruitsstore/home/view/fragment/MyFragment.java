package com.bwie.fruitsstore.home.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.base.BaseFragment;
import com.bwie.fruitsstore.home.view.activity.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * 作者：王兵洋  2017/8/5 13:41
 * 类的用途：
 */
public class MyFragment extends BaseFragment {
    @BindView(R.id.my_login)
    ImageView myLogin;
    @BindView(R.id.my_indent)
    TextView myIndent;
    @BindView(R.id.all_indent)
    TextView allIndent;
    @BindView(R.id.indent)
    RelativeLayout indent;
    @BindView(R.id.obligation)
    TextView obligation;
    @BindView(R.id.drop_shipping)
    TextView dropShipping;
    @BindView(R.id.wait)
    TextView wait;
    @BindView(R.id.drawback)
    TextView drawback;
    @BindView(R.id.attention)
    TextView attention;
    @BindView(R.id.change_password)
    TextView changePassword;
    @BindView(R.id.message)
    TextView message;
    @BindView(R.id.about_us)
    TextView aboutUs;
    @BindView(R.id.contact_us)
    TextView contactUs;
    @BindView(R.id.options)
    TextView options;
    Unbinder unbinder;
    @BindView(R.id.userName)
    TextView mUserName;
    @BindView(R.id.userImg)
    ImageView mUserImg;

    private String mPhone;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initView() {
        myLogin.setOnClickListener(this);//登录
        myIndent.setOnClickListener(this);//我的订单
        allIndent.setOnClickListener(this);//查看所有订单
        obligation.setOnClickListener(this);//待付款
        dropShipping.setOnClickListener(this);//待发货
        wait.setOnClickListener(this);//待收货
        drawback.setOnClickListener(this);//退款
        attention.setOnClickListener(this);//我的关注
        changePassword.setOnClickListener(this);//修改密码
        message.setOnClickListener(this);//收货信息
        aboutUs.setOnClickListener(this);//关于我们
        options.setOnClickListener(this);//用户设置
        contactUs.setOnClickListener(this);//联系我们
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Intent intent = getActivity().getIntent();
        //传回来的手机号
        mPhone = intent.getStringExtra("phone");
        mUserName.setText(mPhone);
        //        传回的头像         默认的一个头像  但也是网络获取的
        String img = intent.getStringExtra("img");
        //Glide把头像加载成圆形的头像
        Glide.with(getActivity()).load(img)
                .bitmapTransform(new CropCircleTransformation(getActivity()))
                .into(mUserImg);
        mUserName.setVisibility(View.VISIBLE);
        if (mUserName.length() < 10) {

        } else {
            myLogin.setVisibility(View.GONE);
        }
    }

    @Override
    protected void loadData() {

    }

    public void intentDadat() {
        startActivity(new Intent(getActivity(), LoginActivity.class));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_login:
                intentDadat();
                break;
            case R.id.my_indent:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }

                break;
            case R.id.all_indent:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }
                break;
            case R.id.obligation:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }
                break;
            case R.id.drop_shipping:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }
                break;
            case R.id.wait:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }
                break;
            case R.id.drawback:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }
                break;
            case R.id.attention:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }
                break;
            case R.id.change_password:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }
                break;
            case R.id.message:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }
                break;
            case R.id.about_us:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }
                break;
            case R.id.options:
                if (mUserName.length() < 10) {
                    intentDadat();
                } else {
                }
                break;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}