package org.way2it.oop.homework3.numbers;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        sc.nextLine();
        double b = sc.nextDouble();

        if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        } else if (a == 0 && b == 0) {
            throw new IllegalArgumentException();
        } else if (a > 0 && b > 0) {
            throw new MyException("Input is incorrect!");
        }

        Methods methods = new Methods();
        System.out.println("Result of method add: " + methods.add(5.6, 123.3));
        System.out.println("Result of method subtract: " + methods.subtract(5.6, 123.3));
        System.out.println("Result of method multiply: " + methods.multiply(5.6, 123.3));
        System.out.println("Result of method divide: " + methods.divide(5.6, 123.3));
    }
}
