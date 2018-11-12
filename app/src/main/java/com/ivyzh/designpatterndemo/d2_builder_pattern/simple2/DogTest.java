package com.ivyzh.designpatterndemo.d2_builder_pattern.simple2;

/**
 * Created by Ivy on 2018/11/12.
 */

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setIdentifier(2222);//因为是一只二哈,2炸了
        dog.setName("sijia");//撕家小能手呀
        dog.setAge(3);
        dog.setWeight(20);
        dog.setBreed("Husky");
        dog.setGender(true);
        dog.setSickness("doubi");//这只哈士奇太逗逼了，还能治吗？
        System.out.println(dog);

        Dog dog1 = new Dog();
        dog1.setInfo(333, "sijia", 3, 20, "Husky", true, "doubi");
        System.out.println(dog1);

    }
}
