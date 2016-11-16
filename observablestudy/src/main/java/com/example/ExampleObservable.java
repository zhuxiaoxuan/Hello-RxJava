package com.example;

import java.util.Observable;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
//被观察者
public class ExampleObservable extends Observable{

    int data=0;

    public void setData(int data){
        this.data=data;
        this.setChanged();
        this.notifyObservers();
    }
}
