package org.way2it.oop.homework3.sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws IncorrectInputException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.nextLine();
        String b = sc.nextLine();
        sum(a, b);
    }

    public static void sum(String a, String b) throws IncorrectInputException {
        try {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            System.out.printf("%s + %s = %s", num1, num2, num1 + num2);
        } catch (NumberFormatException e) {
            throw new IncorrectInputException("Input is incorrect!");
        }
    }
}
