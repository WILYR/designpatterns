package oop.developer.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        //Database database = new Database();
        //not working
        //
        System.out.println(Database.getDatabase().toString());
        Database.getDatabase().dataSet();
        System.out.println(Database.getDatabase().toString());
        Database.getDatabase().dataGet();
        System.out.println(Database.getDatabase().toString());
        Database.getDatabase().dataSet();
        System.out.println(Database.getDatabase().toString());
        Database.getDatabase().dataGet();
        System.out.println(Database.getDatabase().toString());

    }
}
