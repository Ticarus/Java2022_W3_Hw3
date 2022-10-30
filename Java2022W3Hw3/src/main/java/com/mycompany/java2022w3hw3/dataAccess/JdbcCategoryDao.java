package com.mycompany.java2022w3hw3.dataAccess;

import com.mycompany.java2022w3hw3.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("Category added to database with Jdbc");
    } 
}
