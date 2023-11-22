package ru.aurakhov.myrestspringbootapph2db.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.aurakhov.myrestspringbootapph2db.entity.Student;
import ru.aurakhov.myrestspringbootapph2db.service.StudentService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> showAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
    }

    @GetMapping("student/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        log.info(String.valueOf(student));
        return studentService.saveStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public void updateStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }

}
