package oop.developer.designpatterns.structual.facade;

public class Runner {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.RunAll();
        facade.RunCar();
    }
}
