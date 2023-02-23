package com.example.StudentTeacherManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("find")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
        return new ResponseEntity<>("new Student added", HttpStatus.CREATED);
    }

    @PostMapping("/add-teacher")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher)
    {
        studentService.addTeacher(teacher);
        return new ResponseEntity<>("new Teacher added",HttpStatus.CREATED);
    }

    @PutMapping("/add-pair")
    public ResponseEntity<String> addPair(@RequestParam("id1") String sname,@RequestParam("id2") String tname)
    {
        studentService.addPair(sname,tname);
        return new ResponseEntity<>("pair added sucessfully",HttpStatus.CREATED);
    }

    @GetMapping("/get-student")
    public ResponseEntity<Student> getStudent(@RequestParam("id") String sname)
    {
        Student student=studentService.getStudent(sname);
        return new ResponseEntity<>(student,HttpStatus.FOUND);
    }

    @GetMapping("/get-teacher/{name}")
    public ResponseEntity<Teacher> getTeacher(@PathVariable("id") String tname)
    {
        Teacher teacher=studentService.getTeacher(tname);
        return new ResponseEntity<>(teacher,HttpStatus.FOUND);
    }

    @DeleteMapping("/delete-pair")
    public ResponseEntity<String> deletePair(@RequestParam("id1") String sname,@RequestParam("id2") String tname)
    {
        studentService.deletePair(sname,tname);
        return new ResponseEntity<>("Pair deleted",HttpStatus.GONE);
    }
}
