package com.ivyzh.designpatterndemo.d2_builder_pattern.simple3;

/**
 * Created by Ivy on 2018/11/12.
 */

public class DogTest {
    public static void main(String[] args) {

        Dog dog = new Dog.Builder()
                .age(11)
                .breed("xx")
                .gender(true)
                .identifier(123)
                .name("cookie")
                .sickness("dd")
                .weight(10).build();
        System.out.println(dog);

    }
}
