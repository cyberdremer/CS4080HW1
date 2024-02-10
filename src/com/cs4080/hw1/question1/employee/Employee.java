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
}
