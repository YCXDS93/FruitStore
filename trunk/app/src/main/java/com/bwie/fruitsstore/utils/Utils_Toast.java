package com.bwie.fruitsstore.utils;

import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 作者：王兵洋  2017/8/10 21:37
 * 类的用途：    Toast工具类
 */
public class Utils_Toast {

    public static void showMyToast(final Toast toast, final int cnt) {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                toast.show();
            }
        }, 0, 3000);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                toast.cancel();
                timer.cancel();
            }
        }, cnt);
    }
}