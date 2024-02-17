package com.cs4080.hw1.question3.course_driver;

import com.cs4080.hw1.question3.course.Course;
import com.cs4080.hw1.question3.course.Instructor;
import com.cs4080.hw1.question3.course.Textbook;

public class CourseDriver {

    public static void main(String args[]){
        Instructor instructorOne = new Instructor();
        instructorOne.setFirstName("Nima");
        instructorOne.setLastName("Davarpanah");
        instructorOne.setOfficeNumber("3-2626");

        Textbook textbookOne = new Textbook();
        textbookOne.setAuthorName("Jon Jones");
        textbookOne.setPublisher("TechPublishing");
        textbookOne.setTitle("Clean Code");

        Course course1 = new Course();
        course1.setInstructor(instructorOne);
        course1.setTextbook(textbookOne);
        course1.setName("CS4800");

        Instructor instructorTwo = new Instructor();
        instructorTwo.setFirstName("James");
        instructorTwo.setLastName("Jones");
        instructorTwo.setOfficeNumber("3-2727");

        Textbook textbookTwo = new Textbook();
        textbookTwo.setAuthorName("Jones James");
        textbookTwo.setPublisher("IT Publishing");
        textbookTwo.setTitle("Fast and Dirty Optimization");

        Course course2 = new Course();
        course2.setTextbook(textbookTwo);
        course2.setName("CS4990");
        course2.setInstructor(instructorTwo);

        course1.printCourseInfo();

        course2.printCourseInfo();

    }


}
