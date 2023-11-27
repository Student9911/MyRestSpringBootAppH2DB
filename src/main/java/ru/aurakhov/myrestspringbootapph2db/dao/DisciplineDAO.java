package ru.aurakhov.myrestspringbootapph2db.dao;

import org.springframework.stereotype.Repository;
import ru.aurakhov.myrestspringbootapph2db.entity.Discipline;


import java.util.List;

@Repository
public interface DisciplineDAO {

    List<Discipline> getAllDiscipline();

    Discipline saveDiscipline(Discipline discipline);

    Discipline getDiscipline(int id);

    void deleteDiscipline(int id);
}
