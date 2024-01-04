package com.example.crud.alunos.controllers;

import com.example.crud.alunos.model.Disciplina;
import com.example.crud.alunos.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/* Usado para API REST */

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository disciplinaRepository;


    @GetMapping
    public Iterable<Disciplina> getDisciplinas() {
        return disciplinaRepository.findAll();
    }

    @PostMapping
    public Disciplina insertDisciplina(@RequestBody Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @PutMapping
    public Disciplina updateDisciplina(@RequestBody Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteDisciplina(@PathVariable("id") Long id){
       disciplinaRepository.deleteById(id);
       return true;
    }
}
