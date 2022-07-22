package org.way2it.oop.homework2.salary;

public class HourlyPaidWorker implements Salary {

    @Override
    public int getSalary() {
        int salary = 50;
        System.out.printf("Salary of the hourly paid worker: %d\n", salary);
        return salary;
    }
}
