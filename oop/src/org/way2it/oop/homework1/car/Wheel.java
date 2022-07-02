package org.way2it.oop.homework1.car;

public class Wheel {

    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public void changeSize(int newSize) {
        size = newSize;
        System.out.println(size + " = new size of wheel");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                '}';
    }
}
