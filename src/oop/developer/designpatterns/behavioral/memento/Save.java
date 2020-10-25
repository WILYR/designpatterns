package oop.developer.designpatterns.behavioral.memento;

public class Save {
    private final String name;
    private final String state;


    public Save(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }
}
