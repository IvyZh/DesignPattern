package com.ivyzh.designpatterndemo.d3_factory_pattern.simple1;

/**
 * Created by Ivy on 2018/11/12.
 */

public class BMW implements Car {
    @Override
    public void run() {
        System.out.println(getClass().getSimpleName() + " run...");
    }
}
