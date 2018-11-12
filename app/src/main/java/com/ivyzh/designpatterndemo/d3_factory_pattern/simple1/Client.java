package com.ivyzh.designpatterndemo.d3_factory_pattern.simple1;

/**
 * Created by Ivy on 2018/11/12.
 */

public class Client {
    public static void main(String[] args) {
        Car car1 = CarFactory.create("audi");
        Car car2 = CarFactory.create("bmw");
        car1.run();
        car2.run();
    }
}
