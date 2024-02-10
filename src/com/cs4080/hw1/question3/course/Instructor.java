package com.cs4080.hw1.question3.course;

public class Instructor {
    private String firstName, lastName;
    private String officeNumber;

    Instructor(){
        firstName = null;
        lastName = null;
        officeNumber = null;
    }

    public Instructor(String firstName, String lastName, String officeNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
