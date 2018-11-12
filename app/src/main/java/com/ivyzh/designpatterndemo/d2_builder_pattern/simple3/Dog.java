package com.ivyzh.designpatterndemo.d2_builder_pattern.simple3;

/**
 * Created by Ivy on 2018/11/12.
 */

public class Dog {
    private int identifier;//编号
    private String name;//名字
    private int age;//年龄
    private int weight;//体重
    private String breed;//品种
    private boolean gender;//性别，true：公狗；false：母狗
    private String sickness;//疾病

    public Dog(int identifier, String name, int age, int weight, String breed, boolean gender, String sickness) {
        this.identifier = identifier;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.gender = gender;
        this.sickness = sickness;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", sickness='" + sickness + '\'' +
                '}';
    }

    final static class Builder {
        private int identifier;//编号
        private String name;//名字
        private int age;//年龄
        private int weight;//体重
        private String breed;//品种
        private boolean gender;//性别，true：公狗；false：母狗
        private String sickness;//疾病

        public Builder identifier(int identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder breed(String breed) {
            this.breed = breed;
            return this;
        }

        public Builder gender(boolean gender) {
            this.gender = gender;
            return this;
        }

        public Builder sickness(String sickness) {
            this.sickness = sickness;
            return this;
        }

        public Dog build() {
            return new Dog(identifier, name, age, weight, breed, gender, sickness);
        }
    }

}