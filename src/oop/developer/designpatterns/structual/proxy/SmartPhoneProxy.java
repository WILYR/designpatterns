package oop.developer.designpatterns.structual.proxy;

public class SmartPhoneProxy implements Phone{
    SmartPhone smartPhone;
    private int price;

    public SmartPhoneProxy(int price) {
        this.price = price;
    }

    @Override
    public void call() {
        if(smartPhone == null) {
            smartPhone = new SmartPhone(price);
        }
    }
}
