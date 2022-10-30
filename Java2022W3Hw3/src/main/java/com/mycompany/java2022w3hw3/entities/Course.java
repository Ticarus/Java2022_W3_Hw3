package com.mycompany.java2022w3hw3.entities;

public class Course {
    private int _courseId;
    private int _coursePrice;
    private String _courseName;
    
    public Course(){
        
    }
    
    public Course(int courseId, int coursePrice, String courseName){
        _courseId = courseId;
        _coursePrice = coursePrice;
        _courseName = courseName;
    }

    public int getCourseId() {
        return _courseId;
    }

    public void setCourseId(int courseId) {
        _courseId = courseId;
    }

    public int getCoursePrice() {
        return _coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        _coursePrice = coursePrice;
    }

    public String getCourseName() {
        return _courseName;
    }

    public void setCourseName(String courseName) {
        _courseName = courseName;
    }
}
