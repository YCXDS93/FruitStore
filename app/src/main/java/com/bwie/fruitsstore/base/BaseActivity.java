package com.bwie.fruitsstore.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.gyf.barlibrary.ImmersionBar;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/8 15:30
 */

public abstract class BaseActivity extends Activity {

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        unbinder = ButterKnife.bind(this);
        //设置沉浸式
        ImmersionBar.with(this).init();
        ImmersionBar.with(this).transparentStatusBar().fullScreen(true).destroy();
        initView();
        initData();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    public abstract int getLayoutID();

    public abstract void initView();

    public abstract void initData();
}
