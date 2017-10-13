package com.bwie.fruitsstore.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * 类用途 :Fragment基类
 * 作者 : 于帅光
 * 时间 : 2017/8/8 15:30
 */
public abstract class BaseFragment extends Fragment implements View.OnClickListener {
    private View view;
    protected Activity mAct;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(getLayoutId(), null);
        ButterKnife.bind(this, view);
        initView();
        loadData();
        return view;
    }

    public abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void loadData();

}
