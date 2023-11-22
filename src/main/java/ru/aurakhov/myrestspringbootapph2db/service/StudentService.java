package ru.aurakhov.myrestspringbootapph2db.service;

import org.springframework.stereotype.Service;
import ru.aurakhov.myrestspringbootapph2db.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
