package oop.developer.designpatterns.structual.bridge;

import oop.developer.designpatterns.structual.bridge.entitys.Circle;
import oop.developer.designpatterns.structual.bridge.entitys.Square;

public class Runner {
    public static void main(String[] args) {
        Task task = new House(new Circle());
        task.createTask();
        Task task1 = new Bridge(new Square());
        task1.createTask();
    }
}
