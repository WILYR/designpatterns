package oop.developer.designpatterns.creational.prototype.entitys;

import oop.developer.designpatterns.creational.prototype.Copy;

public class Ship implements Copy {
    private String name;
    private int speed;

    public Ship(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public Object copy() {
        Ship copyShip = new Ship(name,speed);
        return copyShip;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
