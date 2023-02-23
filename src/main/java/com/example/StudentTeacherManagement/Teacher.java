package com.example.StudentTeacherManagement;

public class Teacher {

    private String name;
    private int age;
    private int numberofStudents;

    public Teacher() {
    }

    public Teacher(String name, int age, int numberofStudents) {
        this.name = name;
        this.age = age;
        this.numberofStudents = numberofStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberofStudents() {
        return numberofStudents;
    }

    public void setNumberofStudents(int numberofStudents) {
        this.numberofStudents = numberofStudents;
    }
}
