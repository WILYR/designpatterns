package oop.developer.designpatterns.structual.flyweight;

public class Airplane implements Transport{
    @Override
    public void start() {
        System.out.println("Fly");
    }
}
