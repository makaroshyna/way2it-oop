package org.way2it.oop.homework1.robot;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotCook robotCook = new RobotCook();
        RobotDancer robotDancer = new RobotDancer();

        Robot[] robotArray = {robot, coffeeRobot, robotCook, robotDancer};

        for (Robot value : robotArray) {
            value.work();
        }
    }
}
