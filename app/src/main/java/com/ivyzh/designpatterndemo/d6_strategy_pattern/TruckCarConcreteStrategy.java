package com.ivyzh.designpatterndemo.d6_strategy_pattern;

/**
 * 2.具体策略实现子类-TruckCarConcreteStrategy
 */

public class TruckCarConcreteStrategy implements CarStrategy {
    @Override
    public void run() {
        //相关的业务
        System.out.println("今天开着大卡车去拉货");
    }
}
