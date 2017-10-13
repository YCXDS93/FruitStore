package com.bwie.fruitsstore.home.presenter;

import com.bwie.fruitsstore.core.CallBackLister;
import com.bwie.fruitsstore.home.model.HomeService;
import com.bwie.fruitsstore.home.model.bean.ClassifyDetailsResponse;
import com.bwie.fruitsstore.home.view.iview.IDetailsView;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/17 10:12
 */

public class HomeDetailsPresent implements IhomeDetailsPresent{

    private IDetailsView iDetailsView;
    private String goodId;

    public HomeDetailsPresent() {
    }

    public HomeDetailsPresent(IDetailsView iDetailsView, String goodId) {
        this.iDetailsView = iDetailsView;
        this.goodId = goodId;
    }

    @Override
    public void start() {
        loadDatas();
    }

    @Override
    public void loadDatas() {
        HomeService.getInstace().getAskPlusDetail(goodId, new CallBackLister<ClassifyDetailsResponse>() {
            @Override
            public void onNetStart() {

            }

            @Override
            public void onNetSuccess(ClassifyDetailsResponse classifyDetailsResponse) {
                if (iDetailsView != null) {
//                    configView.showOrHidePregress(false);
                    if (classifyDetailsResponse != null) {
                        iDetailsView.refreshView(classifyDetailsResponse);
                    } else {
//                        configView.showOrHideErrorView(true);
                    }
                }
            }

            @Override
            public void onNetField(ClassifyDetailsResponse classifyDetailsResponse) {

            }
        });
    }

    @Override
    public void detachView() {
        if (iDetailsView != null) {
            iDetailsView = null;
        }
    }
}
