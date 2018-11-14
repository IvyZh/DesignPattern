package com.ivyzh.designpatterndemo.d7_adapter_pattern.simple1;

/**
 * 适配器实现2：持有当前类引用并实现目标接口--对象适配（比较常用）
 */

public class Adapte2 implements TargetInterface {

    private PhoneAdaptee mPhoneAdaptee = new PhoneAdaptee();

    @Override
    public void call() {
        mPhoneAdaptee.call();
    }

    @Override
    public void sms() {
        System.out.println("新增功能：发短信...对象适配");
    }

    @Override
    public void music() {
        System.out.println("新增功能：听音乐...对象适配");
    }
}
