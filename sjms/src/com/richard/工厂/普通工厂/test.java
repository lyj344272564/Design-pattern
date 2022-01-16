package com.richard.工厂.普通工厂;

public class test {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender mail = sendFactory.produce("mail");
        mail.send();
        System.out.println(mail);
    }
}
