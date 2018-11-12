package com.ivyzh.designpatterndemo.d3_factory_pattern.simple3;

/**
 * Created by Ivy on 2018/11/12.
 */

public interface Screen {
    void size();

    class Screen5 implements Screen {

        @Override
        public void size() {
            System.out.println("这是5寸显示屏...");
        }
    }

    class Screen6 implements Screen {

        @Override
        public void size() {
            System.out.println("这是6寸显示屏...");
        }
    }
}
