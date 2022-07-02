package org.way2it.oop.homework1.car;

public class Car {

    private int cylindersNumber;
    private String label;
    private CarBody carBody;
    private SteeringWheel steeringWheel;
    private Wheel wheel;

    public Car(int cylindersNumber, String label, CarBody carBody, SteeringWheel steeringWheel, Wheel wheel) {
        this.cylindersNumber = cylindersNumber;
        this.label = label;
        this.carBody = carBody;
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
    }

    public void getSound() {
        System.out.println("What a " + label + " car sound like:");
        switch (label) {
            case "BMW" -> System.out.print("WROOM");
            case "Audi" -> System.out.print("RRRR");
            case "Ford" -> System.out.print("WRRM");
        }
    }

    public void changeEngineType(int newEngineType) {
        cylindersNumber = newEngineType;
        System.out.println(cylindersNumber + " = new number of cylinders");
    }

    public int getEngineType(int i) {
        return cylindersNumber;
    }

    public void setCylindersNumber(int cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType=" + cylindersNumber +
                ", label='" + label + '\'' +
                ", carBody=" + carBody +
                ", steeringWheel=" + steeringWheel +
                ", wheel=" + wheel +
                '}';
    }
}
