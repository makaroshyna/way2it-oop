package org.way2it.oop.homework1.shapes.circle;

public class Main extends Circle {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.printf("Square of circle = %.3f\n", circle.getSquare());
        System.out.printf("Length of circle = %.3f", circle.getLength());
    }
}
