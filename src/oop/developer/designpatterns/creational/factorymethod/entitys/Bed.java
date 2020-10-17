package oop.developer.designpatterns.creational.factorymethod.entitys;

import oop.developer.designpatterns.creational.factorymethod.Furniture;

public class Bed implements Furniture {
    @Override
    public void furnitureName() {
        System.out.println("I am a bed");
    }
}
