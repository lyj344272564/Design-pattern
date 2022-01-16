package com.richard.装饰器;

public class FirstRobot implements Robot{
    @Override
    public void doSomething() {
        System.out.println("唱歌");
        System.out.println("对话");
    }
}
