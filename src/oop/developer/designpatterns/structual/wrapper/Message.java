package oop.developer.designpatterns.structual.wrapper;

public class Message implements Attention{
    @Override
    public String send() {
        return "Send message";
    }
}
