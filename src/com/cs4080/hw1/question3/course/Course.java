package com.cs4080.hw1.question3.course;

public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(){
        name = null;
        textbook = null;
        instructor = null;

    }



    public Instructor getInstructor() {
        return instructor;
    }

    public String getName() {
        return name;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void printCourseInfo(){
        System.out.println("\nCourse Name: " + this.name +
                "\nInstructor Name: " + this.instructor.getFirstName() + " " + this.instructor.getLastName() +
                "\nCourse textbook: " + this.textbook.getTitle() +
                "\nTextbook author: " + this.textbook.getAuthorName());
    }
}
