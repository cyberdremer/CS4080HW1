package com.cs4080.hw1.question1.main_driver;

import com.cs4080.hw1.question1.employee.*;

public class EmployeeDriver {
    public static void main(String args[]){
        SalariedEmployee salariedEmployeeOne = new SalariedEmployee();
        salariedEmployeeOne.setEmployeeFirstName("Joe");
        salariedEmployeeOne.setEmployeeLastName("Jones");
        salariedEmployeeOne.setEmployeeSocialSecurityNumber("111-11-111");
        salariedEmployeeOne.setWeeklySalary(2500);

        SalariedEmployee salariedEmployeeTwo = new SalariedEmployee();
        salariedEmployeeTwo.setEmployeeFirstName("Renwa");
        salariedEmployeeTwo.setEmployeeLastName("Chanel");
        salariedEmployeeTwo.setEmployeeSocialSecurityNumber("555-55-555");
        salariedEmployeeTwo.setWeeklySalary(2500);


        HourlyEmployee hourlyEmployeeOne = new HourlyEmployee();
        hourlyEmployeeOne.setEmployeeFirstName("Stephanie");
        hourlyEmployeeOne.setEmployeeLastName("Smith");
        hourlyEmployeeOne.setEmployeeSocialSecurityNumber("222-22-222");
        hourlyEmployeeOne.setWage(25);
        hourlyEmployeeOne.setHoursWorked(32);


        Employee hourlyEmployeeTwo = new HourlyEmployee();
        hourlyEmployeeOne.setEmployeeFirstName("Mary");
        hourlyEmployeeOne.setEmployeeLastName("Quinn");
        hourlyEmployeeOne.setEmployeeSocialSecurityNumber("333-33-333");
        hourlyEmployeeOne.setWage(19);
        hourlyEmployeeOne.setHoursWorked(47);


        ComissionEmployee comissionedEmployee =
                new ComissionEmployee();
        comissionedEmployee.setEmployeeFirstName("Nicole");
        comissionedEmployee.setEmployeeLastName("Dior");
        comissionedEmployee.setEmployeeSocialSecurityNumber("444-44-444");
        comissionedEmployee.setCommissionRate(.15F);
        comissionedEmployee.setGrossRate(50000);

        BaseEmployee baseEmployee = new BaseEmployee();

        baseEmployee.setEmployeeFirstName("Mike");
        baseEmployee.setEmployeeLastName("Davenport");
        baseEmployee.setEmployeeSocialSecurityNumber("666-66-666");
        baseEmployee.setBaseSalary(95000);








    }
}
