package org.way2it.oop.homework2.salary;

public class Main {

    public static void main(String[] args) {
        MonthlyPaidWorker monthlyPaidWorker = new MonthlyPaidWorker();
        HourlyPaidWorker hourlyPaidWorker = new HourlyPaidWorker();
        int salaryOfWorker1 = monthlyPaidWorker.getSalary();
        int salaryOfWorker2 = hourlyPaidWorker.getSalary();
    }
}
