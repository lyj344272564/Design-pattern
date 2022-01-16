package com.richard.代理;

public class RealSubject implements Subject{
    @Override
    public void doWork() {
        System.out.println("你好，世界！！！");
    }
}
