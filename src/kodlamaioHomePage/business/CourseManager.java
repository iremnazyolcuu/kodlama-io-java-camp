package kodlamaioHomePage.business;

import kodlamaioHomePage.core.logging.Logger;
import kodlamaioHomePage.dataAccess.CourseDao;
import kodlamaioHomePage.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        if (course.getPrice() < 0) {
            throw new Exception("Course price can NOT be less than 0!");
        }
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }
}
