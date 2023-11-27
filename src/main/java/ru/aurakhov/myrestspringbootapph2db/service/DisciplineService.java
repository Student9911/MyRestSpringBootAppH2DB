package ru.aurakhov.myrestspringbootapph2db.service;


import org.springframework.stereotype.Service;
import ru.aurakhov.myrestspringbootapph2db.entity.Discipline;

import java.util.List;

@Service
public interface DisciplineService {

    List<Discipline> getAllDiscipline();

    Discipline getDiscipline(int id);

    Discipline saveDiscipline(Discipline discipline);

    void deleteDiscipline(int id);
}
