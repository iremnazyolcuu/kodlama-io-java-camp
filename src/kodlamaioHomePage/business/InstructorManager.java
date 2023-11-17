package kodlamaioHomePage.business;

import kodlamaioHomePage.core.logging.Logger;
import kodlamaioHomePage.dataAccess.InstructorDao;
import kodlamaioHomePage.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception {
        if (instructor.getFirstName().isEmpty() || instructor.getLastName().isEmpty()) {
            throw new Exception("Instructor's name can NOT be empty!");
        }
        instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}
