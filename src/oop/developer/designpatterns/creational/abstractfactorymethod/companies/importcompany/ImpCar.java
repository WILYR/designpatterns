package oop.developer.designpatterns.creational.abstractfactorymethod.companies.importcompany;

import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Car;

public class ImpCar implements Car {
    @Override
    public void name() {
        System.out.println("ImpCar");
    }
}
