package oop.developer.designpatterns.structual.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TransportFlyweight transportFlyweight = new TransportFlyweight();
        List<Transport> transportList = new ArrayList<>();

        transportList.add(transportFlyweight.getTransport("Airplane"));
        transportList.add(transportFlyweight.getTransport("Airplane"));
        transportList.add(transportFlyweight.getTransport("Airplane"));
        transportList.add(transportFlyweight.getTransport("Car"));
        transportList.add(transportFlyweight.getTransport("Car"));
        transportList.add(transportFlyweight.getTransport("Car"));
        for(Transport e: transportList) {
            e.start();
        }

    }
}
