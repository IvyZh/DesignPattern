package com.ivyzh.designpatterndemo.d7_adapter_pattern.simple1;

/**
 * 适配器实现方法1：继承当前类并实现目标接口--类适配
 */

public class Adapte1 extends PhoneAdaptee implements TargetInterface {
    @Override
    public void sms() {
        System.out.println("新增功能：发短信...类适配");
    }

    @Override
    public void music() {
        System.out.println("新增功能：听音乐...类适配");
    }
}
