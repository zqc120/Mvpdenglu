package com.example;

import java.util.Map;
import java.util.TreeMap;

public class MyClass {
    public static void main(String[] args) {
        MapUtils utils = new MapUtils();
        Map<String, String> map = new TreeMap<>();
        map.put("www", "12");
        map.put("ccc", "123");
        map.put("aaa", "33213");
        utils.keysort(map);
        String str = utils.transMapToString(map);
        System.out.println(str);
        Md5 md5 = new Md5();
        String sign = md5.MD5JiaMi(str);
        System.out.println(sign);
        String strr = utils.transMapToStrings(map);
        String result = strr + "&sign=" + sign;
        System.out.println(result);
    }
}
