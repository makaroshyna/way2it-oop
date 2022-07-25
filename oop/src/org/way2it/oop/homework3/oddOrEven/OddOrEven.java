package org.way2it.oop.homework3.oddOrEven;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) throws NumberNotIntegerException {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        oddOrEven(num);
    }

    public static void oddOrEven(double number) throws NumberNotIntegerException {
        if (number % 2 == 0) {
            System.out.print("Number is even!");
        } else if (number % 2 == 1) {
            System.out.print("Number is not even!");
        } else {
            throw new NumberNotIntegerException("Number is not integer!");
        }
    }
}