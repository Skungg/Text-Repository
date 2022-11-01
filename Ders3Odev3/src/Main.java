import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCourseDao;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};

        Course course1 = new Course("Java","2022 Java Geliştirici Kampı","Java.jpg",3200);
        Course course2 = new Course("C#", "2020 C# Developer Camp", "Java.jpg", 1000);
        Course course3 = new Course("Java", "2023 C# Developer Camp", "Java.jpg", 5);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);

    }
}