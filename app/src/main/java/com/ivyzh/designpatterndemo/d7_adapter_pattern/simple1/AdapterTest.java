package com.ivyzh.designpatterndemo.d7_adapter_pattern.simple1;

/**
 * Created by Ivy on 2018/11/14.
 */

public class AdapterTest {
    public static void main(String[] args) {

        PhoneAdaptee adaptee = new PhoneAdaptee();
        adaptee.call();

        System.out.println("--------------");

        Adapte1 adapte1 = new Adapte1();
        adapte1.call();
        adapte1.sms();
        adapte1.music();

        System.out.println("--------------");

        Adapte2 adapte2 = new Adapte2();
        adapte2.call();
        adapte2.sms();
        adapte2.music();

    }
}
