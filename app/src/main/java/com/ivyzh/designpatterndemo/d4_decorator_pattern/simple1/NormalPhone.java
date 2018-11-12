package com.ivyzh.designpatterndemo.d4_decorator_pattern.simple1;

/**
 * Created by Ivy on 2018/11/12.
 */

public class NormalPhone implements Phone {
    @Override
    public void call() {
        System.out.println("可以打电话");
    }

    @Override
    public void sms() {
        System.out.println("可以发短信");
    }
}
