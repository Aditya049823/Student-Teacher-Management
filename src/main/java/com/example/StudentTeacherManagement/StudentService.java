package com.example.StudentTeacherManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.addFun(student);
    }

    public void addTeacher(Teacher teacher) {
        studentRepository.addTeacher(teacher);
    }

    public void addPair(String sname, String tname) {
        studentRepository.addBoth(sname,tname);
    }

    public Student getStudent(String sname) {
        return studentRepository.findStudent(sname);
    }

    public Teacher getTeacher(String tname) {
        return studentRepository.findTeacher(tname);
    }

    public void deletePair(String sname, String tname) {
        studentRepository.delete(sname,tname);
    }
}
