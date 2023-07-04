package com.example.crud.alunos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/* Usado para API REST */

@RestController
@RequestMapping("/")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;


    @GetMapping
    public Iterable<Aluno> getAlunos() {
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno insertAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @PutMapping
    public Aluno updateAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteAluno(@PathVariable("id") Long id) {
        alunoRepository.deleteById(id);
        return true;
    }
}
