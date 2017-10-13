package com.bwie.fruitsstore.utils;

import android.widget.Toast;

import com.bwie.fruitsstore.MyApplication;

/**
 * 类用途 :Toast工具类
 * 作者 : 郁文涛
 * 时间 : 2017/8/8 19:35
 */
public class ToastUtils {

    public static void show(String msg) {
        Toast.makeText(MyApplication.instance.getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
