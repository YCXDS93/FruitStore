package com.bwie.fruitsstore.home.model;

import com.bwie.fruitsstore.MyAppliction;
import com.bwie.fruitsstore.core.CallBackLister;
import com.bwie.fruitsstore.home.model.bean.ClassifyDetailsResponse;
import com.bwie.fruitsstore.home.model.bean.ClassifyFirstResponse;
import com.bwie.fruitsstore.utils.ACache;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/8 14:30
 */

public class HomeService {
    private static volatile HomeService instance;
    private ACache aCache;

    public HomeService() {
        aCache = ACache.get(MyAppliction.instance);
    }

    public static HomeService getInstace() {
        if (instance == null) {
            synchronized (HomeService.class) {
                if (instance == null) {
                    instance = new HomeService();
                }
            }
        }
        return instance;
    }

    //分类一级列表请求，数据接口返回
    public Call getClassifyFirstList(int opt_type, int offset, int size, int pdduid, final CallBackLister<ClassifyFirstResponse> callBackLister) {
        callBackLister.onNetStart();
        boolean isCallBack = false;
//        ClassifyFirstResponse bean = (ClassifyFirstResponse) aCache.getAsObject(ApiConstans.Home.NET_API_CLASSIFY_FIRST_KEY);
//        if (bean != null) {
//            callBackLister.onNetSuccess(bean);
//            isCallBack = true;
//        }
        Call<String> call = ApiHome.getInstance().getConfigFromServer(opt_type, offset, size, pdduid);
        final boolean finalIsCallBack = isCallBack;
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response != null && response.isSuccessful()) {
                    if (response.body() != null) {
                        ClassifyFirstResponse askRequestBean = ClassifyFirstResponse.objectFromData(response.body().toString());
//                        if (!finalIsCallBack) {
                        callBackLister.onNetSuccess(askRequestBean);
//                        }
//                        aCache.put(ApiConstans.Home.NET_API_CLASSIFY_FIRST_KEY, askRequestBean);
                    } else {
//                        if (!finalIsCallBack) {
                        callBackLister.onNetField(null);
//                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                callBackLister.onNetField(null);
            }
        });
        return call;
    }

    //分类二级列表点击跳转详情请求，
    //http://apiv4.yangkeduo.com/v5/goods/6042651
    public Call getAskPlusDetail(String goodId, final CallBackLister<ClassifyDetailsResponse> callBackLister) {
        callBackLister.onNetStart();
//        boolean isAskCallBack = false;
//        AskPlusDetailRequest bean = (AskPlusDetailRequest) aCache.getAsObject(AppConstants.ASKBARPLUSDETAIL_LIST_KEY);
//        if (bean != null) {
//            callBackLister.onNetSuccess(bean);
//            isAskCallBack = true;
//        }
        Call<String> call = ApiHome.getInstance().getConfigFromServerDetails(goodId);
//        final boolean finalIsAskCallBack = isAskCallBack;
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response != null && response.isSuccessful()) {
                    if (response.body() != null) {
                        ClassifyDetailsResponse askRequestBean = ClassifyDetailsResponse.objectFromData(response.body().toString());

//                        if (!finalIsAskCallBack) {
                            callBackLister.onNetSuccess(askRequestBean);
//                        }
//                        aCache.put(AppConstants.ASKBARPLUSDETAIL_LIST_KEY, askRequestBean);
                    } else {
//                        if (!finalIsAskCallBack) {
                            callBackLister.onNetField(null);
//                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
//                if (!finalIsAskCallBack) {
                    callBackLister.onNetField(null);
//                }
            }
        });
        return call;
    }
}
