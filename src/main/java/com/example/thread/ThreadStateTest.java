package com.example.thread;

import java.util.ArrayList;

/**
 * @ClassName ThreadStateTest
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/24 10:35:29
 * @Version 1.0
 */
public class ThreadStateTest extends Thread {

    // 同步锁1
    private static Object monitorA = new Object();
    // 同步锁2
    private static Object monitorB = new Object();
    // 进入条件
    private static volatile boolean locked = false;

    @Override
    public void run() {
        System.out.println("2:" + this.getState());
        synchronized (monitorA){
            try {
                // 3:此时探测,将会处于TIMED_WAITING状态
                Thread.sleep(1000);
                // 4:等待锁，处于BLOCKED状态；
                synchronized (monitorB){
                    while (!locked){
                        // 5:等待信号,处于WAITING状态
                        monitorB.wait();
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ThreadStateTest t = new ThreadStateTest();
        System.out.println("1:" + t.getState());
        t.start();
        new Thread(() -> {
            synchronized (monitorB){
                System.out.println("3:" + t.getState());
                while(t.getState() != Thread.State.BLOCKED) {
                    Thread.yield();
                }
                System.out.println("4:" + t.getState());
            }
            while(t.getState() != Thread.State.WAITING) {
                Thread.yield();
            }
            System.out.println("5:" + t.getState());
            //  发信号通知线程激活
            synchronized (monitorB) {
                locked = true;
                monitorB.notify();
            }
        }).start();

        // 等待线程结束,获取线程的终结状态
        t.join();
        System.out.println("6:" + t.getState());

    }
}
