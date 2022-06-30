package org.way2it.oop.homework1.shapes.rectangle;

public class Main extends Rectangle {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        printSquareAndPerimeter(rectangle1);
        Rectangle rectangle2 = new Rectangle(34, 45);
        printSquareAndPerimeter(rectangle2);
    }

    private static void printSquareAndPerimeter(Rectangle rectangle) {
        double square = rectangle.getSquare();
        double perimeter = rectangle.getPerimeter();
        System.out.println("Square of rectangle = " + square);
        System.out.println("Perimeter of rectangle = " + perimeter);
        System.out.println();
    }
}
