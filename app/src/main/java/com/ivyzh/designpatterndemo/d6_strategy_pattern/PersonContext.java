package com.ivyzh.designpatterndemo.d6_strategy_pattern;

/**
 * 3.应用场景类
 */

public class PersonContext {
    private String name;    //姓名
    private Integer age;    //年龄
    private CarStrategy car;  //拥有车

    public PersonContext(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setCar(CarStrategy car) {
        this.car = car;
    }

    public void driver() {
        if (car != null) {
            System.out.print(name + "  " + age + " 岁 ");
            car.run();
        } else {
            System.out.println("error: car = null");
        }
    }
}
