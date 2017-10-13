package com.bwie.fruitsstore.home.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.home.presenter.HomePresenter;
import com.bwie.fruitsstore.home.view.fragment.ClassifyFragment;
import com.bwie.fruitsstore.home.view.fragment.HomeFragment;
import com.bwie.fruitsstore.home.view.fragment.MyFragment;
import com.bwie.fruitsstore.home.view.fragment.ShoppingFragment;
import com.gyf.barlibrary.ImmersionBar;

/**
 * Created by sixGroup on 2017/8/5
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private HomeFragment mHomeFragment;
    private ClassifyFragment mClassifyFragment;
    private ShoppingFragment mShoppingFragment;
    private MyFragment mMyFragment;
    private RadioButton home, classify, shopping, my;
    private FragmentManager mManager;
    private FragmentTransaction mTransaction;
    private HomePresenter homePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initFragment();
        //设置沉浸式
        ImmersionBar.with(this).init();
        ImmersionBar.with(this).transparentStatusBar().fullScreen(true).destroy();
    }

    private void initFragment() {
        homePresenter = new HomePresenter();
//        创建Fragment对象
        mHomeFragment = new HomeFragment();
        mClassifyFragment = new ClassifyFragment();
        mShoppingFragment = new ShoppingFragment();
        mMyFragment = new MyFragment();
        //创建Fragment管理器
        mManager = getSupportFragmentManager();
        mTransaction = mManager.beginTransaction();
        //显示第一个页面
        mTransaction.add(R.id.fLayout, mHomeFragment).show(mHomeFragment).commit();
//        隐藏后三个界面
        mManager.beginTransaction().add(R.id.fLayout, mClassifyFragment).hide(mClassifyFragment).commit();
        mManager.beginTransaction().add(R.id.fLayout, mShoppingFragment).hide(mShoppingFragment).commit();
        mManager.beginTransaction().add(R.id.fLayout, mMyFragment).hide(mMyFragment).commit();
    }

    /**
     * 初始化数据
     */
    private void initView() {
        home = (RadioButton) findViewById(R.id.home);
        classify = (RadioButton) findViewById(R.id.classify);
        shopping = (RadioButton) findViewById(R.id.shopping);
        my = (RadioButton) findViewById(R.id.my);
        home.setOnClickListener(this);
        classify.setOnClickListener(this);
        shopping.setOnClickListener(this);
        my.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home:
                //显示第一个页面
                mManager.beginTransaction().show(mHomeFragment).commit();
                //隐藏 二 三    四 界面
                mManager.beginTransaction().hide(mClassifyFragment).commit();
                mManager.beginTransaction().hide(mShoppingFragment).commit();
                mManager.beginTransaction().hide(mMyFragment).commit();
                break;
            case R.id.classify:
                //显示第二个页面
                mManager.beginTransaction().show(mClassifyFragment).commit();
                //隐藏 一  三 四  界面
                mManager.beginTransaction().hide(mHomeFragment).commit();
                mManager.beginTransaction().hide(mShoppingFragment).commit();
                mManager.beginTransaction().hide(mMyFragment).commit();
                break;
            case R.id.shopping:
                //显示第三个界面
                mManager.beginTransaction().show(mShoppingFragment).commit();
                //隐藏    一   二   四   界面
                mManager.beginTransaction().hide(mClassifyFragment).commit();
                mManager.beginTransaction().hide(mHomeFragment).commit();
                mManager.beginTransaction().hide(mMyFragment).commit();
                break;
            case R.id.my:
                //显示第四个界面
                mManager.beginTransaction().show(mMyFragment).commit();
                //隐藏    一   二   三   界面
                mManager.beginTransaction().hide(mClassifyFragment).commit();
                mManager.beginTransaction().hide(mShoppingFragment).commit();
                mManager.beginTransaction().hide(mHomeFragment).commit();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (homePresenter != null) {
            homePresenter.detachView();
        }
    }
}