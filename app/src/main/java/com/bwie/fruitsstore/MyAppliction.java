package com.bwie.fruitsstore;

import com.mob.MobApplication;

/**
 * 作者：王兵洋  2017/8/5 14:49
 * 类的用途：
 */
public class MyAppliction extends MobApplication {

    public static MyAppliction instance;

    public MyAppliction() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
