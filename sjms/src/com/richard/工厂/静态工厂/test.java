package com.richard.工厂.静态工厂;

public class test {
    public static void main(String[] args) {
        SendFactory.Mailproduce().send();
        SendFactory.Smsproduce().send();
    }
}
