package com.mycompany.java2022w3hw3.entities;

public class Category {
    private int _categoryId;
    private String _categoryName;
    
    public Category(){
    
    }
    
    public Category(int categoryId, String categoryName){
        _categoryId = categoryId;
        _categoryName = categoryName;
    }

    public int getCategoryId() {
        return _categoryId;
    }

    public void setCategoryId(int categoryId) {
        _categoryId = categoryId;
    }

    public String getCategoryName() {
        return _categoryName;
    }

    public void setCategoryName(String categoryName) {
        _categoryName = categoryName;
    }   
}
