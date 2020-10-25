package oop.developer.designpatterns.structual.facade;

public class Facade {
    Car car = new Car();
    Ship ship = new Ship();
    Airplane airplane = new Airplane();

    public void RunShip() {
        ship.go();
    }

    public  void RunCar() {
        car.run();
    }

    public void RunAirplane() {
        airplane.fly();
    }

    public void RunAll() {
        ship.go();
        car.run();
        airplane.fly();
    }
}
