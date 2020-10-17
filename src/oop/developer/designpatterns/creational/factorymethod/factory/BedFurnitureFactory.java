package oop.developer.designpatterns.creational.factorymethod.factory;

import oop.developer.designpatterns.creational.factorymethod.Furniture;
import oop.developer.designpatterns.creational.factorymethod.FurnitureFactory;
import oop.developer.designpatterns.creational.factorymethod.entitys.Bed;

public class BedFurnitureFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Bed();
    }
}
