package oop.developer.designpatterns.structual.adapter.adapters;

import oop.developer.designpatterns.structual.adapter.Ship;
import oop.developer.designpatterns.structual.adapter.entitys.Car;

public class CarToShipAdapter extends Car implements Ship {
    @Override
    public void run() {
        ride();
    }

    @Override
    public boolean isWorking(int speed) {
        return isMoving(speed);
    }
}
