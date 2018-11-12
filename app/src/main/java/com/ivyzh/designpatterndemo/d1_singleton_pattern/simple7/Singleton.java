package com.ivyzh.designpatterndemo.d1_singleton_pattern.simple7;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例实现方式7.容器管理
 */

public class Singleton {
    private static Map<String, Object> mSingleMap = new HashMap<>();

    private Singleton() {//私有化构造器
    }

    static {
        mSingleMap.put("SingletonInstance", new Singleton());
    }

    public static Object getInstance(String key) {
        return mSingleMap.get(key);
    }
}
