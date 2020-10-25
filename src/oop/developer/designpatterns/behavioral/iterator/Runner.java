package oop.developer.designpatterns.behavioral.iterator;

public class Runner {
    public static void main(String[] args) {
        String [] fields  = {"Anchor", "Bridge"};
        Ship ship = new Ship("Dude", fields);

        IteratorNew iteratorNew = ship.getIterator();

       while (iteratorNew.hasNext()) {
           System.out.println(ship.getName() + ":"+ iteratorNew.next());
       }
    }
}
