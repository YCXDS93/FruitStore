package com.bwie.fruitsstore.home.model;

import com.bwie.fruitsstore.ApiConstans;
import com.bwie.fruitsstore.core.ApiGenerator;
import com.bwie.fruitsstore.core.ApiServer;

import retrofit2.Call;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/8 14:27
 */

public class ApiHome {

    private static volatile ApiHome instance = null;
    private ApiServer baseService;

    public ApiHome() {
        baseService = ApiGenerator.getApiServer();
    }

    public static ApiHome getInstance() {
        if (instance == null) {
            synchronized (ApiHome.class) {
                if (instance == null) {
                    instance = new ApiHome();
                }
            }
        }
        return instance;
    }

    //获取分类一级列表请求的方法
    public Call<String> getConfigFromServer(int opt_type, int offset, int size, int pdduid) {
        if (baseService == null) {
            baseService = ApiGenerator.getApiServer();
        }
        return baseService.baseGetRequest(getConfigUrl(opt_type, offset, size, pdduid));
    }

    //获取分类一级列表拼接字段的方法
    //http://apiv4.yangkeduo.com/operation/140/groups?opt_type=1&offset=1&size=50&pdduid=0
    public String getConfigUrl(int opt_type, int offset, int size, int pdduid) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(ApiConstans.Home.NET_API_CLASSIFY_FIRST).append("groups?opt_type=")
                .append(opt_type).append("&offset=").append(offset).append("&size=")
                .append(size).append("&pdduid=").append(pdduid);
        return stringBuffer.toString();
    }


    //获取分类二级列表详情请求的方法
    public Call<String> getConfigFromServerDetails(String goodId) {
        if (baseService == null) {
            baseService = ApiGenerator.getApiServerDetails();
        }
        return baseService.baseGetRequest(getConfigUrlDetails(goodId));
    }

    //获取分类二级列表详情拼接字段的方法
    //http://apiv4.yangkeduo.com/v5/goods/6042651
    public String getConfigUrlDetails(String goodId) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(ApiConstans.Home.NET_API_CLASSIFY_DETAILS).append(goodId);
        return stringBuffer.toString();
    }

}
