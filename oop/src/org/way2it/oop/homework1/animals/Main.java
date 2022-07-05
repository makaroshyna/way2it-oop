package org.way2it.oop.homework1.animals;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("lion", 25, 4);
        printAnimalInfo(animal);
        animal.setName("Tiger");
        animal.setSpeed(19);
        animal.setAge(8);
        printAnimalInfo(animal);
    }

    private static void printAnimalInfo(Animal animal) {
        System.out.printf("Name of an animal = %s; ", animal.getName());
        System.out.printf("Speed = %d; ", animal.getSpeed());
        System.out.printf("Age = %d.", animal.getAge());
        System.out.println(" ");
    }
}
