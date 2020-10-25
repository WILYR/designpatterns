package oop.developer.designpatterns.behavioral.mediator;

public class Runner {
    public static void main(String[] args) {
        NewChat chat = new NewChat();
        User admin =  new Admin(chat, "User");
        User user = new Admin(chat, "Admin2");

        chat.setAdmin(admin);
        chat.addUser(user);

        user.sendMessage("hello");
        admin.sendMessage("admin helllo");


    }
}
