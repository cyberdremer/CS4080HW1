package com.cs4080.hw1.question1.employee;

public class Employee {
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeSocialSecurityNumber;

    public Employee(){
        this.employeeLastName = null;
        this.employeeFirstName = null;
        this.employeeSocialSecurityNumber = null;
    }

    /**
     * Initialize an Employee object wiht the specified information.
     * @param employeeFirstName
     * @param employeeLastName
     * @param employeeSocialSecurityNumber
     */
    public Employee(String employeeFirstName, String employeeLastName, String employeeSocialSecurityNumber){
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeSocialSecurityNumber = employeeSocialSecurityNumber;

    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public void setEmployeeSocialSecurityNumber(String employeeSocialSecurityNumber) {
        this.employeeSocialSecurityNumber = employeeSocialSecurityNumber;
    }

    public String getEmployeeSocialSecurityNumber() {
        return employeeSocialSecurityNumber;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }


    public void print(){
        System.out.println("Employee Name: " + this.employeeFirstName + " " + this.employeeLastName);
        System.out.println("Employee Social Security Number: " + this.employeeSocialSecurityNumber);
    }
}
