package com.ivyzh.designpatterndemo.d4_decorator_pattern.simple1;

/**
 * Created by Ivy on 2018/11/12.
 */

public class SmartPhone implements Phone {
    private NormalPhone mPhone;

    SmartPhone(NormalPhone phone) {
        this.mPhone = phone;
    }

    @Override
    public void call() {
        mPhone.call();
        System.out.println("打电话的同时还可以发微信、看视频、玩游戏等等....");
    }

    @Override
    public void sms() {
        mPhone.sms();
    }
}
