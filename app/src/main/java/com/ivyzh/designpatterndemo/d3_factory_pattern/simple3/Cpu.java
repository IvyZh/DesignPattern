package com.ivyzh.designpatterndemo.d3_factory_pattern.simple3;

/**
 * Created by Ivy on 2018/11/12.
 */

public interface Cpu {
    void run();

    class Cpu650 implements Cpu {

        @Override
        public void run() {
            System.out.println("这是Cpu650在跑...");
        }
    }

    class Cpu825 implements Cpu {

        @Override
        public void run() {
            System.out.println("这是Cpu825在跑...");
        }
    }

    class Cpu845 implements Cpu {

        @Override
        public void run() {
            System.out.println("这是Cpu845在跑...");
        }
    }
}
