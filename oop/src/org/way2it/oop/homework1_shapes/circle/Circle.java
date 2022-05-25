package org.way2it.oop.homework1_shapes.circle;

public class Circle {

    public double radius;

    public Circle() {
        radius = 5;
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }
}
