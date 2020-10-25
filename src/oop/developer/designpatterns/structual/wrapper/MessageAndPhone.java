package oop.developer.designpatterns.structual.wrapper;

public class MessageAndPhone extends AttentionDecorator{

    public MessageAndPhone(Attention attention) {
        super(attention);
    }

    public String sendOnPhone() {
        return "Send on phone";
    }


    @Override
    public String send() {
        return super.send() + sendOnPhone();
    }
}
