package com.jiaofb.day07;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: iteration.0
 * @Date: 9/4/2021 - 04 - 09 - 10:29 AM
 * @Description:
 * 一、新建一个类ArrayListDemo，使用今天上课讲解api完成下面需求。
 * 1、定义老师类Teacher，私有属性：name，age，提供空参有参构造，提供get/set方法，重写toString()。
 * 2、创建老师对象t1，name：张三，age：25
 * 3、创建老师对象t2，name：李四，age：35
 * 4、创建老师对象t3，name：老王，age：19
 * 5、创建老师对象t4，name：赵六，age：29
 * 6、创建ArrayList集合对象存储t1，t2，t3，t4
 * 7、通过普通for循环和增强for循环打印所有老师数据。打印出对应的name和age属性。
 * 8、请求出集合中的老师平均年龄。
 * @version: 1.0
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建4个老师对象t1，t2，t3，t4
        Teacher t1=new Teacher("张三",25);
        Teacher t2=new Teacher("李四",35);
        Teacher t3=new Teacher("老王",19);
        Teacher t4=new Teacher("赵六",29);
        ArrayList<Teacher> tlist=new ArrayList<Teacher>();
      //创建ArrayList集合对象存储t1，t2，t3，t4
        tlist.add(t1);
        tlist.add(t2);
        tlist.add(t3);
        tlist.add(t4);
        //普通for循环遍历打印所有老师数据。打印出对应的name和age属性。
        for (int i = 0; i < tlist.size(); i++) {
            String  s=tlist.get(i).toString();
            System.out.println(s);
        }
        System.out.println("=========================================");
        //增强for循环遍历打印所有老师数据。打印出对应的name和age属性。
        for (Teacher t : tlist){
             String s= t.toString();
             System.out.println(s);
        }
        System.out.println("=========================================");
       //请求出集合中的老师平均年龄。（练习迭代器）
        int  sum=0;
        int  num=0;
        Iterator<Teacher>  t=tlist.iterator();
        while(t.hasNext()){
            Teacher tt =t.next();
            sum+= tt.getAge();
            num++;
        }
        double  avgAge=sum/num;
        System.out.println("平均年龄："+avgAge);
    }



}
