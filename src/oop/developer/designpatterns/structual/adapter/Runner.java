package oop.developer.designpatterns.structual.adapter;

import oop.developer.designpatterns.structual.adapter.adapters.CarToShipAdapter;

public class Runner {
    public static void main(String[] args) {
        Ship ship = new CarToShipAdapter();
        ship.run();
        System.out.println(ship.isWorking(10));
    }
}
