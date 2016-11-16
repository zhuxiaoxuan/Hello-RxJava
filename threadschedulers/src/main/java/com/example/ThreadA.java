package com.example;

/**
 * Created by Administrator on 2016/11/16 0016.
 */

public class ThreadA extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("this is ThreadA");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
