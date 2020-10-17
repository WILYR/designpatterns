package oop.developer.designpatterns.creational.builder;

import oop.developer.designpatterns.creational.builder.builders.ShipBuilder;
import oop.developer.designpatterns.creational.builder.director.Director;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        ShipBuilder builder = new ShipBuilder();
        director.constructRusShip(builder);
        builder.getShipInfo();
        director.constructImpShip(builder);
        builder.getShipInfo();
    }
}
