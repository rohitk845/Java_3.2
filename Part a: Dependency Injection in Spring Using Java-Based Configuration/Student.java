package com.nimbus.springdi;

public class Student {
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void showStudentInfo() {
        System.out.println("Student is studying the following course:");
        course.displayCourseInfo();
    }
}
