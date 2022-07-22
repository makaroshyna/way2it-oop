package org.way2it.oop.homework2.salary;

public class MonthlyPaidWorker implements Salary {

    @Override
    public int getSalary() {
        int salary = 4000;
        System.out.printf("Salary of the monthly paid worker: %d\n", salary);
        return salary;
    }
}
