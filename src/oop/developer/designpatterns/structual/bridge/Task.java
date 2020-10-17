package oop.developer.designpatterns.structual.bridge;

public abstract class Task {
    protected Figure figure;
    protected Task (Figure figure) {
        this.figure = figure;
    }
    public abstract void createTask();
}
