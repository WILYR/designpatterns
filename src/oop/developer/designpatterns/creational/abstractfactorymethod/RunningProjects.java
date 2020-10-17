package oop.developer.designpatterns.creational.abstractfactorymethod;

import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Airplane;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Car;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.Ship;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.absractentitys.TransportFactory;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.importcompany.ImportTransportFactory;
import oop.developer.designpatterns.creational.abstractfactorymethod.companies.ruscompany.RusTransportFactory;

public class RunningProjects {
    public static void main(String[] args) {
        TransportFactory transportFactory = new RusTransportFactory();
        Car rusCar = transportFactory.getCar();
        Ship rusShip = transportFactory.getShip();
        Airplane rusAirplane = transportFactory.getAirPlane();
        System.out.println("Russian transport are here///");
        rusCar.name();
        rusAirplane.name();
        rusShip.name();
        TransportFactory transportFactoryImport = new ImportTransportFactory();
        Car impCar = transportFactoryImport.getCar();
        Ship impShip = transportFactoryImport.getShip();
        Airplane impAirplane = transportFactoryImport.getAirPlane();
        System.out.println("Import transport are here////");
        impAirplane.name();
        impCar.name();
        impShip.name();
    }
}
