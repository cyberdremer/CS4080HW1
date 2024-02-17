package com.cs4080.hw1.question1.employee;

public class ComissionEmployee extends  Employee{
    private float commissionRate;
    private double grossRate;


    public ComissionEmployee(){
        super();
    }

    public double getGrossRate() {
        return grossRate;
    }

    public float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossRate(double grossRate) {
        this.grossRate = grossRate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Commission Rate: " + this.commissionRate);
        System.out.println("Gross Rate: " + this.grossRate);
    }
}
