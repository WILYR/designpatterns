package oop.developer.designpatterns.structual.bridge.entitys;

import oop.developer.designpatterns.structual.bridge.Figure;

public class Square implements Figure {
    @Override
    public void state() {
        System.out.println("Square");
    }
}
