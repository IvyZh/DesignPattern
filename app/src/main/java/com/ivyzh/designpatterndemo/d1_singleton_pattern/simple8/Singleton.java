package com.ivyzh.designpatterndemo.d1_singleton_pattern.simple8;

/**
 * 单例实现方式8.枚举
 */

public enum Singleton {
    //定义一个枚举的元素，就代表Singleton实例
    INSTANCE;

    /*
    **假如还定义有下面的方法，调用：Singleton.INSTANCE.doSomethingMethod();
    */
    public void doSomethingMethod() {

    }
}
