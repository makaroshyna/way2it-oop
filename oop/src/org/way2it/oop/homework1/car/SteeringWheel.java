package org.way2it.oop.homework1.car;

public class SteeringWheel {

    private int diameter;

    public SteeringWheel(int diameter) {
        this.diameter = diameter;
    }

    public void changeDiameter(int newDiameter) {
        diameter = newDiameter;
        System.out.println(diameter + " = new diameter of steering wheel");
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
