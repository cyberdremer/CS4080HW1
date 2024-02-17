package com.cs4080.hw1.question1.employee;

public class BaseEmployee extends  Employee{
    private double baseSalary;


    public BaseEmployee(){
        super();

    }


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Base Salary: " + this.baseSalary);
    }
}
