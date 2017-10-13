package com.bwie.fruitsstore.core;

import com.bwie.fruitsstore.ApiConstans;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * 作者：王兵洋  2017/8/5 14:44
 * 类的用途：网络请求数据
 */
public class ApiGenerator {

    //分类一级和二级列表请求
    static Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl(ApiConstans.Home.NET_API_CLASSIFY_FIRST)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

    public static ApiServer getApiServer() {
        return mRetrofit.create(ApiServer.class);
    }

    ////分类右侧点击详情请求
    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(ApiConstans.Home.NET_API_CLASSIFY_DETAILS)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

    public static ApiServer getApiServerDetails() {
        return retrofit.create(ApiServer.class);
    }

}
