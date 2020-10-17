package oop.developer.designpatterns.creational.factorymethod;

import oop.developer.designpatterns.creational.factorymethod.factory.BedFurnitureFactory;
import oop.developer.designpatterns.creational.factorymethod.factory.ChairFurnitureFactory;
import oop.developer.designpatterns.creational.factorymethod.factory.TableFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = createFactoryByName("Bed");
        Furniture furniture = furnitureFactory.createFurniture();
        furniture.furnitureName();
    }

    static FurnitureFactory createFactoryByName(String name) {
        if(name.equals("Table")) {
            return new TableFurnitureFactory();
        } else if (name.equals("Chair")) {
            return new ChairFurnitureFactory();
        } else if(name.equals("Bed")) {
            return new BedFurnitureFactory();
        } else  {
            throw new RuntimeException("No furniture at list");
        }
    }
}
