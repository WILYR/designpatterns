package oop.developer.designpatterns.creational.prototype.factory;

import oop.developer.designpatterns.creational.prototype.entitys.Ship;

public class ShipFactory {
    Ship ship;

    public ShipFactory(Ship ship) {
        this.ship = ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
    public Ship copyShip () {
        return (Ship) ship.copy();
    }
}
