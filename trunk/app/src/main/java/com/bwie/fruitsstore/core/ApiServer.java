package com.bwie.fruitsstore.core;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * 作者：王兵洋  2017/8/5 14:39
 * 类的用途：
 */
public interface ApiServer {

    @GET
    Call<String> baseGetRequest(@Url String url);

}
