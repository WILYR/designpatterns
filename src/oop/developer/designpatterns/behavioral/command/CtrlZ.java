package oop.developer.designpatterns.behavioral.command;

public class CtrlZ implements Command{
    TextBase textBase;

    public CtrlZ(TextBase textBase) {
        this.textBase = textBase;
    }

    @Override
    public void message() {
        textBase.cut();
    }
}
