package oop.developer.designpatterns.creational.abstractfactorymethod.companies.ruscompany;

import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Ship;

public class RusShip implements Ship {
    @Override
    public void name() {
        System.out.println("RusShip");
    }
}
