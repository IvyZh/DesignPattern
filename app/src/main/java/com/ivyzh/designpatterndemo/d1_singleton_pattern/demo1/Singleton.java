package com.ivyzh.designpatterndemo.d1_singleton_pattern.demo1;

/**
 * 懒汉式4-双重检查，只会执行一次同步锁+volatile关键字
 */

public class Singleton {
    private Singleton() {
    }//私有化构造器

    private static /*volatile*/ Singleton mInstance;

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
