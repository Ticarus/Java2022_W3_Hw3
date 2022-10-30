package com.mycompany.java2022w3hw3;

import com.mycompany.java2022w3hw3.business.CategoryManager;
import com.mycompany.java2022w3hw3.business.CourseManager;
import com.mycompany.java2022w3hw3.business.InstructorManager;
import com.mycompany.java2022w3hw3.core.logger.DatabaseLogger;
import com.mycompany.java2022w3hw3.core.logger.FileLogger;
import com.mycompany.java2022w3hw3.core.logger.ILogger;
import com.mycompany.java2022w3hw3.core.logger.MailLogger;
import com.mycompany.java2022w3hw3.dataAccess.HibernateCategoryDao;
import com.mycompany.java2022w3hw3.dataAccess.HibernateCourseDao;
import com.mycompany.java2022w3hw3.dataAccess.HibernateInstructorDao;
import com.mycompany.java2022w3hw3.dataAccess.JdbcCategoryDao;
import com.mycompany.java2022w3hw3.dataAccess.JdbcCourseDao;
import com.mycompany.java2022w3hw3.dataAccess.JdbcInstructorDao;
import com.mycompany.java2022w3hw3.entities.Category;
import com.mycompany.java2022w3hw3.entities.Course;
import com.mycompany.java2022w3hw3.entities.Instructor;
import java.util.ArrayList;
import java.util.List;

public class Java2022W3Hw3 {

    public static void main(String[] args)throws Exception {
        Course course1 = new Course(1, 100, "Software Developer Camp(C# + ANGULAR)");
        Course course2 = new Course(2, 200, "Senior Software Developer Camp(.NET)");
        Course course3 = new Course(3, 300, "(2022)Software Developer Camp - JAVA");
        List<Course> courses = new ArrayList<>();
        
        ILogger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        
        CourseManager courseManager1 = new CourseManager(new HibernateCourseDao(), loggers, courses);
        courseManager1.add(course1);
        
         System.out.println("\n-----------------------------------------\n");
        
        Category category1 = new Category(1, "All");
        Category category2= new Category(2, "Programming");
        List<Category> categories = new ArrayList<>();
        
        CategoryManager categoryManager1 = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
        categoryManager1.add(category1);
        
        
         System.out.println("\n-----------------------------------------\n");
        
        Instructor instructor1 = new Instructor(2, 30, "Engin", "Demiroğ");
        List<Instructor> instructors = new ArrayList<>();
        
        InstructorManager instructorManager1 = new InstructorManager(new HibernateInstructorDao(), loggers, instructors);
        instructorManager1.add(instructor1);
    }
}
