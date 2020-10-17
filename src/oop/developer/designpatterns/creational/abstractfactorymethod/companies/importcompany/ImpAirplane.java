package oop.developer.designpatterns.creational.abstractfactorymethod.companies.importcompany;

import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Airplane;

public class ImpAirplane implements Airplane {
    @Override
    public void name() {
        System.out.println("ImpAirPlane");
    }
}
