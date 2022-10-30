package com.mycompany.java2022w3hw3.business;

import com.mycompany.java2022w3hw3.dataAccess.ICategoryDao;
import com.mycompany.java2022w3hw3.core.logger.ILogger;
import com.mycompany.java2022w3hw3.entities.Category;
import java.util.List;

public class CategoryManager {
    private ICategoryDao _categoryDao;
    private ILogger[] _loggers;
    private List<Category> _categories;
    
    public CategoryManager(){
        
    }
    
    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers, List<Category> categories){
        _categoryDao = categoryDao;
        _loggers = loggers;
        _categories = categories;
    }
    
    public void add(Category category)throws Exception{
        for(Category _category : _categories){
            if(category.getCategoryName() == category.getCategoryName()){
                throw new Exception("Category name can not repeat");
            }
        }
        
        for(ILogger logger : _loggers){
            logger.log(category.getCategoryName());
        }
        _categoryDao.add(category);
        _categories.add(category);
    }
}
