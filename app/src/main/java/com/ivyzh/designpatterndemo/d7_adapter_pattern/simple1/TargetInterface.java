package com.ivyzh.designpatterndemo.d7_adapter_pattern.simple1;

/**
 * 客户端需求接口，大于现有类
 */

public interface TargetInterface {
    void call();

    // 新增功能发短信、听音乐
    void sms();

    void music();

}
