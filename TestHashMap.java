package com.jiaofb.day07;

import java.util.HashMap;

/**
 * @Auther: iteration.0
 * @Date: 9/4/2021 - 04 - 09 - 1:19 PM
 * @Description:
 * 四、有HashMap对象{"id":"1","mobile_phone":"13212312312","pwd":"12312312"}
 * a、判断Map中是否有mobile_phone 键，如果有输出对应的值，如果没有提示没有。
 *     (提示：查询api文档中HashMap中判断是否存在键的方法。)
 * b、替换Map中pwd对应的值，替换为88888888。
 * @version: 1.0
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("id","1");
        map.put("mobile_phone","13212312312");
        map.put("pwd","12312312");
        //a、判断Map中是否有mobile_phone 键，如果有输出对应的值，如果没有提示没有
       boolean b=true;
        for(String m: map.keySet()){
            if("mobile_phone".equals(m)) {
                b=false;
                System.out.println(map.get(m));
            }
        }

        if (b){
            System.out.println("Map中没有mobile_phone 键");
        }
        //b、替换Map中pwd对应的值，替换为88888888。
        for(String m: map.keySet()){
            if("pwd".equals(m)) {
                map.put("pwd","88888888");
                System.out.println(map.get(m));
            }
        }
    }
}
