package oop.developer.designpatterns.creational.abstractfactorymethod.companies.importcompany;

import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Airplane;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Car;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Ship;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.TransportFactory;

public class ImportTransportFactory implements TransportFactory {
    @Override
    public Car getCar() {
        return new ImpCar();
    }

    @Override
    public Ship getShip() {
        return new ImpShip();
    }

    @Override
    public Airplane getAirPlane() {
        return new ImpAirplane();
    }
}
