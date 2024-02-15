package com.cs4080.hw1.question1.employee;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    /**
     * Initialize an HourlyEmployee object with the specified parameters.
     * @param firstName
     * @param lastName
     * @param SSN
     * @param wage
     * @param hoursWorked
     */
    public HourlyEmployee(String firstName, String lastName, String SSN, double wage, double hoursWorked){
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
