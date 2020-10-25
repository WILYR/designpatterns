package oop.developer.designpatterns.structual.composite;

public class Circle extends Dot implements Figures{
    @Override
    public void draw() {
        System.out.println("I'am a Circle");
    }
}
