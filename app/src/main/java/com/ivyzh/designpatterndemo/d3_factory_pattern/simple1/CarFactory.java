package com.ivyzh.designpatterndemo.d3_factory_pattern.simple1;


/**
 * Created by Ivy on 2018/11/12.
 */

public class CarFactory {

    public static Car create(String type) {
        if ("audi".equals(type)) {
            return new Audi();
        } else if ("bmw".equals(type)) {
            return new BMW();
        } else {
            return null;
        }
    }
}
