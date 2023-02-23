package com.example.StudentTeacherManagement;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {

    private HashMap<String,Student>studentMap;
    private HashMap<String,Teacher>teacherMap;
    private HashMap<String, List<String>>studentTeacherMap;

    public StudentRepository() {
        this.studentMap = new HashMap<>();
        this.teacherMap = new HashMap<>();
        this.studentTeacherMap = new HashMap<>();
    }

    public void addFun(Student student) {
        studentMap.put(student.getName(),student);
    }

    public void addTeacher(Teacher teacher) {
        teacherMap.put(teacher.getName(), teacher);
    }


    public void addBoth(String sname, String tname) {
        if(studentMap.containsKey(sname) && teacherMap.containsKey(tname))
        {
            studentMap.put(sname,studentMap.get(sname));
            teacherMap.put(tname,teacherMap.get(tname));
        }
        List<String>curr=new ArrayList<>();
        if(studentTeacherMap.containsKey(tname))
        {
            curr=studentTeacherMap.get(tname);
        }
        curr.add(sname);
        studentTeacherMap.put(tname,curr);
    }


    public Student findStudent(String sname) {
        return studentMap.get(sname);
    }

    public Teacher findTeacher(String tname) {
        return teacherMap.get(tname);
    }


    public void delete(String sname, String tname) {
        studentTeacherMap.remove(sname,tname);
    }
}
