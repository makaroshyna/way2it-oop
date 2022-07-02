package org.way2it.oop.homework1.car;

public class Main {

    public static void main(String[] args) {
        CarBody carBody = new CarBody(2.5, 1.5);
        SteeringWheel steeringWheel = new SteeringWheel(25);
        Wheel wheel = new Wheel(50);
        Car car = new Car(4, "BMW", carBody, steeringWheel, wheel);

        System.out.println(car.toString());
        carBody.changeHeight(1.4);
        carBody.changeLength(2.4);
        steeringWheel.changeDiameter(26);
        wheel.changeSize(55);
        car.changeEngineType(2);
        car.getSound();
    }
}
