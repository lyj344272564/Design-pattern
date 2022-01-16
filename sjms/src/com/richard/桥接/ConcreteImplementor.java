package com.richard.桥接;

public class ConcreteImplementor implements Implementor{
    @Override
    public void doSomething() {
        System.out.println("Hello World!");
    }
}
