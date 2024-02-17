package com.cs4080.hw1.question1.employee;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    /**
     * Initlialize a SalariedEmployee object with the given parameters.
     * @param firstName
     * @param lastName
     * @param SSN
     * @param weeklySalary
     */
    public SalariedEmployee(){
        super();

    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
