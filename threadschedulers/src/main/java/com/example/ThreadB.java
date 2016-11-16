package com.example;

/**
 * Created by Administrator on 2016/11/16 0016.
 */

public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("this is ThreadB");
    }
}
