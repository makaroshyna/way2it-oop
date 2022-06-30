package org.way2it.oop.homework1.car;

public class CarBody extends Car {

    private int length;
    private int height;

    public CarBody() {
    }

    public void changeLength(int newLength) {
        length = newLength;
    }

    public void changeHeight(int newHeight) {
        height = newHeight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "CarBody{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
