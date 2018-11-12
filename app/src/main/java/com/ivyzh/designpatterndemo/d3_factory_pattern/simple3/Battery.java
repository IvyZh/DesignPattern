package com.ivyzh.designpatterndemo.d3_factory_pattern.simple3;

/**
 * Created by Ivy on 2018/11/12.
 */

public interface Battery {

    void capacity();

    class SAMSUNG implements Battery {

        @Override
        public void capacity() {
            System.out.println("SAMSUNG的电池容量 1821 mAh...");
        }
    }

    class PISEN implements Battery {

        @Override
        public void capacity() {
            System.out.println("PISEN的电池容量 1821 mAh...");
        }
    }
}
