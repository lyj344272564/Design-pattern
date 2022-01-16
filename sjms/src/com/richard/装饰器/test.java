package com.richard.装饰器;

public class test {
    public static void main(String[] args) {
        new RobotDecorator(new FirstRobot()).doMorething();
    }
}
