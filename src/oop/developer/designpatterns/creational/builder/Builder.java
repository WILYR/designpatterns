package oop.developer.designpatterns.creational.builder;

public interface Builder {
    void setSpeed(int speed);
    void setName(String name);
    void getShipInfo();
    String getName();
    int getSpeed();
}
