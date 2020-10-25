package oop.developer.designpatterns.structual.proxy;

public class Runner {
    public static void main(String[] args) {
        Phone phone = new SmartPhoneProxy(50);

        phone.call();
    }
}
