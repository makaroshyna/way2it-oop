package org.way2it.oop.homework1.car;

public class SteeringWheel extends Car {

    private int diameter;

    public SteeringWheel() {
    }

    public void changeDiameter(int newDiameter) {
        diameter = newDiameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                '}';
    }
}
