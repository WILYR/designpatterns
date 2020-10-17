package oop.developer.designpatterns.creational.builder.entitys;

import oop.developer.designpatterns.creational.builder.builders.ShipBuilder;

public class RusShip extends ShipBuilder {
    private String name;
    private int speed;

    public RusShip () {

    }
    public RusShip(String name,int speed) {
        this.speed = speed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
