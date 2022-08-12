package com.codestates.chapter2.psa;

public abstract class Child {              // 아이의 특징을 일반화
    protected String childType;
    protected double height;
    protected double weight;
    protected String bloodType;
    protected int age;

    protected abstract void smile();
    protected abstract void cry();
    protected abstract void sleep();
    protected abstract void eat();

}
