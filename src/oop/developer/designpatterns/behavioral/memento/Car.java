package oop.developer.designpatterns.behavioral.memento;

public class Car {
    String name;
    String state;

    public Car(String name) {
        this.name = name;
    }

    public void setState(String state){
        this.state = state;
    }

    public Save save() {
        return new Save(name, state);
    }

    public void getSave(Save save) {
        this.state = save.getState();
        this.name = save.getName();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
