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
    public HourlyEmployee(){
        super();

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



    @Override
    public void print(){
        super.print();
        System.out.println("Wage: " + this.wage);
        System.out.println("Hours Worked: " + this.hoursWorked);

    }
}
