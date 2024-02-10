package com.cs4080.hw1.question1.employee;

public class ComissionEmployee extends  Employee{
    private float commissionRate;
    private double grossRate;

    public ComissionEmployee(String firstName, String lastName, String SSN, float commissionRate, double grossRate){
        super(firstName, lastName, SSN);
        this.commissionRate = commissionRate;
        this.grossRate = grossRate;
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
}
