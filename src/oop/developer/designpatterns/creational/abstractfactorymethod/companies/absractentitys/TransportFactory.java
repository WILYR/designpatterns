package oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys;

public interface TransportFactory {
    Car getCar();
    Ship getShip();
    Airplane getAirPlane();
}
