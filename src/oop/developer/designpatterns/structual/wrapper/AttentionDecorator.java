package oop.developer.designpatterns.structual.wrapper;

public class AttentionDecorator implements Attention{

    Attention attention;

    public AttentionDecorator (Attention attention) {
        this.attention = attention;
    }

    @Override
    public String send() {
        return attention.send();
    }
}
