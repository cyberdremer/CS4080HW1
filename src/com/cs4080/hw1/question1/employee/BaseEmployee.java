package com.cs4080.hw1.question1.employee;

public class BaseEmployee extends  Employee{
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String SSN, double baseSalary){
        super(firstName, lastName, SSN);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
