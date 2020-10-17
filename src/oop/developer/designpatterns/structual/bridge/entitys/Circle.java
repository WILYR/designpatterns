package oop.developer.designpatterns.structual.bridge.entitys;

import oop.developer.designpatterns.structual.bridge.Figure;

public class Circle implements Figure {
    @Override
    public void state() {
        System.out.println("Circle");
    }
}
