package oop.developer.designpatterns.behavioral.command;

public class Runner {
    public static void main(String[] args) {

        TextBase textBase = new TextBase();

        User user = new User(new CtrlC(textBase), new CtrlZ(textBase));

        user.setCopy();
        user.setCut();

    }
}
