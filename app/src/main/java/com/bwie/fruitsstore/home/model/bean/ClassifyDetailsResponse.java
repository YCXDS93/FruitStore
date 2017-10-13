package com.bwie.fruitsstore.home.model.bean;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/17 10:02
 */

public class ClassifyDetailsResponse implements Serializable{

    /**
     * gallery : [{"goods_id":6042651,"type":2,"id":1085613981,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/19235e6bd35165297f11a404abb781d9.jpeg","priority":17,"height":1294,"width":640},{"goods_id":6042651,"type":2,"id":1085613980,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/d9536e5dde32c0325e7a46af432e6631.jpeg","priority":16,"height":932,"width":640},{"goods_id":6042651,"type":2,"id":1085613979,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/3f6f61b048101e0acc95d8b3426321f3.jpeg","priority":15,"height":681,"width":640},{"goods_id":6042651,"type":2,"id":1085613978,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/729ddbbcd0592a5597a85f302e40a836.jpeg","priority":14,"height":551,"width":640},{"goods_id":6042651,"type":2,"id":1085613977,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/e981ec259f7917d78349529750fb30e2.jpeg","priority":13,"height":500,"width":640},{"goods_id":6042651,"type":2,"id":1085613976,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/b4c466e779d45e1c5eb28728bb734940.jpeg","priority":12,"height":713,"width":640},{"goods_id":6042651,"type":2,"id":1085613975,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/abc7bf41387246799b995dba91907327.jpeg","priority":11,"height":599,"width":640},{"goods_id":6042651,"type":2,"id":1085613974,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/54775f73f20b06b3f645d37c6f7c3f55.jpeg","priority":10,"height":454,"width":640},{"goods_id":6042651,"type":2,"id":1085613973,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-17/9431e8358d9e6535c19f9cc0ad7cf9ad.jpeg","priority":9,"height":590,"width":640},{"goods_id":6042651,"type":2,"id":1085613972,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-17/11bc68f3ad2b54ce5062d8e987b89497.jpeg","priority":8,"height":590,"width":640},{"goods_id":6042651,"type":2,"id":1085613971,"url":"http://omsproductionimg.yangkeduo.com/images/2017-07-24/835ecfa4819bd7188123aaaf9a225c81.jpeg","priority":7,"height":453,"width":640},{"goods_id":6042651,"type":1,"id":1085613970,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/a87c8fb3a35fad5555634ea2ebe50285.jpeg","priority":6,"height":480,"width":480},{"goods_id":6042651,"type":1,"id":1085613969,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/e4fb954ecb9d7c3a8145b8c6ae94fe93.jpeg","priority":5,"height":480,"width":480},{"goods_id":6042651,"type":1,"id":1085613968,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/ef761cbe435fdb664891bb6f0dd6b91e.jpeg","priority":4,"height":480,"width":480},{"goods_id":6042651,"type":1,"id":1085613967,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/91bf8324f11a2f90aacee92617bf91c8.jpeg","priority":3,"height":480,"width":480},{"goods_id":6042651,"type":1,"id":1085613966,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/1f4c187ff9ffeceaa31b014d00105718.jpeg","priority":2,"height":480,"width":480},{"goods_id":6042651,"type":1,"id":1085613965,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/b2a50f80aba06b30f7c96cc3ab54acc5.jpeg","priority":1,"height":480,"width":480},{"goods_id":6042651,"type":1,"id":1085613964,"url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/bd01b3878fbda99ba5c744df1cb951b8.jpeg","priority":0,"height":480,"width":480}]
     * sku : [{"sold_quantity":92979,"price":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-07/202e50e3d262b90faaafaf0a81d95285.jpeg","limit_quantity":999,"weight":0,"specs":[{"spec_value":"8斤","spec_key":"容量"}],"market_price":0,"group_price":1990,"goods_id":6042651,"normal_price":2190,"spec":"471480","quantity":2020,"sku_id":150020405,"init_quantity":0,"is_onsale":1},{"sold_quantity":235047,"price":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-07/7c958ce45f3ab069130bdc5909dc37da.jpeg","limit_quantity":999,"weight":0,"specs":[{"spec_value":"5斤","spec_key":"容量"}],"market_price":0,"group_price":1290,"goods_id":6042651,"normal_price":1790,"spec":"187941","quantity":-48,"sku_id":150020406,"init_quantity":0,"is_onsale":1}]
     * thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-06-02/ce15bac34763ddbc8d1409296ffb9441.jpeg
     * event_type : 0
     * is_pre_sale : 0
     * goods_desc : 【坏果包赔】华盛绿能广西南宁仓发货，每天摘新鲜的发货，现正当季，最好吃的时候（ps果果都是发七成熟的，收到果果没有熟放在箱内几天即可哟）。广西小台农芒果外型长而滚圆，小巧可爱，颜色鹅黄悦目，果肉肥而香甜，浓浓的果香伴随入口顺滑的口感，色、香、味俱佳，肉厚核薄味美，只有像一小片纸一样的核。存放久的芒果身上会有些黑斑，不影响食用，味道会更甜，满意给予5星好评。，无膨大剂，果子较小，介意慎拍！，无膨大剂，果子较小，介意慎拍！，无膨大剂，果子较小，介意慎拍！
     * sales : 328990
     * goods_id : 6042651
     * cat_id_3 : 125
     * group : [{"price":0,"group_id":12090124,"id":12090124,"start_time":1451577600,"end_time":2082729600,"is_open":1,"order_limit":5,"customer_num":1,"buy_limit":5,"goods_id":6042651,"duration":86400},{"price":0,"group_id":12090125,"id":12090125,"start_time":1451577600,"end_time":2082729600,"is_open":1,"order_limit":5,"customer_num":2,"buy_limit":5,"goods_id":6042651,"duration":86400}]
     * allowed_region : 2,3,4,6,7,8,10,11,13,14,16,17,22,23,24,25,26,27,30,31,32
     * quick_refund : 1
     * goods_sn : 1704263794828613
     * image_url : http://omsproductionimg.yangkeduo.com/images/2017-06-02/c591370512f1d14c96d72ab383b5d153.jpeg
     * gpv : 2
     * max_normal_price : 2890
     * goods_name : 广西小台农芒果5斤/8斤（单果50-150g）丨个头迷你 核薄肉嫩
     * cat_id : 125
     * is_mall_rec : 1
     * cat_id_1 : 83
     * max_on_sale_group_price : 1990
     * max_on_sale_normal_price : 2190
     * cat_id_2 : 84
     * hd_thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-06-02/19eaf450a2105554dc6d8cb7926cb5de.jpeg
     * show_rec : 1
     * shipment_limit_second : 86400
     * share_desc : 【坏果包赔】华盛绿能广西南宁仓发货，每天摘新鲜的发货，现正当季，最好吃的时候（ps果果都是发七成熟的，收到果果没有熟放在箱内几天即可哟）。广西小台农芒果外型长而滚圆，小巧可爱，颜色鹅黄悦目，果肉肥而香甜，浓浓的果香伴随入口顺滑的口感，色、香、味俱佳，肉厚核薄味美，只有像一小片纸一样的核。存放久的芒果身上会有些黑斑，不影响食用，味道会更甜，满意给予5星好评。，无膨大剂，果子较小，介意慎拍！，无膨大剂，果子较小，介意慎拍！，无膨大剂，果子较小，介意慎拍！
     * country :
     * tag : 3
     * pre_sale_time : 0
     * service_promise : [{"type":"全场包邮","desc":"所有商品均无条件包邮"},{"type":"坏果包赔","desc":"若收到的水果破损腐烂，可获相应金额的赔偿"},{"type":"果重保证","desc":"若收到的水果重量与描述不符，可获相应金额的赔偿"},{"type":"闪电退款","desc":"商家将在退款申请通过后24小时内完成退款"},{"type":"24小时发货","desc":"若超时未发货，商家将补偿3元无门槛代金券"},{"type":"假一赔十","desc":"若收到的商品是假冒品牌，可获得加倍赔偿"}]
     * is_folt : 1
     * min_group_price : 1290
     * is_app : 0
     * max_group_price : 2690
     * is_installment : 0
     * skip_goods : 0
     * server_time : 1502935234
     * goods_type : 1
     * min_normal_price : 1790
     * cost_template_id : 989472
     * warehouse :
     * min_on_sale_normal_price : 2190
     * rv : 0
     * min_on_sale_group_price : 1990
     * market_price : 4900
     * rv_image : 0
     * is_refundable : 0
     * mall_id : 22347
     * is_onsale : 1
     */

    public String thumb_url;
    public int event_type;
    public int is_pre_sale;
    public String goods_desc;
    public int sales;
    public int goods_id;
    public int cat_id_3;
    public String allowed_region;
    public int quick_refund;
    public String goods_sn;
    public String image_url;
    public int gpv;
    public int max_normal_price;
    public String goods_name;
    public int cat_id;
    public int is_mall_rec;
    public int cat_id_1;
    public int max_on_sale_group_price;
    public int max_on_sale_normal_price;
    public int cat_id_2;
    public String hd_thumb_url;
    public int show_rec;
    public int shipment_limit_second;
    public String share_desc;
    public String country;
    public int tag;
    public int pre_sale_time;
    public int is_folt;
    public int min_group_price;
    public int is_app;
    public int max_group_price;
    public int is_installment;
    public String skip_goods;
    public int server_time;
    public int goods_type;
    public int min_normal_price;
    public int cost_template_id;
    public String warehouse;
    public int min_on_sale_normal_price;
    public int rv;
    public int min_on_sale_group_price;
    public int market_price;
    public int rv_image;
    public int is_refundable;
    public int mall_id;
    public int is_onsale;
    public List<GalleryBean> gallery;
    public List<SkuBean> sku;
    public List<GroupBean> group;
    public List<ServicePromiseBean> service_promise;

    public static ClassifyDetailsResponse objectFromData(String str) {

        return new Gson().fromJson(str, ClassifyDetailsResponse.class);
    }

    public static ClassifyDetailsResponse objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ClassifyDetailsResponse.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static class GalleryBean implements Serializable{
        /**
         * goods_id : 6042651
         * type : 2
         * id : 1085613981
         * url : http://omsproductionimg.yangkeduo.com/images/2017-06-02/19235e6bd35165297f11a404abb781d9.jpeg
         * priority : 17
         * height : 1294
         * width : 640
         */

        public int goods_id;
        public int type;
        public int id;
        public String url;
        public int priority;
        public int height;
        public int width;

        public static GalleryBean objectFromData(String str) {

            return new Gson().fromJson(str, GalleryBean.class);
        }

        public static GalleryBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), GalleryBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }
    }

    public static class SkuBean implements Serializable{
        /**
         * sold_quantity : 92979
         * price : 0
         * thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-06-07/202e50e3d262b90faaafaf0a81d95285.jpeg
         * limit_quantity : 999
         * weight : 0
         * specs : [{"spec_value":"8斤","spec_key":"容量"}]
         * market_price : 0
         * group_price : 1990
         * goods_id : 6042651
         * normal_price : 2190
         * spec : 471480
         * quantity : 2020
         * sku_id : 150020405
         * init_quantity : 0
         * is_onsale : 1
         */

        public int sold_quantity;
        public int price;
        public String thumb_url;
        public int limit_quantity;
        public int weight;
        public int market_price;
        public int group_price;
        public int goods_id;
        public int normal_price;
        public String spec;
        public int quantity;
        public int sku_id;
        public int init_quantity;
        public int is_onsale;
        public List<SpecsBean> specs;

        public static SkuBean objectFromData(String str) {

            return new Gson().fromJson(str, SkuBean.class);
        }

        public static SkuBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), SkuBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static class SpecsBean implements Serializable{
            /**
             * spec_value : 8斤
             * spec_key : 容量
             */

            public String spec_value;
            public String spec_key;

            public static SpecsBean objectFromData(String str) {

                return new Gson().fromJson(str, SpecsBean.class);
            }

            public static SpecsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), SpecsBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }
        }
    }

    public static class GroupBean implements Serializable{
        /**
         * price : 0
         * group_id : 12090124
         * id : 12090124
         * start_time : 1451577600
         * end_time : 2082729600
         * is_open : 1
         * order_limit : 5
         * customer_num : 1
         * buy_limit : 5
         * goods_id : 6042651
         * duration : 86400
         */

        public int price;
        public int group_id;
        public int id;
        public int start_time;
        public int end_time;
        public int is_open;
        public int order_limit;
        public int customer_num;
        public int buy_limit;
        public int goods_id;
        public int duration;

        public static GroupBean objectFromData(String str) {

            return new Gson().fromJson(str, GroupBean.class);
        }

        public static GroupBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), GroupBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }
    }

    public static class ServicePromiseBean implements Serializable{
        /**
         * type : 全场包邮
         * desc : 所有商品均无条件包邮
         */

        public String type;
        public String desc;

        public static ServicePromiseBean objectFromData(String str) {

            return new Gson().fromJson(str, ServicePromiseBean.class);
        }

        public static ServicePromiseBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ServicePromiseBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }
    }
}
