package oop.developer.designpatterns.structual.proxy;

public class SmartPhone implements Phone{
    int price;

    public SmartPhone(int price) {
        this.price = price;
        call();
    }

    @Override
    public void call() {
        System.out.println("I'am calling you with my SmartPhone which cost " + price);
    }
}
