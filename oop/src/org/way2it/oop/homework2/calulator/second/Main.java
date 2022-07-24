package org.way2it.oop.homework2.calulator.second;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Result of method add: " + calculator.add(5.6, 123.3));
        System.out.println("Result of method subtract: " + calculator.subtract(5.6, 123.3));
        System.out.println("Result of method multiply: " + calculator.multiply(5.6, 123.3));
        System.out.println("Result of method divide: " + calculator.divide(5.6, 123.3));
    }
}
