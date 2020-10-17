package oop.developer.designpatterns.creational.abstractfactorymethod.companies.ruscompany;

import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Airplane;

public class RusAirplane implements Airplane {
    @Override
    public void name() {
        System.out.println("RusAirplane");
    }
}
