package oop.developer.designpatterns.structual.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TransportFlyweight {
    private static Map<String, Transport> map= new HashMap<>();
    public Transport getTransport(String type) {
        Transport transport = map.get(type);

        if (transport == null) {
            switch (type) {
                case "Airplane":
                    System.out.println("Take a airplane///");
                    transport = new Airplane();
                    break;
                case "Car":
                    System.out.println("Take a Car///");
                    transport = new Car();
                    break;
            }
            map.put(type, transport);
        }
        return transport;
    }
}
