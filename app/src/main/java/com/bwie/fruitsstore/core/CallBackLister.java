package com.bwie.fruitsstore.core;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/8 14:20
 */

public interface CallBackLister<T> {

    void onNetStart();

    void onNetSuccess(T t);

    void onNetField(T t);

}
