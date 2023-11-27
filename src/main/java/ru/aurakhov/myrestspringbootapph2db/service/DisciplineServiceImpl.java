package ru.aurakhov.myrestspringbootapph2db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aurakhov.myrestspringbootapph2db.dao.DisciplineDAO;
import ru.aurakhov.myrestspringbootapph2db.entity.Discipline;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DisciplineServiceImpl implements DisciplineService{

    @Autowired
    private DisciplineDAO disciplineDAO;

    @Override
    @Transactional
    public List<Discipline> getAllDiscipline() {
        return disciplineDAO.getAllDiscipline();
    }
    @Override
    @Transactional
    public Discipline getDiscipline(int id) {return disciplineDAO.getDiscipline(id);}

    @Override
    @Transactional
    public Discipline saveDiscipline(Discipline discipline)  {
        return disciplineDAO.saveDiscipline(discipline);
    }

    @Override
    @Transactional
    public void deleteDiscipline(int id) {disciplineDAO.deleteDiscipline(id);}

}