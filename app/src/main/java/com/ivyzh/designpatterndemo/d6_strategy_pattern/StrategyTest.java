package com.ivyzh.designpatterndemo.d6_strategy_pattern;

/**
 * Created by Ivy on 2018/11/13.
 */

public class StrategyTest {
    public static void main(String[] args) {

        PersonContext p1 = new PersonContext("小明", 22);
        //Context: 用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用。
        SmallCarConcreteStrategy smallCar = new SmallCarConcreteStrategy();
        TruckCarConcreteStrategy truckCar = new TruckCarConcreteStrategy();

        p1.driver();

        p1.setCar(smallCar);
        p1.driver();

        p1.setCar(truckCar);
        p1.driver();
    }
}
