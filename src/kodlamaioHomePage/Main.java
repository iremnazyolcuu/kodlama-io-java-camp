package kodlamaioHomePage;

import kodlamaioHomePage.business.CategoryManager;
import kodlamaioHomePage.business.CourseManager;
import kodlamaioHomePage.business.InstructorManager;
import kodlamaioHomePage.core.logging.DatabaseLogger;
import kodlamaioHomePage.core.logging.FileLogger;
import kodlamaioHomePage.core.logging.Logger;
import kodlamaioHomePage.core.logging.MailLogger;
import kodlamaioHomePage.dataAccess.Hibernate;
import kodlamaioHomePage.dataAccess.Jdbc;
import kodlamaioHomePage.entities.Category;
import kodlamaioHomePage.entities.Course;
import kodlamaioHomePage.entities.Instructor;


public class Main {

    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};
        System.out.println("============================================================");

        Category category = new Category("Programming");
        Category category2 = new Category("Web development");
        Category category3 = new Category("Mobile App Development");
        Category[] categories = new Category[]{category, category2};
        CategoryManager categoryManager = new CategoryManager(new Hibernate(), loggers, categories);
        categoryManager.add(category3);
        System.out.println("============================================================");

        Instructor instructor = new Instructor("Engin", "Demirog");
        Instructor instructor2 = new Instructor("Halit Enes", "Kalayci");
        InstructorManager instructorManager = new InstructorManager(new Jdbc(), loggers);
        instructorManager.add(instructor);
        System.out.println("============================================================");

        Course course = new Course("Java", 100, category, instructor);
        Course course2 = new Course("Python", 80, category, instructor2);
        CourseManager courseManager = new CourseManager(new Hibernate(), loggers);
        courseManager.add(course);
        System.out.println("============================================================");

    }
}
