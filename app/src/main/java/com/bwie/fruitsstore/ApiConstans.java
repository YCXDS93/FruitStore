package com.bwie.fruitsstore;

/**
 * 作者：王兵洋  2017/8/5 14:45
 * 类的用途：
 */
public class ApiConstans {

    public static final class Base {
        public static final String BASE_URL = "";
    }

    public static final class Home {
        //分类一级列表接口
        public static final String NET_API_CLASSIFY_FIRST = "http://apiv4.yangkeduo.com/operation/140/";
        //分类右侧点击详情接口
        public static final String NET_API_CLASSIFY_DETAILS = "http://apiv4.yangkeduo.com/v5/goods/";
        //分裂一级列表缓存的key
        public static final String NET_API_CLASSIFY_FIRST_KEY = "classifyFirstKey";
        //分裂二级点击列表跳转传值
        public static final String INTENT_CLASSIFY_DETAILS = "classifyDetailsIntent";

    }

}

