package oop.developer.designpatterns.creational.builder.builders;

import oop.developer.designpatterns.creational.builder.Builder;

public class ShipBuilder implements Builder {
    private int speed;
    private String name;
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void getShipInfo() {
        System.out.println(name + " " + speed);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

}
