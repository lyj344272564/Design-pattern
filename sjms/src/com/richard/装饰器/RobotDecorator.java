package com.richard.装饰器;

public class RobotDecorator implements Robot{
    private Robot robot;

    public RobotDecorator(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void doSomething() {
        robot.doSomething();
        System.out.println("跳舞、拖地");
    }

    public void doMorething() {
        robot.doSomething();
        System.out.println("跳舞、拖地");
    }
}
