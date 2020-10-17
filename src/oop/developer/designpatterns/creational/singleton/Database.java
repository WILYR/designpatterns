package oop.developer.designpatterns.creational.singleton;

public class Database {
    private static Database database;
    private static int dataStorage;

    private Database() {

    }

    public static Database getDatabase() {
        if(database == null) {
            database = new Database();
        }
        return database;
    }

    public void dataSet() {
        dataStorage++;
    }

    public void dataGet() {
        System.out.println(dataStorage);
    }
}
