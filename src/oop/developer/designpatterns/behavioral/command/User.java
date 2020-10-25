package oop.developer.designpatterns.behavioral.command;

public class User {

    Command copy;
    Command cut;

    public User(Command copy, Command cut) {
        this.copy = copy;
        this.cut = cut;
    }

    public void setCopy() {
        copy.message();
    }
    public void setCut() {
        cut.message();
    }
}
