package org.way2it.oop.homework2.calulator.second;

import org.way2it.oop.homework2.calculator.first.Numerable;

public class Calculator implements Numerable {

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }
}
