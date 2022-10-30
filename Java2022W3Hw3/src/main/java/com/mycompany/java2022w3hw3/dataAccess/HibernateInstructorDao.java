package com.mycompany.java2022w3hw3.dataAccess;

import com.mycompany.java2022w3hw3.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added to database with Hibernate");
    }   
}
