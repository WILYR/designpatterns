package oop.developer.designpatterns.creational.abstractfactorymethod.companies.importcompany;

import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Ship;

public class ImpShip implements Ship {
    @Override
    public void name() {
        System.out.println("ImpShip");
    }
}
