package com.richard.工厂.抽象工厂;

public class test {
    public static void main(String[] args) {
        Provider provider = new MailFactory();
        provider.produce().send();
        Provider provider1 = new SmsFactory();
        provider1.produce().send();
    }
}
