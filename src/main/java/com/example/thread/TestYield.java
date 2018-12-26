package com.example.thread;

/**
 * @ClassName TestYield
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/24 14:22:00
 * @Version 1.0
 */
public class TestYield {

    public static void main(String[] args){
        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread t1 = new Thread(myRunnable1);
        t1.setPriority(Thread.NORM_PRIORITY);
        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread t2 = new Thread(myRunnable2);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + " is running " + i);
        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
        }
    }
}