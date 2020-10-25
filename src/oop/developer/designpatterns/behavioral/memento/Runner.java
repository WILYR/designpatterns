package oop.developer.designpatterns.behavioral.memento;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Bentley");
        CarStateBase base = new CarStateBase();
        car.setState("stop");
        System.out.println(car.toString());
        base.setSave(car.save());
        car.setState("moving");
        System.out.println(car.toString());
        car.getSave(base.getSave());
        System.out.println(car.toString());

    }
}
