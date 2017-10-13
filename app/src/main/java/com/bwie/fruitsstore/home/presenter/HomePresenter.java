package com.bwie.fruitsstore.home.presenter;

import com.bwie.fruitsstore.core.CallBackLister;
import com.bwie.fruitsstore.home.model.HomeService;
import com.bwie.fruitsstore.home.model.bean.ClassifyFirstResponse;
import com.bwie.fruitsstore.home.view.iview.IClassifySecond;
import com.bwie.fruitsstore.home.view.iview.IConfigView;

import retrofit2.Call;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/8 15:02
 */

public class HomePresenter implements IHomePresent {

    private IConfigView configView;
    private IClassifySecond iClassifySecond;
    private int opt_type;
    private int offset;
    private int size;
    private int pdduid;
    private Call<String> call;

    public HomePresenter() {

    }

    public HomePresenter(IClassifySecond iClassifySecond) {
        this.iClassifySecond = iClassifySecond;
    }

    public HomePresenter(IConfigView configView, int opt_type, int offset, int size, int pdduid) {
        this.configView = configView;
        this.opt_type = opt_type;
        this.offset = offset;
        this.size = size;
        this.pdduid = pdduid;
    }

    @Override
    public void start() {
        loadData();
    }

    @Override
    public void loadData() {
        HomeService.getInstace().getClassifyFirstList(opt_type, offset, size, pdduid, new CallBackLister<ClassifyFirstResponse>() {
            @Override
            public void onNetStart() {
                configView.showOrHidePregress(true);
                configView.showOrHideErrorView(true);
            }

            @Override
            public void onNetSuccess(ClassifyFirstResponse classifyFirstResponse) {
                if (configView != null) {
                    configView.showOrHidePregress(false);
                    configView.showOrHideErrorView(false);
                    if (classifyFirstResponse != null) {
                        configView.refreshView(classifyFirstResponse);
                    } else {
                        configView.showOrHideErrorView(true);
                    }
                }
            }

            @Override
            public void onNetField(ClassifyFirstResponse classifyFirstResponse) {
                if (classifyFirstResponse != null) {
                    configView.showOrHidePregress(false);
                    configView.showOrHideErrorView(false);
                }
            }
        });
    }

    public void initDatas(int type, int id, int sizes, int pddId) {
        HomeService.getInstace().getClassifyFirstList(type, id, sizes, pddId, new CallBackLister<ClassifyFirstResponse>() {
            @Override
            public void onNetStart() {
//                configView.showOrHidePregress(true);
            }

            @Override
            public void onNetSuccess(ClassifyFirstResponse classifyFirstResponse) {
                if (iClassifySecond != null) {
//                    configView.showOrHidePregress(false);
                    if (classifyFirstResponse != null) {
                        iClassifySecond.refreshViews(classifyFirstResponse);
                    } else {
//                        configView.showOrHideErrorView(true);
                    }
                }
            }

            @Override
            public void onNetField(ClassifyFirstResponse classifyFirstResponse) {
                if (classifyFirstResponse != null) {
//                    configView.showOrHidePregress(false);
                }
            }
        });
    }

    @Override
    public void detachView() {
        if (configView != null) {
            configView = null;
        }
        if (iClassifySecond != null) {
            iClassifySecond = null;
        }
        if (call != null && call.isCanceled()) {
            call.cancel();
            call = null;
        }
    }

}
