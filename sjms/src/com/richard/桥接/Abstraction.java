package com.richard.桥接;

public class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void doWork() {
        this.implementor.doSomething();
    }
}
