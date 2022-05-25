package org.way2it.oop.homework1_shapes.rectangle;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 6;
        width = 9;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getSquare() {
        return length * width;
    }
}
