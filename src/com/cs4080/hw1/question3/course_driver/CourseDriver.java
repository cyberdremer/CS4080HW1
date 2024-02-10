package com.cs4080.hw1.question3.course_driver;

import com.cs4080.hw1.question3.course.Course;
import com.cs4080.hw1.question3.course.Instructor;
import com.cs4080.hw1.question3.course.Textbook;

public class CourseDriver {

    public static void main(String args[]){
        Instructor instructorOne = new Instructor("Nima", "Davarpanah" ,"3-2626");
        Textbook textbookOne = new Textbook("Jon Jones" ,"Clean Code", "TechPublishing");
        Course course1 = new Course("CS4080", instructorOne, textbookOne );

        course1.printCourseInfo();

    }


}
