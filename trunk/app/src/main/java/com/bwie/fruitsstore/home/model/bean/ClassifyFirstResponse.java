package com.bwie.fruitsstore.home.model.bean;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;

/**
 * 类用途 :分类一级列表数据
 * 作者 : 郁文涛
 * 时间 : 2017/8/8 14:23
 */

public class ClassifyFirstResponse implements Serializable{

    /**
     * server_time : 1502250676
     * goods_list : [{"normal_price":1690,"cnt":449376,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-20/e85490a99dc9db60cc6214a319249e8a.jpeg","event_type":0,"market_price":1690,"goods_name":"骞胯タ鐧捐壊灏忓彴鍐滆姃鏋�5鏂/8鏂ゅ崟鏋滐紙50-150g锛夋牳灏忚倝鍘� 鏋滈娴撻儊","goods_id":10039371,"short_name":"骞胯タ鐧捐壊灏忓彴鍐滆姃鏋�5鏂/8鏂ゅ崟鏋滐紙50-150g锛夋牳灏忚倝鍘� 鏋滈娴撻儊","group":{"customer_num":2,"price":1290},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-20/74d27d7c2660ab51c575b2ea7bcf633d.jpeg"},{"normal_price":1890,"cnt":21834,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/758f2c9b69bef8ddf1f14326aab18e4a.jpeg","event_type":0,"market_price":1890,"goods_name":"銆愯仛椴滅編瀹\u20ac戝北涓滅儫鍙版爾闇炵孩瀵屽＋鑻规灉5鏂わ紙鏋滃緞80-90mm锛夋柊椴滄按鏋滆剢鐢滃姹佹爾闇炲湴鏍囦骇鍝�","goods_id":28536524,"short_name":"銆愯仛椴滅編瀹\u20ac戝北涓滅儫鍙版爾闇炵孩瀵屽＋鑻规灉5鏂わ紙鏋滃緞80-90mm锛夋柊椴滄按鏋滆剢鐢滃姹佹爾闇炲湴鏍囦骇鍝�","group":{"customer_num":2,"price":1690},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/3b607698039a922ebe0f02b172a2f1d6.jpeg"},{"normal_price":1990,"cnt":179241,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/9ca79a99c6d4868e3c99563fad225c56.jpeg","event_type":0,"market_price":1990,"goods_name":"銆愯秺鍗楄繘鍙ｃ\u20ac戦潚鑺掓灉5鏂/8鏂わ紙鍗曟灉150-400g锛変釜澶ф牳钖�","goods_id":1911272,"short_name":"闈掕姃鏋�5鏂/8鏂わ紙鍗曟灉150-400g锛変釜澶ф牳钖�","group":{"customer_num":2,"price":1890},"tag":3,"country":"瓒婂崡","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-03/7594db2bcf8a54900ca931640915bbc9.jpeg"},{"normal_price":2880,"cnt":128975,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-13/81d99d05c15dfaf71fe0220d7daf7bbd.jpeg","event_type":13,"market_price":2880,"goods_name":"灞变笢鐑熷彴鏍栭湠绾㈠瘜澹嫻鏋滀笉鎵撹厞5鏂ゅ寘閭\u20ac愭灉寰�80-90mm銆� 鑴嗙敎澶氭眮 浜у湴鐩村彂","goods_id":10721133,"short_name":"灞变笢鐑熷彴鏍栭湠绾㈠瘜澹嫻鏋滀笉鎵撹厞5鏂ゅ寘閭\u20ac愭灉寰�80-90mm銆� 鑴嗙敎澶氭眮 浜у湴鐩村彂","group":{"customer_num":2,"price":1690},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-13/d07b0d1009886237dde0a7f7e25aa9e7.jpeg"},{"normal_price":7900,"cnt":22744,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-29/78459a808337bb99e5246863e318f111.jpeg","event_type":0,"market_price":7900,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戞嘲鍥介噾鏋曟Υ鑾� 3鏂�-10鏂ゅ瑙勬牸鍙\u20ac� 鏂伴矞姘存灉 閲戞灂澶淬\u20ac愰鍞細8鏈�12鏃ュ彂瀹屻\u20ac�","goods_id":4190759,"short_name":"娉板浗閲戞灂姒磋幉 3鏂�-10鏂ゅ瑙勬牸鍙\u20ac� 鏂伴矞姘存灉 閲戞灂澶�","group":{"customer_num":2,"price":5500},"tag":-1,"country":"娉板浗","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-29/6cf31ad3d02b03a5e1a0639f66724db3.jpeg"},{"normal_price":3480,"cnt":8095,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-06/65865973c86b4079ad2ccfc5864aef3a.jpeg","event_type":0,"market_price":3480,"goods_name":"骞胯タ鐧捐壊鑺掓灉灏忓彴鍐滆姃 鑺掓灉8鏂よ锛堝崟鏋滈噸50-100g锛�","goods_id":48311103,"short_name":"骞胯タ鐧捐壊鑺掓灉灏忓彴鍐滆姃 鑺掓灉8鏂よ锛堝崟鏋滈噸50-100g锛�","group":{"customer_num":2,"price":1950},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-06/eb9e5a84d5dab2703861dd99d46172b8.jpeg"},{"normal_price":1300,"cnt":31439,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/1ce91318bd623996d28074aee23a91fe.jpeg","event_type":0,"market_price":1300,"goods_name":"灞变笢缇庡懗榛勬5鏂/4鏂/3鏂� 鍗曟灉150-200g 鏂伴矞姘存灉 鏋滆倝缁嗚吇 鏋滈娴撻儊 浜у湴鍙戣揣","goods_id":26513694,"short_name":"灞变笢缇庡懗榛勬5鏂/4鏂/3鏂� 鍗曟灉150-200g 鏂伴矞姘存灉 鏋滆倝缁嗚吇 鏋滈娴撻儊 浜у湴鍙戣揣","group":{"customer_num":2,"price":1190},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/b74d6ed2ddba07a7e56c1cf416fbb1b8.jpeg"},{"normal_price":1990,"cnt":97077,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-04/ef7bc8f7a84b052fb89602a35e9f67a6.jpeg","event_type":0,"market_price":1990,"goods_name":"鏉ヨ嚜鍗庡北鑴氫笅鐨勯潚鐨牳妗� 椴滄牳妗� 5鏂/9鏂よ锛堝崟鏋滄灉寰�30-50mm锛� 鍧氭灉钖勭毊鏍告 瀛曞棣栭\u20ac�","goods_id":16032160,"short_name":"鏉ヨ嚜鍗庡北鑴氫笅鐨勯潚鐨牳妗� 椴滄牳妗� 5鏂/9鏂よ锛堝崟鏋滄灉寰�30-50mm锛� 鍧氭灉钖勭毊鏍告 瀛曞棣栭\u20ac�","group":{"customer_num":2,"price":1490},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-11/572e7bf33ecbf5dd1ad20a834364668e.jpeg"},{"normal_price":1890,"cnt":38843,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-04/919c56a3a10d2473be1dbb873e19949f.jpeg","event_type":0,"market_price":1890,"goods_name":"姝ｅ畻鏂扮枂鍝堝瘑鐡�1涓锛�6-8鏂�)/锛�5-6鏂わ級/(4-5鏂�)鑲夊帤璐ㄧ粏 娓呯敎澶氭眮 澶氳鏍�","goods_id":24438021,"short_name":"姝ｅ畻鏂扮枂鍝堝瘑鐡�1涓锛�6-8鏂�)/锛�5-6鏂わ級/(4-5鏂�)鑲夊帤璐ㄧ粏 娓呯敎澶氭眮 澶氳鏍�","group":{"customer_num":2,"price":1690},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-24/8367159343b0c71014abaaa152473ee4.jpeg"},{"normal_price":2990,"cnt":8419,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/dda75101389df8cfea10063c3a6242d9.jpeg","event_type":13,"market_price":2990,"goods_name":"绾㈠績鐚曠尨妗冨寮傛灉绮鹃\u20ac夊ぇ鏋�10涓猏/鍗曟灉90-110g 绮鹃\u20ac夊ぇ鏋�3鏂/鍗曟灉110g浠ヤ笂","goods_id":44542265,"short_name":"绾㈠績鐚曠尨妗冨寮傛灉绮鹃\u20ac夊ぇ鏋�10涓猏/鍗曟灉90-110g 绮鹃\u20ac夊ぇ鏋�3鏂/鍗曟灉110g浠ヤ笂","group":{"customer_num":2,"price":2690},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/d1c3b6af12f1defe3e302466aed2fd3c.jpeg"},{"normal_price":2690,"cnt":23541,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-10/3657881d7cbb99876c8091eeb40e34f6.jpeg","event_type":0,"market_price":2690,"goods_name":"骞胯タ鐧捐壊灏忓彴鍐滆姃鏋� 8鏂よ鍗曟灉锛�50-150g锛夋牳灏忚倝鍘� 鏋滈娴撻儊","goods_id":10412137,"short_name":"骞胯タ鐧捐壊灏忓彴鍐滆姃鏋� 8鏂よ鍗曟灉锛�50-150g锛夋牳灏忚倝鍘� 鏋滈娴撻儊","group":{"customer_num":2,"price":1990},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-10/0c18e9d7dc43c343870aed9726fdcb0e.jpeg"},{"normal_price":9900,"cnt":5548,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-03/86789a7eb3d71dbb98b6f138d6e6d0ef.jpeg","event_type":0,"market_price":9900,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戞嘲鍥介噾鏋曟Υ鑾� 澶ф灉 5-10鏂ゅ瑙勬牸鍙\u20ac� 1-2绮掕 棣欑敎杞朝 鏋滆倝閲戦粍銆愰鍞細8鏈�12鏃ュ彂瀹屻\u20ac�","goods_id":4190760,"short_name":"娉板浗閲戞灂姒磋幉 澶ф灉 5-10鏂ゅ瑙勬牸鍙\u20ac� 1-2绮掕 棣欑敎杞朝 鏋滆倝閲戦粍","group":{"customer_num":2,"price":7900},"tag":-1,"country":"娉板浗","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-29/c624c8b7dbf71c473946d6808358ad4f.jpeg"},{"normal_price":1990,"cnt":39565,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-24/fdaf8b010311bc01bf555888a8047b91.jpeg","event_type":0,"market_price":1990,"goods_name":"闄曡タ榛戝竷鏋楁潕瀛�5鏂/8鏂よ锛堝崟鏋�100-120G锛�","goods_id":13188681,"short_name":"闄曡タ榛戝竷鏋楁潕瀛�5鏂/8鏂よ锛堝崟鏋�100-120G锛�","group":{"customer_num":2,"price":1680},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-04/d555233f4dc60d47954dd5b8fd094529.jpeg"},{"normal_price":1790,"cnt":26647,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-19/df8febb132a5ef19a4fe5dfb2340fd89.jpeg","event_type":0,"market_price":1790,"goods_name":"骞胯タ鐧鹃鏋� 10/20/30涓彲閫� 涓ぇ鏋�70-100g 瓒婄毐鐨秺棣欑敎","goods_id":550340,"short_name":"骞胯タ鐧鹃鏋� 10/20/30涓彲閫� 涓ぇ鏋�70-100g 瓒婄毐鐨秺棣欑敎","group":{"customer_num":2,"price":1690},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/8c581a0f93732b44c7e815a41c5c19ff.jpeg"},{"normal_price":2290,"cnt":19157,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/a0fbf45c68d957a319a70ce1e53e7efe.jpeg","event_type":0,"market_price":2290,"goods_name":"闄曡タ缁垮績鐚曠尨妗冨ぇ鏋�15绮掞紙鍗曟灉110-125g锛夋\u20ac婚噸涓嶅皯浜�1600g 娓呴鍙彛 娴撻儊閰哥敎","goods_id":401251,"short_name":"闄曡タ缁垮績鐚曠尨妗冨ぇ鏋�15绮掞紙鍗曟灉110-125g锛夋\u20ac婚噸涓嶅皯浜�1600g 娓呴鍙彛 娴撻儊閰哥敎","group":{"customer_num":2,"price":1990},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-02/0f677c00519babade2e6f29ec150d55b.jpeg"},{"normal_price":1690,"cnt":46577,"thumb_url":"http://testpddimg.yangkeduo.com/goods/d41d8cd98f69d9b1e7f724f39a9726d8175a6cc204.jpg","event_type":0,"market_price":1690,"goods_name":"銆愯\u20ac佹対杩涘彛銆戞柊椴滆\u20ac佹対鐗涘ザ绾㈠績鏈ㄧ摐5鏂/8鏂わ紙鍗曟灉400g-1000g锛夊瑙勬牸鍙\u20ac�","goods_id":34715,"short_name":"鏂伴矞鑰佹対鐗涘ザ绾㈠績鏈ㄧ摐5鏂/8鏂わ紙鍗曟灉400g-1000g锛夊瑙勬牸鍙\u20ac�","group":{"customer_num":2,"price":1290},"tag":3,"country":"鑰佹対","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-22/8de481f8c90531b1c6a43afea31c7a24.jpeg"},{"normal_price":1090,"cnt":177421,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-26/182e6d8aef245cec7c0fe1fe0e9c4d95.jpeg","event_type":0,"market_price":1090,"goods_name":"娴峰崡闈掓煚妾� 鏂伴矞闈掔毊鏌犳8涓猏/16涓紙鍗曟灉64g-100g 锛夋灉鍥幇鎽� 濂崇鏈\u20ac鐖�","goods_id":11760,"short_name":"娴峰崡闈掓煚妾� 鏂伴矞闈掔毊鏌犳8涓猏/16涓紙鍗曟灉64g-100g 锛夋灉鍥幇鎽� 濂崇鏈\u20ac鐖�","group":{"customer_num":2,"price":790},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-26/ed953d5548df289e1d50acfcffbb63d5.jpeg"},{"normal_price":10800,"cnt":24624,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-10/cbb54ff3edfba640d63491825e9f6554.jpeg","event_type":0,"market_price":10800,"goods_name":"銆愬姞鍐拌淇濋矞鍙戣揣銆� 绾㈢毊鏂伴矞鏃犺姳鏋滃ぇ鏋�1500g 鍗曟灉40-100鍏� 杞朝缁靛瘑 娓呯敎鐢樼編","goods_id":465407,"short_name":"銆愬姞鍐拌淇濋矞鍙戣揣銆� 绾㈢毊鏂伴矞鏃犺姳鏋滃ぇ鏋�1500g 鍗曟灉40-100鍏� 杞朝缁靛瘑 娓呯敎鐢樼編","group":{"customer_num":2,"price":3990},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-10/0baebd54f577c72ab045de54bebc225c.jpeg"},{"normal_price":1480,"cnt":395673,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/de7a1a7c5579d1d9b3ec29dfeabbf75e.jpeg","event_type":0,"market_price":1480,"goods_name":"銆愪拱2鍑�3銆戝洓宸濆畨宀虫煚妾�7涓锛堝崟鏋�65-85g锛� 涓\u20ac澶╀竴涓笉娴垂涓ㄧ毊钖勫姹�","goods_id":1711345,"short_name":"銆愪拱2鍑�3銆戝洓宸濆畨宀虫煚妾�7涓锛堝崟鏋�65-85g锛� 涓\u20ac澶╀竴涓笉娴垂涓ㄧ毊钖勫姹�","group":{"customer_num":2,"price":1290},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-06/390f07cef52c3e5579fcbf072e09713a.jpeg"},{"normal_price":2090,"cnt":201620,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-27/fc32e9bb8850705fb3f5548d504dff43.jpeg","event_type":0,"market_price":2090,"goods_name":"鐜版憳闄曡タ鑴嗙敎鏉庡瓙 5-8鏂よ 銆愬崟鏋�100g-160g銆戦粦甯冩灄 棣欑敎鍙彛 鏂伴矞鏃朵护姘存灉","goods_id":13796332,"short_name":"鐜版憳闄曡タ鑴嗙敎鏉庡瓙 5-8鏂よ 銆愬崟鏋�100g-160g銆戦粦甯冩灄 棣欑敎鍙彛 鏂伴矞鏃朵护姘存灉","group":{"customer_num":2,"price":1980},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-27/542a77c80a3543f01ada06bc8d29ec4c.jpeg"},{"normal_price":3790,"cnt":12313,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-16/136d88189202262bb3ffbcc5f57ba51e.jpeg","event_type":0,"market_price":3790,"goods_name":"銆愭境澶у埄浜氳繘鍙ｃ\u20ac戞境姗� 10绮掕(鍗曟灉150-180鍏嬶級 澶氭眮鍛崇敎鐖藉彛姒ㄦ眮棣栭\u20ac夊瓡濡囧繀澶囨按鏋滀赴瀵孷C鍚噺","goods_id":11157764,"short_name":"婢虫 10绮掕(鍗曟灉150-180鍏嬶級 澶氭眮鍛崇敎鐖藉彛姒ㄦ眮棣栭\u20ac夊瓡濡囧繀澶囨按鏋滀赴瀵孷C鍚噺","group":{"customer_num":2,"price":2840},"tag":-1,"country":"婢冲ぇ鍒╀簹","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-05/0c17565cbcb84ce357cc3664329576fb.jpeg"},{"normal_price":1290,"cnt":52846,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-17/f13af7c221c9e3f4380fc51c71df7622.jpeg","event_type":13,"market_price":1290,"goods_name":"鑵炬牸閲屾矙婕犳皯鍕よ湝鐡滈噾绾㈠疂锛�3-4鏂わ級锛�5-6鏂わ級锛�6-8鏂わ級 鐢滅摐鏂伴矞姘存灉棣欑摐鐢滃害瓒呮柊鐤嗗搱瀵嗙摐(鍗曟灉2.5-4鏂�)","goods_id":11113404,"short_name":"鑵炬牸閲屾矙婕犳皯鍕よ湝鐡滈噾绾㈠疂锛�3-4鏂わ級锛�5-6鏂わ級锛�6-8鏂わ級 鐢滅摐鏂伴矞姘存灉棣欑摐鐢滃害瓒呮柊鐤嗗搱瀵嗙摐(鍗曟灉2.5-4鏂�)","group":{"customer_num":2,"price":990},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-17/5707677c4e08b1db902adeaf24ef760c.jpeg"},{"normal_price":1490,"cnt":379226,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/c196b24febf3dea4270b098b3baa7b80.jpeg","event_type":0,"market_price":1490,"goods_name":"銆愬崕鐩涘お闃宠兘鍐滃簞銆戝箍瑗垮皬鍙板啘鑺掓灉5鏂/8鏂わ紙鍗曟灉50-150g锛変辅涓ご杩蜂綘 鏍歌杽鑲夊 鐑甫鏂伴矞姘存灉","goods_id":7262153,"short_name":"銆愬崕鐩涘お闃宠兘鍐滃簞銆戝箍瑗垮皬鍙板啘鑺掓灉5鏂/8鏂わ紙鍗曟灉50-150g锛変辅涓ご杩蜂綘 鏍歌杽鑲夊 鐑甫鏂伴矞姘存灉","group":{"customer_num":2,"price":1290},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/accd472c10bfd50669087aa11ba80dea.jpeg"},{"normal_price":2190,"cnt":18773,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-11/b36784ed5855d961f2cfafd430c7214d.jpeg","event_type":0,"market_price":2190,"goods_name":"鏀\u20ac鏋濊姳鍑壒鑺掓灉5鏂/8鏂わ紙鍗曟灉400g-1500g/鍗曟灉700-1500g锛� 鑳滅埍鏂囬鐜夎姃鍚夌璐靛閲戠厡楣板槾鑻规灉灏忛潚鑺�","goods_id":20872031,"short_name":"鏀\u20ac鏋濊姳鍑壒鑺掓灉5鏂/8鏂わ紙鍗曟灉400g-1500g/鍗曟灉700-1500g锛� 鑳滅埍鏂囬鐜夎姃鍚夌璐靛閲戠厡楣板槾鑻规灉灏忛潚鑺�","group":{"customer_num":2,"price":1650},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-11/626d07e03245fabcd88a94dcf163c5ce.jpeg"},{"normal_price":2680,"cnt":14437,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-06/34b0c4ced5ff76cc8b17ab5f2092e661.jpeg","event_type":0,"market_price":2680,"goods_name":"鏀\u20ac鏋濊姳鑺掓灉 鍑壒鑺掓灉 澶ц姃鏋� 5鏂/8鏂よ锛堝崟鏋�400-2000g锛夋柊椴滆姃鏋� 闈炲悏绂勫ぇ闈掕姃鏋滃寘閭�","goods_id":14485257,"short_name":"鏀\u20ac鏋濊姳鑺掓灉 鍑壒鑺掓灉 澶ц姃鏋� 5鏂/8鏂よ锛堝崟鏋�400-2000g锛夋柊椴滆姃鏋� 闈炲悏绂勫ぇ闈掕姃鏋滃寘閭�","group":{"customer_num":2,"price":1790},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-06/8ee6ce222c6e3157473ca1265ba871c5.jpeg"},{"normal_price":2490,"cnt":16640,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-18/1e3c7df5dbdbba16e771a98300320f12.jpeg","event_type":13,"market_price":2490,"goods_name":"鐜版憳榛勫湡楂樺師鏂伴矞鑴嗘10鏂� 鍗曟灉130-260g 灞辫タ姣涙瀛愭按鏋� 闈為檿瑗挎箹鍖楅粍妗冩补妗冭妗冩按铚滄","goods_id":20927828,"short_name":"鐜版憳榛勫湡楂樺師鏂伴矞鑴嗘10鏂� 鍗曟灉130-260g 灞辫タ姣涙瀛愭按鏋� 闈為檿瑗挎箹鍖楅粍妗冩补妗冭妗冩按铚滄","group":{"customer_num":2,"price":2090},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-18/ed02b6cdf1629ba8e772833835350225.jpeg"},{"normal_price":990,"cnt":49994,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-27/9525c1a1a9b5cecac182e7740df07fa1.jpeg","event_type":13,"market_price":990,"goods_name":"榛勬缃愬ご姘存灉缃愬ご 2缃怽/3缃怽/5缃� 鍗曠綈425g 澶氳鏍煎彲閫夊嚭鍙ｅ搧璐� 缇庡懗鍋ュ悍","goods_id":7457594,"short_name":"榛勬缃愬ご姘存灉缃愬ご 2缃怽/3缃怽/5缃� 鍗曠綈425g 澶氳鏍煎彲閫夊嚭鍙ｅ搧璐� 缇庡懗鍋ュ悍","group":{"customer_num":2,"price":890},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-27/4d63147439e742540103a4347a70508b.jpeg"},{"normal_price":2280,"cnt":15064,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-04/c26c4b9063fcf49ed2e24ef32c043d26.jpeg","event_type":0,"market_price":2280,"goods_name":"銆愯秺鍗楄繘鍙ｃ\u20ac戣秺鍗楃櫧蹇冪伀榫欐灉5鏂よ锛�5-8涓� 鍗曟灉300-500g锛夐吀鐢滃彲鍙�","goods_id":16647299,"short_name":"瓒婂崡鐧藉績鐏緳鏋�5鏂よ锛�5-8涓� 鍗曟灉300-500g锛夐吀鐢滃彲鍙�","group":{"customer_num":2,"price":1960},"tag":3,"country":"瓒婂崡","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-12/b601d61b751385dd6494b14921041c4e.jpeg"},{"normal_price":2880,"cnt":13384,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-14/6f87f3eb919ac9cfa95e8a689fe6dc2f.jpeg","event_type":0,"market_price":2880,"goods_name":"鏀\u20ac鏋濊姳澶у嚡鐗硅姃鏋�5鏂/8鏂わ紙鍗曟灉400-2000g锛変辅涓ぇ楗辨弧 鍙ｆ劅鐖芥粦","goods_id":2108361,"short_name":"鏀\u20ac鏋濊姳澶у嚡鐗硅姃鏋�5鏂/8鏂わ紙鍗曟灉400-2000g锛変辅涓ぇ楗辨弧 鍙ｆ劅鐖芥粦","group":{"customer_num":2,"price":1690},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-14/06708d394fde6f5cbd6c29eaecd3c9bc.jpeg"},{"normal_price":1790,"cnt":6088,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-29/eb72b3f73d0730f2fe806e51dfbafd0f.jpeg","event_type":0,"market_price":1790,"goods_name":"榛勫湡楂樺師棣欓叆姊�5鏂/10鏂� 鍗曟灉100-300g 婧愯嚜搴撳皵鍕掗姊ㄧ孩棣欓叆姊ㄨ儹鑴傛ⅷ闈為洩姊ㄧ殗鍐犳ⅷ涓版按姊ㄧ孩鍟ゆⅷ闈掑暏姊�","goods_id":36161311,"short_name":"榛勫湡楂樺師棣欓叆姊�5鏂/10鏂� 鍗曟灉100-300g 婧愯嚜搴撳皵鍕掗姊ㄧ孩棣欓叆姊ㄨ儹鑴傛ⅷ闈為洩姊ㄧ殗鍐犳ⅷ涓版按姊ㄧ孩鍟ゆⅷ闈掑暏姊�","group":{"customer_num":2,"price":1490},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-29/589e023447856aa52718b1eb9f24fe5e.jpeg"},{"normal_price":10500,"cnt":7203,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-03/da7375d7d17ac06a6ad71d51b897a789.jpeg","event_type":0,"market_price":10500,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戞嘲鍥介噾鏋曟Υ鑾�3-10鏂ゅ瑙勬牸鍙\u20ac� 棣欑敎娴撻儊 钀ュ吇涓板瘜","goods_id":4608944,"short_name":"娉板浗閲戞灂姒磋幉3-10鏂ゅ瑙勬牸鍙\u20ac� 棣欑敎娴撻儊 钀ュ吇涓板瘜","group":{"customer_num":2,"price":7600},"tag":3,"country":"娉板浗","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-09/e24a536ed4e5006c7024877e6a8a8891.jpeg"},{"normal_price":8900,"cnt":6123,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-30/0ab5d71d563ceb34996a7c176acd20dc.jpeg","event_type":0,"market_price":8900,"goods_name":"銆愮編鍥借繘鍙ｃ\u20ac戝崕鐩涢】绌鸿繍杞﹀帢瀛�2鏂よ 鍗曟灉鏋滃緞26-28mm 椤轰赴鑸┖鍏ㄥ浗鍖呴偖","goods_id":14967256,"short_name":"鍗庣洓椤跨┖杩愯溅鍘樺瓙2鏂よ 鍗曟灉鏋滃緞26-28mm 椤轰赴鑸┖鍏ㄥ浗鍖呴偖","group":{"customer_num":2,"price":7290},"tag":3,"country":"缇庡浗","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-30/69eee5cf2f1998d51fa499f425c6a68a.jpeg"},{"normal_price":2090,"cnt":62293,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-02/2e10c763d91a03d16ed5f81bbb9a663b.jpeg","event_type":0,"market_price":2090,"goods_name":"娴峰崡榛勬煚妾� 鏂伴矞鏌犳8涓猏/16涓紙鍗曟灉65-85g锛夌毊钖勫姹� 濂崇鏈\u20ac鐖�","goods_id":931905,"short_name":"娴峰崡榛勬煚妾� 鏂伴矞鏌犳8涓猏/16涓紙鍗曟灉65-85g锛夌毊钖勫姹� 濂崇鏈\u20ac鐖�","group":{"customer_num":2,"price":1690},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-02/5c3da321e17570d635579d636aba577b.jpeg"},{"normal_price":2280,"cnt":29989,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/zytnzsZKD7JRHzMS0I0VKAqTvfFopy6r.jpg","event_type":0,"market_price":2280,"goods_name":"鍥涘窛瀹夊渤浼樿川鏌犳12涓锛堝崟鏋�85-105g锛変辅鍒囩墖娉℃按","goods_id":2535838,"short_name":"鍥涘窛瀹夊渤浼樿川鏌犳12涓锛堝崟鏋�85-105g锛変辅鍒囩墖娉℃按","group":{"customer_num":2,"price":1890},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-15/c301cb9906e310485ac303beae6db7eb.jpeg"},{"normal_price":1800,"cnt":9584,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/1ce91318bd623996d28074aee23a91fe.jpeg","event_type":13,"market_price":1800,"goods_name":"灞变笢缇庡懗榛勬5鏂� 鍗曟灉150-200g 鏂伴矞姘存灉 鏋滆倝缁嗚吇 鏋滈娴撻儊 浜у湴鍙戣揣","goods_id":41645526,"short_name":"灞变笢缇庡懗榛勬5鏂� 鍗曟灉150-200g 鏂伴矞姘存灉 鏋滆倝缁嗚吇 鏋滈娴撻儊 浜у湴鍙戣揣","group":{"customer_num":2,"price":1690},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/b74d6ed2ddba07a7e56c1cf416fbb1b8.jpeg"},{"normal_price":8900,"cnt":54861,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-15/e2f8ae390117cb1694e49b8b8690cf9b.jpeg","event_type":0,"market_price":8900,"goods_name":"銆愬ⅷ瑗垮摜杩涘彛銆戝法鏃犻湼鐗涙补鏋�5涓� 鍗曟灉200-240鍏�","goods_id":26803,"short_name":"宸ㄦ棤闇哥墰娌规灉5涓� 鍗曟灉200-240鍏�","group":{"customer_num":2,"price":4590},"tag":3,"country":"澧ㄨタ鍝�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-01/3655538fbacb5b4be5443dd2ca3ccba9.jpeg"},{"normal_price":2190,"cnt":17541,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-19/82e45effcaddf2cf11805d0124f363b1.jpeg","event_type":0,"market_price":2190,"goods_name":"鍘熶骇缇庡浗 绉﹀箔鐜版憳绾㈠暏姊�5鏂よ锛堝崟鏋�80鍏�-200鍏嬶級 鏀捐蒋鍚� 杞朝棣欑敎澶氭眮","goods_id":25522118,"short_name":"鍘熶骇缇庡浗 绉﹀箔鐜版憳绾㈠暏姊�5鏂よ锛堝崟鏋�80鍏�-200鍏嬶級 鏀捐蒋鍚� 杞朝棣欑敎澶氭眮","group":{"customer_num":2,"price":1990},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-19/fe9bc1bc722a8bf3e077c48d5140eb0c.jpeg"},{"normal_price":1890,"cnt":356364,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-02/1ee1a83d1c0f420211716c205a28ebd7.jpeg","event_type":0,"market_price":1890,"goods_name":"銆愯秺鍗楄繘鍙ｃ\u20ac戙\u20ac愯秺鐨辫秺鐢溿\u20ac戠櫨棣欐灉绮鹃\u20ac夊ぇ鏋�2鏂/3鏂/5鏂わ紙鍗曟灉50-100g锛変辅鐑甫姘存灉鏂伴矞瑗跨暘鑾查浮铔嬫灉銆愰鍞細8鏈�13鏃ュ彂瀹屻\u20ac�","goods_id":1893905,"short_name":"銆愯秺鐨辫秺鐢溿\u20ac戠櫨棣欐灉绮鹃\u20ac夊ぇ鏋�2鏂/3鏂/5鏂わ紙鍗曟灉50-100g锛変辅鐑甫姘存灉鏂伴矞瑗跨暘鑾查浮铔嬫灉","group":{"customer_num":2,"price":1690},"tag":-1,"country":"瓒婂崡","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-02/1a62070b54e768b57b6f5c0662463408.jpeg"},{"normal_price":3090,"cnt":20579,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-27/9003eafb525114a138d338db3e5badb4.jpeg","event_type":0,"market_price":3090,"goods_name":"鏀\u20ac鏋濊姳鍑壒鑺掓灉澶ц姃鏋�8鏂ゅ寘閭紙鍗曟灉400g-2000g锛夋按鏋滀箣鐜嬫柊椴滄按鏋滃ぇ鑺掓灉","goods_id":14229175,"short_name":"鏀\u20ac鏋濊姳鍑壒鑺掓灉澶ц姃鏋�8鏂ゅ寘閭紙鍗曟灉400g-2000g锛夋按鏋滀箣鐜嬫柊椴滄按鏋滃ぇ鑺掓灉","group":{"customer_num":2,"price":2990},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-27/b7eb82758dbde2c979f4679a635ec4b3.jpeg"},{"normal_price":2790,"cnt":2873,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-12/26bb7d71a956137f1a03e79b904cb88f.jpeg","event_type":0,"market_price":2790,"goods_name":"鏀\u20ac鏋濊姳鍑壒澶ц姃鏋�8鏂よ 鍗曟灉400g-2000g 鏍歌杽澶氳倝 棣欑敎澶氭眮 鏂伴矞姘存灉 鏂伴矞鐩磋揪","goods_id":41701621,"short_name":"鏀\u20ac鏋濊姳鍑壒澶ц姃鏋�8鏂よ 鍗曟灉400g-2000g 鏍歌杽澶氳倝 棣欑敎澶氭眮 鏂伴矞姘存灉 鏂伴矞鐩磋揪","group":{"customer_num":2,"price":2490},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-12/18899dd97b0eb29a54e200ecc474869e.jpeg"},{"normal_price":3280,"cnt":65664,"thumb_url":"http://testpddimg.yangkeduo.com/goods/d41d8cd98f86cbf6b73366e08e4b2d8bd15a623940.jpg","event_type":0,"market_price":3280,"goods_name":"鐑熷彴鑻规灉鏍栭湠绾㈠瘜澹嫻鏋滐紙鏋滃緞80-85MM锛�5鏂� 鏂伴矞姘存灉 鏂伴矞閲囨憳 鏃犱激鍒拌揣","goods_id":85228,"short_name":"鐑熷彴鑻规灉鏍栭湠绾㈠瘜澹嫻鏋滐紙鏋滃緞80-85MM锛�5鏂� 鏂伴矞姘存灉 鏂伴矞閲囨憳 鏃犱激鍒拌揣","group":{"customer_num":2,"price":2490},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-20/5c19bd744ab9e5de1a7c06722aada9f8.jpeg"},{"normal_price":2380,"cnt":30639,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-04/4e81de97f91da6174f516c5430429741.jpeg","event_type":0,"market_price":2380,"goods_name":"銆愰吀鐢滄竻棣欍\u20ac戠幇鎽橀檿瑗块潚鑻规灉姘存灉瀛曞姘存灉姒ㄦ眮缇庝綋 5鏂ゅ寘閭�15-20涓� 鍗曟灉閲�130g-220g 鍧忔灉鍖呰禂","goods_id":12598201,"short_name":"銆愰吀鐢滄竻棣欍\u20ac戠幇鎽橀檿瑗块潚鑻规灉姘存灉瀛曞姘存灉姒ㄦ眮缇庝綋 5鏂ゅ寘閭�15-20涓� 鍗曟灉閲�130g-220g 鍧忔灉鍖呰禂","group":{"customer_num":2,"price":1350},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-04/a14d97af848a232ea86c4276ba00f0ff.jpeg"},{"normal_price":3690,"cnt":13048,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-29/8c107a1b9cc099d4a5a686794569eef9.jpeg","event_type":0,"market_price":3690,"goods_name":"浜戝崡绾㈠績鐏緳鏋滀腑鏋�5鏂わ紙6-8涓锛夊崟鏋�300-400g 浼樿川姘存灉 椴滃澶氭眮","goods_id":14704266,"short_name":"浜戝崡绾㈠績鐏緳鏋滀腑鏋�5鏂わ紙6-8涓锛夊崟鏋�300-400g 浼樿川姘存灉 椴滃澶氭眮","group":{"customer_num":2,"price":3290},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-29/01e85dabe0a608b0213afa3e85da0d4d.jpeg"},{"normal_price":2290,"cnt":51692,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-10/51897272be8725ac9dd0a6afc0a5ce90.jpeg","event_type":0,"market_price":2290,"goods_name":"娴峰崡鏂伴矞绾㈠績鏈ㄧ摐姘存灉鏂伴矞5鏂/8鏂ゅ寘閭啺绯栨湪鐡滅墰濂堕潚鏈ㄧ摐鏂伴矞(鍗曟灉700-1400g)姘存灉鐢熼矞","goods_id":5077513,"short_name":"娴峰崡鏂伴矞绾㈠績鏈ㄧ摐姘存灉鏂伴矞5鏂/8鏂ゅ寘閭啺绯栨湪鐡滅墰濂堕潚鏈ㄧ摐鏂伴矞(鍗曟灉700-1400g)姘存灉鐢熼矞","group":{"customer_num":2,"price":1290},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-10/71c5ae2337b9254f28e4d01e44b0aeec.jpeg"},{"normal_price":2500,"cnt":73838,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1607121336301866/M7LLNY8ZUtafXsdB71lkIl04TScjyz94.jpg","event_type":0,"market_price":2500,"goods_name":"浜戝崡楣板槾鑺掓灉6鏂わ紙鍗曟灉150-400鍏嬶級鐢滆繃缂呯敻杩涘彛楣板槾鑺掞紝鏋滃舰宸ц嫢楣板槾锛屽槾灏栨灉鑲�","goods_id":266557,"short_name":"浜戝崡楣板槾鑺掓灉6鏂わ紙鍗曟灉150-400鍏嬶級鐢滆繃缂呯敻杩涘彛楣板槾鑺掞紝鏋滃舰宸ц嫢楣板槾锛屽槾灏栨灉鑲�","group":{"customer_num":2,"price":2180},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-02/52f612abede7da485c27b363663ca590.jpeg"},{"normal_price":2190,"cnt":26260,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-22/8232fc82f98e18eb21b568bf36010dcc.jpeg","event_type":0,"market_price":2190,"goods_name":"銆愮紖鐢歌繘鍙ｃ\u20ac戙\u20ac愮紖鐢歌繘鍙ｃ\u20ac戦粍閲戦捇鍑ゆⅷ 鏃犵溂鑿犺悵 2涓 6-8鏂わ紙鍗曟灉1500-2000鍏嬶級鏂伴矞姘存灉 绾敎鍗庢福 鍛虫祿澶氭眮","goods_id":10715536,"short_name":"銆愮紖鐢歌繘鍙ｃ\u20ac戦粍閲戦捇鍑ゆⅷ 鏃犵溂鑿犺悵 2涓 6-8鏂わ紙鍗曟灉1500-2000鍏嬶級鏂伴矞姘存灉 绾敎鍗庢福 鍛虫祿澶氭眮","group":{"customer_num":2,"price":1990},"tag":3,"country":"缂呯敻","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-22/fece281dbbbb2effc374c7033a96f9a4.jpeg"},{"normal_price":2100,"cnt":48171,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-13/eba2d0f29f0580c0a0ab7eac56a5d1a6.jpeg","event_type":0,"market_price":2100,"goods_name":"銆愰\u20ac佸紑鏋滃櫒銆戠簿閫夊ぇ鏋滃箍瑗跨櫨棣欐灉锛堝崟鏋�70-100鍏嬶級5鏂よ25-35涓猏/3鏂�15-25涓猏/2鏂�10-15涓紝閰哥敎姹佸銆愰鍞細8鏈�12鏃ュ彂瀹屻\u20ac�","goods_id":4606530,"short_name":"銆愰\u20ac佸紑鏋滃櫒銆戠簿閫夊ぇ鏋滃箍瑗跨櫨棣欐灉锛堝崟鏋�70-100鍏嬶級5鏂よ25-35涓猏/3鏂�15-25涓猏/2鏂�10-15涓紝閰哥敎姹佸","group":{"customer_num":2,"price":1880},"tag":-1,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-13/c5077ba1d24749602615f0edfd9b2810.jpeg"},{"normal_price":1990,"cnt":33977,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-15/4b0ac2cf487bc5004fc1c4d15169a43c.jpeg","event_type":0,"market_price":1990,"goods_name":"骞胯タ灏忛噾鐓岃姃鏋�5鏂/8鏂わ紙鍗曟灉120-200g锛変辅鑺掓灉璐垫棌 鍙ｆ劅鐖芥粦","goods_id":6048632,"short_name":"骞胯タ灏忛噾鐓岃姃鏋�5鏂/8鏂わ紙鍗曟灉120-200g锛変辅鑺掓灉璐垫棌 鍙ｆ劅鐖芥粦","group":{"customer_num":2,"price":1790},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-15/22f05034f80b5be0ac8715be9bb474bf.jpeg"},{"normal_price":3000,"cnt":13356,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/5c65853346153879570eecab5196ca4d.jpeg","event_type":0,"market_price":3000,"goods_name":"娴峰崡涓浗绾㈣幉闆�2/3鏂� 鍗曟灉60-120g 娓呯敎鐖藉彛 鑳滆繃榛戦噾鍒氭按鏋� 椤轰赴閫熻繍","goods_id":942985,"short_name":"娴峰崡涓浗绾㈣幉闆�2/3鏂� 鍗曟灉60-120g 娓呯敎鐖藉彛 鑳滆繃榛戦噾鍒氭按鏋� 椤轰赴閫熻繍","group":{"customer_num":2,"price":2800},"tag":3,"country":"","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-02/85f824cc0491232f1bf2644266b1db3e.jpeg"},{"normal_price":7900,"cnt":8499,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-27/6a1076d6bf1f28afa241b30cf4b39c5b.jpeg","event_type":0,"market_price":7900,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戙\u20ac怉绾ф灉銆戞柊椴滄按鏋滄嘲鍥芥Υ鑾查噾鏋曟Υ鑾� 3-10鏂� 澶氫釜瑙勬牸鍙\u20ac� 閲戞灂澶存Υ鑾� 棣欑敎杞朝","goods_id":4033372,"short_name":"銆怉绾ф灉銆戞柊椴滄按鏋滄嘲鍥芥Υ鑾查噾鏋曟Υ鑾� 3-10鏂� 澶氫釜瑙勬牸鍙\u20ac� 閲戞灂澶存Υ鑾� 棣欑敎杞朝","group":{"customer_num":2,"price":5890},"tag":-1,"country":"娉板浗","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-27/193d9a9b4ff42e1667fa089edd04ea9f.jpeg"}]
     * opt_infos : [{"id":163,"priority":1,"opt_name":"鑺掓灉"},{"id":161,"priority":2,"opt_name":"妯辨"},{"id":167,"priority":3,"opt_name":"姒磋幉"},{"id":166,"priority":4,"opt_name":"鐏緳鏋�"},{"id":685,"priority":5,"opt_name":"钃濊帗"},{"id":285,"priority":6,"opt_name":"鏌犳"},{"id":878,"priority":7,"opt_name":"鐢滅摐"},{"id":637,"priority":8,"opt_name":"鍝堝瘑鐡�"},{"id":162,"priority":9,"opt_name":"濂囧紓鏋�"},{"id":170,"priority":10,"opt_name":"鐧鹃鏋�"},{"id":1103,"priority":10,"opt_name":"榫欑溂"},{"id":283,"priority":11,"opt_name":"鐗涙补鏋�"},{"id":171,"priority":12,"opt_name":"鑻规灉"},{"id":286,"priority":13,"opt_name":"鏈ㄧ摐"},{"id":165,"priority":14,"opt_name":"姗欐"},{"id":169,"priority":15,"opt_name":"鑿犺悵"},{"id":168,"priority":16,"opt_name":"姊�"},{"id":974,"priority":17,"opt_name":"姘存灉鍒跺搧"},{"id":1166,"priority":18,"opt_name":"瑗跨摐"},{"id":652,"priority":19,"opt_name":"妗�"},{"id":984,"priority":20,"opt_name":"铚滅摐"},{"id":284,"priority":21,"opt_name":"鍏跺畠姘存灉"}]
     */

    public int server_time;
    public List<GoodsListBean> goods_list;
    public List<OptInfosBean> opt_infos;

    public static ClassifyFirstResponse objectFromData(String str) {

        return new Gson().fromJson(str, ClassifyFirstResponse.class);
    }

    public static ClassifyFirstResponse objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ClassifyFirstResponse.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static class GoodsListBean implements Serializable{
        /**
         * normal_price : 1690
         * cnt : 449376
         * thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-06-20/e85490a99dc9db60cc6214a319249e8a.jpeg
         * event_type : 0
         * market_price : 1690
         * goods_name : 骞胯タ鐧捐壊灏忓彴鍐滆姃鏋�5鏂/8鏂ゅ崟鏋滐紙50-150g锛夋牳灏忚倝鍘� 鏋滈娴撻儊
         * goods_id : 10039371
         * short_name : 骞胯タ鐧捐壊灏忓彴鍐滆姃鏋�5鏂/8鏂ゅ崟鏋滐紙50-150g锛夋牳灏忚倝鍘� 鏋滈娴撻儊
         * group : {"customer_num":2,"price":1290}
         * tag : 3
         * country :
         * hd_thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-06-20/74d27d7c2660ab51c575b2ea7bcf633d.jpeg
         */

        public int normal_price;
        public int cnt;
        public String thumb_url;
        public int event_type;
        public int market_price;
        public String goods_name;
        public int goods_id;
        public String short_name;
        public GroupBean group;
        public int tag;
        public String country;
        public String hd_thumb_url;

        public static GoodsListBean objectFromData(String str) {

            return new Gson().fromJson(str, GoodsListBean.class);
        }

        public static GoodsListBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), GoodsListBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static class GroupBean {
            /**
             * customer_num : 2
             * price : 1290
             */

            public int customer_num;
            public int price;

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
    }

    public static class OptInfosBean implements Serializable{
        /**
         * id : 163
         * priority : 1
         * opt_name : 鑺掓灉
         */

        public int id;
        public int priority;
        public String opt_name;

        public static OptInfosBean objectFromData(String str) {

            return new Gson().fromJson(str, OptInfosBean.class);
        }

        public static OptInfosBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), OptInfosBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }
    }
}
