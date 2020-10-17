package oop.developer.designpatterns.creational.builder.director;

import oop.developer.designpatterns.creational.builder.Builder;

public class Director {
    public void constructRusShip(Builder builder) {
        builder.setName("ALesha");
        builder.setSpeed(50);
    }

    public void constructImpShip(Builder builder) {
        builder.setName("Tom");
        builder.setSpeed(55);
    }

    public void getShipInfo(Builder builder) {
        builder.getShipInfo();
    }
}
