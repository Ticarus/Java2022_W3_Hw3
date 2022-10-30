package com.mycompany.java2022w3hw3.dataAccess;

import com.mycompany.java2022w3hw3.entities.Course;

public class HibernateCourseDao implements ICourseDao{

    @Override
    public void add(Course course) {
        System.out.println("Course added to database with Hibernate");
    }
}
