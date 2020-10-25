package oop.developer.designpatterns.structual.composite;

public class Runner {
    public static void main(String[] args) {
        Dot dot = new Dot();
        dot.draw();
        Square square = new Square();
        square.draw();
    }
}
