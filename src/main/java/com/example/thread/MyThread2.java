package com.example.thread;

import org.apache.tomcat.jni.Time;

/**
 * @ClassName MyThread2
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/24 9:32:48
 * @Version 1.0
 */
public class MyThread2 extends Thread {

    private String name;
    public MyThread2(String name){
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getState());
            Thread.sleep(1000);
            System.out.println(this.name + " start");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        MyThread2 myThread2 = new MyThread2("t1");
        System.out.println(myThread2.getState());
        myThread2.start();
        System.out.println(myThread2.getState());
        System.out.println(myThread2.getState());
    }
}
