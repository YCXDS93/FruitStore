package com.bwie.fruitsstore.home.view.iview;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/8 14:55
 */

public interface IConfigView<T> {

    void showOrHidePregress(boolean flag);

    void showOrHideErrorView(boolean flag);

    void refreshView(T t);
}
