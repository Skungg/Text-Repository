package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public void add(Course course)throws Exception{
        for(Course turnCourses: courseDao.getAll()){
            if(turnCourses.getCourseName().equals(course.getCourseName())){
                throw new Exception("Kurs ismi tekrar edemez!!");
            }
        }
        if(course.getCourseUnitePrice()<10){
            throw new Exception("Kurs fiyatı 10'dan küçük olamaz!!");
        }
        courseDao.add(course);

        for(Logger logger: loggers){
            logger.log(course.getCourseName());
        }
    }
}
