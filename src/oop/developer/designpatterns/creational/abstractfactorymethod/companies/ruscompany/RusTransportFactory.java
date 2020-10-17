package oop.developer.designpatterns.creational.abstractfactorymethod.companies.ruscompany;

import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Airplane;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Car;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Ship;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.TransportFactory;

public class RusTransportFactory implements TransportFactory {
    @Override
    public Car getCar() {
        return new RusCar();
    }

    @Override
    public Ship getShip() {
        return new RusShip();
    }

    @Override
    public Airplane getAirPlane() {
        return new RusAirplane();
    }
}
