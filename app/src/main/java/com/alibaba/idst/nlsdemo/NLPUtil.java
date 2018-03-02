package com.alibaba.idst.nlsdemo;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/2.
 */

public class NLPUtil {

    //public final static String url = "https://dtplus-cn-shanghai.data.aliyuncs.com/dataplus_120221/nlp/api/WordPos/general";
    public final static String url = "https://dtplus-cn-shanghai.data.aliyuncs.com/dataplus_120221/nlp/api/WordSegment/general";



    public static String wordPos(String  para){


        Map map = new HashMap();
        map.put("lang", "ZH");
        map.put("text", para);
        try {
             String rs = AESDecode.sendPost(NLPUtil.url,
                    JSON.toJSONString(map), AliKeySecret.Key, AliKeySecret.Secret);
            System.out.println("返回结果:" + rs);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
