package com.example;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
//既为观察者又是被观察者
public class ObserverA extends Observable implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ObserverB observerB = (ObserverB) o;
        System.out.println("observerB changed, the new value of observerB.data is " + observerB.data);
        this.setChanged();
        this.notifyObservers();
    }
}
