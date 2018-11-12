package com.ivyzh.designpatterndemo.d1_singleton_pattern.simple6;

/**
 * 单例实现方式6.静态内部类（也是比较常用，保证了线程安全）
 */

public class Singleton {
    private Singleton() {//私有化构造器
    }

    public static Singleton getInstance() {
        return SingletonHolder.mInstance;
    }

    public static class SingletonHolder {
        private static volatile Singleton mInstance = new Singleton();
    }
}
