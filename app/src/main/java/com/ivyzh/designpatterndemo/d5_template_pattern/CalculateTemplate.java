package com.ivyzh.designpatterndemo.d5_template_pattern;

import android.os.SystemClock;

/**
 * Created by Ivy on 2018/11/13.
 */

public abstract class CalculateTemplate {
    public long calculate() {
        long benginTime = System.currentTimeMillis();
        doWork();
        long endTime = System.currentTimeMillis();
        return endTime - benginTime;
    }

    protected abstract void doWork();
}
