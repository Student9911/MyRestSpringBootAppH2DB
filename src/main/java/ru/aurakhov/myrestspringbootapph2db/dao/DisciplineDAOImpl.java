package ru.aurakhov.myrestspringbootapph2db.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.aurakhov.myrestspringbootapph2db.entity.Discipline;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Slf4j
@Repository
public class DisciplineDAOImpl implements DisciplineDAO {

    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Discipline> getAllDiscipline() {

        Query query = entityManager.createQuery("from Discipline");
        List<Discipline> allDiscipline = query.getResultList();
        log.info("getAllDiscipline" + allDiscipline);
        return allDiscipline;
    }

    @Override
    public Discipline saveDiscipline(Discipline discipline) {
        return entityManager.merge(discipline);
    }
    @Override
    public Discipline getDiscipline(int id) {

        return entityManager.find(Discipline.class, id);
    }

    @Override
    public void deleteDiscipline(int id) {
        Query query = entityManager.createQuery("delete from Discipline "
                + " where id =:disciplineId");
        query.setParameter("disciplineId", id);
        query.executeUpdate();
        getAllDiscipline();
    }
}
