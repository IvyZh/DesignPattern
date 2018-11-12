package com.ivyzh.designpatterndemo.d3_factory_pattern.simple3;

/**
 * Created by Ivy on 2018/11/12.
 */

public class Client {
    public static void main(String[] args) {
        XiaoMiFactory factory = new XiaoMiFactory();
        factory.getCpu().run();
        factory.getScreen().size();

        RedMiFactory redMiFactory = new RedMiFactory();
        redMiFactory.getCpu().run();
        redMiFactory.getScreen().size();
    }
}
