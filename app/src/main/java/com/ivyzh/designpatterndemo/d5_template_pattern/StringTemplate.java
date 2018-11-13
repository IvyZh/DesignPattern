package com.ivyzh.designpatterndemo.d5_template_pattern;

/**
 * Created by Ivy on 2018/11/13.
 */

public class StringTemplate extends CalculateTemplate {
    @Override
    protected void doWork() {
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str = str + i;
        }
    }
}
