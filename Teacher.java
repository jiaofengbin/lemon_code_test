package com.jiaofb.day07;

/**
 * @Auther: iteration.0
 * @Date: 9/4/2021 - 04 - 09 - 10:31 AM
 * @Description: 定义老师类Teacher，私有属性：name，age，提供空参有参构造，提供get/set方法，重写toString()。
 * @version: 1.0
 */
public class Teacher {
    private  String  name;
    private  int   age;
    //空参构造方法
    public  Teacher(){
    }
    //有参构造方法
    public  Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String  name){
        this.name=name;
    }
    public String getName(){
        return  name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return  age;
    }
    //重写toString()
    @Override
    public String toString() {
        return "姓名："+name+"   年龄:"+age;
    }
}
