package com.ivyzh.designpatterndemo.d5_template_pattern;

import android.os.SystemClock;

/**
 * Created by Ivy on 2018/11/13.
 */

public class TemplateTest1 {
    public static void main(String[] args) {

        StringTemplate stringTemplate = new StringTemplate();
        StringBuilderTemplate stringBuilderTemplate = new StringBuilderTemplate();

        System.out.println("string time:" + stringTemplate.calculate());
        System.out.println("stringbuilder time:" + stringBuilderTemplate.calculate());

    }
}
