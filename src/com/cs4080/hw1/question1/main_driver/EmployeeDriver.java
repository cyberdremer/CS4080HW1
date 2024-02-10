package com.cs4080.hw1.question1.main_driver;

import com.cs4080.hw1.question1.employee.*;

public class EmployeeDriver {
    public static void main(String args[]){
        Employee salariedEmployeeOne = new SalariedEmployee("Joe", "Jones", "111-11-111", 2500);
        Employee salariedEmployeeTwo = new SalariedEmployee("Renwa", "Chanel", "555-55-555", 2500);
        Employee hourlyEmployeeOne = new HourlyEmployee("Stephanie", "Smith", "222-22-222", 25, 32);
        Employee hourlyEmployeeTwo = new HourlyEmployee("Mary", "Quinn", "333-33-333", 19, 47);
        Employee comissionedEmployee =
                new ComissionEmployee("Nicole", "Dior", "444-44-444", .15F, 50000);

        Employee baseEmployee = new BaseEmployee("Mike", "Davenport", "666-66-666", 95000);








    }
}
