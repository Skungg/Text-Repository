package dataAccess;

import entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class JdbcTeacherDao implements TeacherDao{
    List<Teacher> teachers = new ArrayList<Teacher>();
    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Öğretmenler Jdbc ile eklendi");
    }
    public List<Teacher> getAll(){
        return this.teachers;
    }
}
