package kodlamaioHomePage.dataAccess;

import kodlamaioHomePage.entities.Category;
import kodlamaioHomePage.entities.Course;
import kodlamaioHomePage.entities.Instructor;

public class Jdbc implements CourseDao, CategoryDao, InstructorDao {
    @Override
    public void add(Category category) {
        System.out.println("Category added with JDBC");
    }

    @Override
    public void add(Course course) {
        System.out.println("Course added with JDBC");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added with JDBC");
    }
}
