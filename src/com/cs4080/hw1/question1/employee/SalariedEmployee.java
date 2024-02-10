package com.cs4080.hw1.question1.employee;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary){
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;

    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
}
