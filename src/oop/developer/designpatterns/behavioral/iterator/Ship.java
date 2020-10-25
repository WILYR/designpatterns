package oop.developer.designpatterns.behavioral.iterator;

public class Ship implements Collection{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFields() {
        return fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public Ship(String name, String[] fields) {
        this.name = name;
        this.fields = fields;
    }

    private String[] fields;

    @Override
    public IteratorNew getIterator() {
        return new FieldsIterator();
    }

    private class FieldsIterator implements IteratorNew {
        int index;
        @Override
        public boolean hasNext() {
            if(index< fields.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return fields[index++];
        }
    }
}
