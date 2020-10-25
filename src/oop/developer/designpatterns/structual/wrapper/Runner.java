package oop.developer.designpatterns.structual.wrapper;

public class Runner {
    public static void main(String[] args) {
        Attention attention = new MesageAndPhoneAndEmail(new MessageAndPhone(new Message()));
        System.out.println(attention.send());
    }
}
