package com.richard.适配器;

public class test {
    public static void main(String[] args) {
        String translate = new Adapter(new Speaker()).translate();
        System.out.println(translate);
    }
}
