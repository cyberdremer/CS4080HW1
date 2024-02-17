package com.cs4080.hw1.question3.course;

public class Instructor {
    private String firstName, lastName;
    private String officeNumber;

    public Instructor(){
        firstName = null;
        lastName = null;
        officeNumber = null;
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
