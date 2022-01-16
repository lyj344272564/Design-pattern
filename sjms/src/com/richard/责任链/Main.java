package com.richard.责任链;

public class Main {
    public static void main(String[] args) {
        Handler level1 = new Leader();
        Handler level2 = new Boss();
        level1.setNextHandler(level2);
        level1.process(12);
        level1.process(9);
    }
}
