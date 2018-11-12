package com.ivyzh.designpatterndemo.d4_decorator_pattern.simple1;

/**
 * Created by Ivy on 2018/11/12.
 */

public class Client {
    public static void main(String[] args) {
        NormalPhone normalPhone = new NormalPhone();
        normalPhone.call();
        System.out.println("-----------------");
        SmartPhone smartPhone = new SmartPhone(normalPhone);
        smartPhone.call();
    }
}
