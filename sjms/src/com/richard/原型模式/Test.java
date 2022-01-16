package com.richard.原型模式;

public class Test {
    public static void main(String[] args) {
        Plane p = new Plane();
        System.out.println(p.getName()+"   " + p.getType());
        Plane p1 = (Plane) p.clone();
        System.out.println(p1.getName()+"   " + p1.getType());
    }
}
