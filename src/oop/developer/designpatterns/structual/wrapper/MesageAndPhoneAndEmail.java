package oop.developer.designpatterns.structual.wrapper;

public class MesageAndPhoneAndEmail extends AttentionDecorator{
    public MesageAndPhoneAndEmail(Attention attention) {
        super(attention);
    }

    public String sendOnEmail() {
        return "Send on Email";
    }

    @Override
    public String send() {
        return super.send() + sendOnEmail();
    }
}
