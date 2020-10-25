package oop.developer.designpatterns.behavioral.memento;

public class CarStateBase {
    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

    public Save save;
}
