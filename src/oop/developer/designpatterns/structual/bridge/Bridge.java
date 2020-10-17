package oop.developer.designpatterns.structual.bridge;

public class Bridge extends Task{

    protected Bridge(Figure figure) {
        super(figure);
    }
    @Override
    public void createTask() {
        System.out.print("Create Bridge by: ");
        figure.state();
    }
}
