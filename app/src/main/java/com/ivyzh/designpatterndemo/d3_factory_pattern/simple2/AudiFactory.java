package com.ivyzh.designpatterndemo.d3_factory_pattern.simple2;

/**
 * Created by Ivy on 2018/11/12.
 */

public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
