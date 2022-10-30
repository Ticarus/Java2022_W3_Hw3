package com.mycompany.java2022w3hw3.business;

import com.mycompany.java2022w3hw3.core.logger.ILogger;
import com.mycompany.java2022w3hw3.dataAccess.IInstructorDao;
import com.mycompany.java2022w3hw3.entities.Instructor;
import java.util.List;

public class InstructorManager {
    private IInstructorDao _instructorDao;
    private ILogger[] _loggers;
    private List<Instructor> _instructors;
    
    public InstructorManager(){
        
    }
    
    public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers, List<Instructor> instructors){
        _instructorDao = instructorDao;
        _loggers = loggers;
        _instructors = instructors;
    }
    
    public void add(Instructor instructor){
        for(ILogger logger : _loggers){
            logger.log(instructor.getInstructorFirstName());
            logger.log(instructor.getInstructorLastName());
        }
        _instructorDao.add(instructor);
        _instructors.add(instructor);
    }
}
