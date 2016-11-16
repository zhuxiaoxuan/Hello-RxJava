package com.example;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/11/16 0016.
 */

//观察者
public class ExampleObserver implements Observer {
    //有被观察者发生变化，自动调用对应观察者的update方法
    @Override
    public void update(Observable o, Object arg) {
        //通过强制类型转换获取呗观察者对象
        ExampleObservable example = (ExampleObservable) o;
        System.out.println("example.data changed, the new value of data is " + example.data);
    }
}
