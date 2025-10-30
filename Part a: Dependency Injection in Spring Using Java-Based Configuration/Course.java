package com.nimbus.springdi;

public class Course {
    private String courseName;

    public Course() {
        this.courseName = "Spring Framework Fundamentals";
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourseInfo() {
        System.out.println("Enrolled Course: " + courseName);
    }
}
