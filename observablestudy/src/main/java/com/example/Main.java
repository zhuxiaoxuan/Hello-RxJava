package com.example;

/**
 * Created by Administrator on 2016/11/16 0016.
 */

public class Main {
    public static void main(String[] args) {
//        ExampleObservable exampleObservable = new ExampleObservable();
//        exampleObservable.addObserver(new ExampleObserver());
//        exampleObservable.setData(2);
//        exampleObservable.setData(-5);
//        exampleObservable.setData(9999);
        ObserverA a = new ObserverA();
        ObserverB b = new ObserverB();
        a.addObserver(b);
        b.addObserver(a);
        b.setData(2);
    }
}
