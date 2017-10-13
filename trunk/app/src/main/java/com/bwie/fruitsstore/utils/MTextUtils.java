package com.bwie.fruitsstore.utils;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类用途 :正则表达式判断工具类
 * 作者 : 郁文涛
 * 时间 : 2017/8/8 19:36
 */

public class MTextUtils {

    public static boolean isUsername(String username) {
        if (TextUtils.isEmpty(username)) {
            ToastUtils.show("用户名格式不正确！");
            return false;
        }
        String regStr = "^((1783[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\\\d{8}$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(username);
        if (!matcher.find()) {
            ToastUtils.show("用户名格式不正确！");
            return false;
        }
        return true;
    }

    public static boolean isPassword(String password) {
        if (TextUtils.isEmpty(password)) {
            ToastUtils.show("密码格式不正确！");
            return false;
        }
        LogUtils.i("password=" + password);
        if (TextUtils.isDigitsOnly(password)) {
            return true;
        } else {
            ToastUtils.show("密码格式不正确！");
        }
        return false;
    }

    public static boolean isEmail(String isEmail) {
        if (TextUtils.isDigitsOnly(isEmail)) {
            return true;
        } else {
            ToastUtils.show("邮箱格式不正确！");
        }
        return false;
    }
}
