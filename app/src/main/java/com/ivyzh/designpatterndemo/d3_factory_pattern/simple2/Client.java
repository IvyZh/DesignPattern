package com.ivyzh.designpatterndemo.d3_factory_pattern.simple2;

/**
 * Created by Ivy on 2018/11/12.
 */

public class Client {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        BWMFactory bwmFactory = new BWMFactory();
        Car car1 = audiFactory.createCar();
        Car car2 = bwmFactory.createCar();
        car1.run();
        car2.run();
    }
}
