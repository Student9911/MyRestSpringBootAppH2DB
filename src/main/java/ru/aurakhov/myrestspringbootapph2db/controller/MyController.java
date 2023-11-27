package ru.aurakhov.myrestspringbootapph2db.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.aurakhov.myrestspringbootapph2db.entity.Discipline;
import ru.aurakhov.myrestspringbootapph2db.entity.Student;
import ru.aurakhov.myrestspringbootapph2db.service.DisciplineService;
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

    //discipline
    @Autowired
    private DisciplineService disciplineService;

    @GetMapping("/discipline")
    public List<Discipline> showAllDiscipline() {
        List<Discipline> allDiscipline = disciplineService.getAllDiscipline();
        return allDiscipline;
    }

    @GetMapping("/discipline/{id}")
    public Discipline getDiscipline(@PathVariable("id") int id) {
        return disciplineService.getDiscipline(id);
    }

    @PostMapping("/discipline")
    public Discipline saveDiscipline(@RequestBody Discipline discipline) {
        return disciplineService.saveDiscipline(discipline);
    }

    @PutMapping("/discipline")
    public Discipline updateDiscipline(@RequestBody Discipline discipline){
        disciplineService.saveDiscipline(discipline);
        return discipline;
    }

    @DeleteMapping("/discipline{id}")
    public List<Discipline> updateDiscipline(@PathVariable ("id") int id) {disciplineService.deleteDiscipline(id);
        List<Discipline> allDiscipline = disciplineService.getAllDiscipline();
        return allDiscipline;
    }
}


