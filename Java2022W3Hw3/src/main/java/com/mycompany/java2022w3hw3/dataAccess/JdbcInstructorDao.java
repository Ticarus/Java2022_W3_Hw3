package com.mycompany.java2022w3hw3.dataAccess;

import com.mycompany.java2022w3hw3.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructoe added to database with Jdbc");
    }
    
}
