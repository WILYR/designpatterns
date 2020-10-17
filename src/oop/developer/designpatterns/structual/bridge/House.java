package oop.developer.designpatterns.structual.bridge;

public class House extends Task{

    protected House(Figure figure) {
        super(figure);
    }
    @Override
    public void createTask() {
        System.out.print("Create House by: ");
        figure.state();
    }
}
