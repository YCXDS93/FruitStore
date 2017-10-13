package com.bwie.fruitsstore.home.view.iview;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/17 10:19
 */

public interface IDetailsView<T> {
    void showOrHidePregress(boolean flag);

    void showOrHideErrorView(boolean flag);

    void refreshView(T t);
}
