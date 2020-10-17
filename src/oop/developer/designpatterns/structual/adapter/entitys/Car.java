package oop.developer.designpatterns.structual.adapter.entitys;

public class Car {
    public void ride() {
        System.out.println("Car start moving///");
    }

    public boolean isMoving(int speed) {
        if (speed > 0) {
            return true;
        }
        return false;
    }
}
