package dataAccess;

import entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class HibernateTeacherDao implements TeacherDao{
    List<Teacher> teachers = new ArrayList<Teacher>();
    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Öğretmenler hibernate ile eklendi");
    }

    public List<Teacher> getAll(){
        return this.teachers;
    }
}
