package com.mycompany.java2022w3hw3.business;

import com.mycompany.java2022w3hw3.core.logger.ILogger;
import com.mycompany.java2022w3hw3.dataAccess.ICourseDao;
import com.mycompany.java2022w3hw3.entities.Course;
import java.util.List;

public class CourseManager {
    private ICourseDao _courseDao;
    private ILogger[] _loggers;
    private List<Course> _courses;
    
    public CourseManager(){
        
    }
    
    public CourseManager(ICourseDao courseDao, ILogger[] loggers, List<Course> courses){
        _courseDao = courseDao;
        _loggers = loggers;
        _courses = courses;
    }
    
    public void add(Course course)throws Exception{
        for(Course _course : _courses){
            if(_course.getCourseName() == _course.getCourseName()){
                throw new Exception("Course name can not repeat");
            }
            if(_course.getCoursePrice() < 0){
                throw new Exception("Course price can not be smaller than 0");
            }
        }
        for(ILogger logger : _loggers){
            logger.log(course.getCourseName());
        }
        _courseDao.add(course);
        _courses.add(course);
    }
}
