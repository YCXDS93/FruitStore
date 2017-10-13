package com.bwie.fruitsstore;


import com.mob.MobApplication;

/**
 * 作者：王兵洋  2017/8/5 14:49
 * 类的用途：
 */
public class MyApplication extends MobApplication {

    public static MyApplication instance;

    public MyApplication() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

    }


}

