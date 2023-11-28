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

        return studentService.getAllStudents();
    }

    @GetMapping("student/{id}")
    public String getStudent(@PathVariable("id") int id) {
        if (studentService.getStudent(id) != null) {
            return studentService.getStudent(id).toString();
        }
        return "не удалось выполнить команду";
    }

    @PostMapping("/students")
    public String saveStudent(@RequestBody Student student) {
        log.info(String.valueOf(student));
        if (studentService.saveStudent(student) != null) {
            return studentService.saveStudent(student).toString();
        }
        return "не удалось выполнить команду";
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public void updateStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }




}


