package com.mycompany.java2022w3hw3.entities;

public class Instructor {
    private int _instructorId;
    private int _instructorAge;
    private String _instructorFirstName;
    private String _instructorLastName;
    
    public Instructor(){
        
    }
    
    public Instructor(int instructorId, int instructorAge, String instructorFirstName, String instructorLastName){
        _instructorId = instructorId;
        _instructorAge = instructorAge;
        _instructorFirstName = instructorFirstName;
        _instructorLastName = instructorLastName;
    }

    public int getInstructorId() {
        return _instructorId;
    }

    public void setInstructorId(int instructorId) {
        _instructorId = instructorId;
    }

    public int getInstructorAge() {
        return _instructorAge;
    }

    public void setInstructorAge(int instructorAge) {
        _instructorAge = instructorAge;
    }

    public String getInstructorFirstName() {
        return _instructorFirstName;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        _instructorFirstName = instructorFirstName;
    }

    public String getInstructorLastName() {
        return _instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        _instructorLastName = instructorLastName;
    }
}
