package com.jiaofb.day07;

/**
 * @Auther: iteration.0
 * @Date: 9/4/2021 - 04 - 09 - 11:20 AM
 * @Description:
 * 二、有字符串String s = "abc,123,中国,llllll,haha"; 最终输出：abc：3，123：3，中国：2，llllll:6，haha:4 数字代表长度
 * 三、翻转字符串 aiwozhonghua ，结果auhgnohzowia
 * @version: 1.0
 */
public class TestString {
    public static void main(String[] args) {
        //第二题
        String s = "abc,123,中国,llllll,haha";
        String [] strs=s.split(",");
        for (String ss:strs){
            System.out.print(ss+":"+ss.length()+" , ");
        }
        System.out.print("数字代表长度");
        System.out.println(" ");
        //第三题
        String s2 = "abcdefg";
        char[] chars=s2.toCharArray();
        String reverse = "";
        for(int i=chars.length-1;i>=0;i--){
            reverse+=chars[i];
        }
        System.out.println(reverse);
    }
}
