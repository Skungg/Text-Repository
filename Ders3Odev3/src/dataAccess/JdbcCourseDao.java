package dataAccess;

import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao{
    List<Course> courses = new ArrayList<Course>();
    @Override
    public void add(Course course) {
        courses.add(course);
        System.out.println("Kurslar Jdbc ile eklendi");
    }

    @Override
    public List<Course> getAll() {
        return this.courses;
    }
}
