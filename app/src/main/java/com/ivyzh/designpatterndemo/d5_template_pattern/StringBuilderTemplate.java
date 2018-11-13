package com.ivyzh.designpatterndemo.d5_template_pattern;

/**
 * Created by Ivy on 2018/11/13.
 */

public class StringBuilderTemplate extends CalculateTemplate {
    @Override
    protected void doWork() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
    }
}
