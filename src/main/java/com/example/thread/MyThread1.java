package com.example.thread;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/24 9:08:07
 * @Version 1.0
 */
public class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("start " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        new Thread(myThread).start();
    }
}
