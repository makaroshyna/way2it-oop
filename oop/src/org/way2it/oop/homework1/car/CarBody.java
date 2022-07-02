package org.way2it.oop.homework1.car;

public class CarBody {

    private double length;
    private double height;

    public CarBody(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public void changeLength(double newLength) {
        length = newLength;
        System.out.println(length + " = new length of car body");
    }

    public void changeHeight(double newHeight) {
        height = newHeight;
        System.out.println(height + " = new height of car body");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
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
