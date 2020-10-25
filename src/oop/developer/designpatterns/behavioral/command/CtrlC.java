package oop.developer.designpatterns.behavioral.command;

public class CtrlC implements Command{

    TextBase textBase;

    public CtrlC(TextBase textBase) {
        this.textBase = textBase;
    }

    @Override
    public void message() {
        textBase.copy();
    }
}
