package com.ivyzh.designpatterndemo.d3_factory_pattern.simple3;

/**
 * Created by Ivy on 2018/11/12.
 */

public class RedMiFactory implements PhoneFactory {
    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu650();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Screen5();
    }
}
