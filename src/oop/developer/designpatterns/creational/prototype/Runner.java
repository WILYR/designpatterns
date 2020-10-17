package oop.developer.designpatterns.creational.prototype;

import oop.developer.designpatterns.creational.prototype.entitys.Ship;
import oop.developer.designpatterns.creational.prototype.factory.ShipFactory;

public class Runner {
    public static void main(String[] args) {
        Ship ship = new Ship("Wave", 10);
        System.out.println(ship);

        ShipFactory factory = new ShipFactory(ship);
        Ship copyShip = factory.copyShip();
        System.out.println(copyShip);
    }
}
