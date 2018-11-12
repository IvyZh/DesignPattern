package com.ivyzh.designpatterndemo.d1_singleton_pattern.simple4;

/**
 * 懒汉式3-双重检查，只会执行一次同步锁。(这种方式其实还是有问题！引出volatile关键字)
 */

public class Singleton {
    private Singleton() {
    }//私有化构造器

    private static Singleton mInstance;

    public static Singleton getInstance() {
        if (mInstance == null) {
            synchronized (Singleton.class) {
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }

}
