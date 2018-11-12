package com.ivyzh.designpatterndemo.d1_singleton_pattern.simple1;

/**
 * 饿汉式-随着类的加载会自动new出对象
 */

public class Singleton {
    private Singleton() {
    }//私有化构造器

    private static Singleton mInstance = new Singleton();

    public static Singleton getInstance() {
        return mInstance;
    }

}
