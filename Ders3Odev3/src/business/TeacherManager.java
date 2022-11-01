package business;

import core.logging.Logger;
import dataAccess.TeacherDao;
import entities.Teacher;

public class TeacherManager {
    private TeacherDao teacherDao;
    private Logger[] loggers;

    public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }
    public void add(Teacher teacher){
        teacherDao.add(teacher);

        for(Logger logger: loggers){
            logger.log(teacher.getFirstName());
        }
    }
}
