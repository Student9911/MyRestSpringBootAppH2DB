package ru.aurakhov.myrestspringbootapph2db.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.aurakhov.myrestspringbootapph2db.entity.Discipline;
import ru.aurakhov.myrestspringbootapph2db.service.DisciplineService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class ControllerDiscipline {

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
    public Discipline updateDiscipline(@RequestBody Discipline discipline) {
        disciplineService.saveDiscipline(discipline);
        return discipline;
    }

    @DeleteMapping("/discipline{id}")
    public List<Discipline> updateDiscipline(@PathVariable("id") int id) {
        disciplineService.deleteDiscipline(id);
        List<Discipline> allDiscipline = disciplineService.getAllDiscipline();
        return allDiscipline;
    }


    public ResponseEntity<Response> responseEntity() {
        Response response = new Response();
        // Логика создания объекта response

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }

}
