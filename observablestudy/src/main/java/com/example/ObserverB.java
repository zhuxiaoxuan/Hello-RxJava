package com.example;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
//既为观察者又是被观察者
public class ObserverB extends Observable implements Observer {
    int data = 0;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ObserverB found that ObserverA changed...");
    }

    public void setData(int data) {
        this.data = data;
        this.setChanged();
        ;
        this.notifyObservers();
    }
}
