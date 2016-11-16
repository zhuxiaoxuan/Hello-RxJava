package com.example;

import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.util.Observable;
import java.util.Observer;

public class ObservableTest {

    //被观察者
    static class House extends Observable {
        private float price;//价钱

        public House(float price) {
            this.price = price;
        }

        public float getPrice() {
            return this.price;
        }

        public void setPrice(float price) {
            //每一次的修改都应该引起观察者的注意
            super.setChanged();//设置变化点
            super.notifyObservers(price);//价格被改变
            this.price = price;
        }

        @Override
        public String toString() {
            return "房子价格为：" + this.price;
        }
    }

    // 观察者
    static class HousePriceObserver implements Observer {
        private String name;

        public HousePriceObserver(String name) {
            this.name = name;
        }

        @Override
        public void update(Observable o, Object arg) {
            if (arg instanceof Float) {
                System.out.print(this.name + "观察到价格更改为:");
                System.out.println(((Float) arg).floatValue());
            }
        }
    }

    public static void main(String[] args) {

        House h = new House(1000000);
        HousePriceObserver hpo1 = new HousePriceObserver("购房者A");
        HousePriceObserver hpo2 = new HousePriceObserver("购房者B");
        HousePriceObserver hpo3 = new HousePriceObserver("购房者C");

        h.addObserver(hpo1);
        h.addObserver(hpo2);
        h.addObserver(hpo3);


        System.out.println(h);
        h.setPrice(666666);
        System.out.println(h);
    }
}
