package org.way2it.oop.homework1.car;

public class Wheel extends Car {

    private int size;

    public Wheel() {
    }

    public void changeSize(int newSize) {
        size = newSize;
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
