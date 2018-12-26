package com.example.test;

/**
 * @ClassName TestClassLoader
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/22 10:29:37
 * @Version 1.0
 */
public class TestClassLoader {
    public static void main(String[] args) {
        try {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            System.out.println("加载TestStaticA到jvm中");
            Class loadClass = systemClassLoader.loadClass("com.example.test.TestStaticA");
            System.out.println("实例化TestStaticA");
            loadClass.newInstance();
            System.out.println("加载TestStaticB到jvm中");
            Class forName = Class.forName("com.example.test.TestStaticB");
            System.out.println("实例化TestStaticB");
            forName.newInstance();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }
    }
}
