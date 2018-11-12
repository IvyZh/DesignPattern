package com.ivyzh.designpatterndemo.d1_singleton_pattern.simple2;

/**
 * 懒汉式1-多线程并发的时候会有问题，有可能会存在多个实例mInstance
 */

public class Singleton {
    private Singleton() {
    }//私有化构造器

    private static Singleton mInstance;

    public static Singleton getInstance() {
        if (mInstance == null)
            mInstance = new Singleton();
        return mInstance;
    }

}
