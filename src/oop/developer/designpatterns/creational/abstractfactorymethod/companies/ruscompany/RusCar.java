package oop.developer.designpatterns.creational.abstractfactorymethod.companies.ruscompany;

import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Car;

public class RusCar implements Car {
    @Override
    public void name() {
        System.out.println("RusCar");
    }
}
