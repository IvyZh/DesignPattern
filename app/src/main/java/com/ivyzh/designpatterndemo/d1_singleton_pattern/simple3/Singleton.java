package com.ivyzh.designpatterndemo.d1_singleton_pattern.simple3;

/**
 * 懒汉式2-解决多线程并发问题，加一个同步锁，但是又会出现效率问题，就是每次getInstanc的时候都会经过同步锁的判断！
 */

public class Singleton {
    private Singleton() {
    }//私有化构造器

    private static Singleton mInstance;

    public static synchronized Singleton getInstance() {
        if (mInstance == null)
            mInstance = new Singleton();
        return mInstance;
    }

}
