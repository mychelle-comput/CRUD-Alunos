package com.example.crud.alunos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/* Usado para API REST */

@RestController
@RequestMapping("/alunosDisciplinass-disciplinas")
public class AlunosDisciplinasController {

    @Autowired
    private AlunosDisciplinasRepository alunosDisciplinasRepository;


    @GetMapping
    public Iterable<AlunosDisciplinas> getAlunosDisciplinass() {
        return alunosDisciplinasRepository.findAll();
    }

    @PostMapping
    public AlunosDisciplinas insertAlunosDisciplinas(@RequestBody AlunosDisciplinas alunosDisciplinas) {
        return alunosDisciplinasRepository.save(alunosDisciplinas);
    }

    @PutMapping
    public AlunosDisciplinas updateAlunosDisciplinas(@RequestBody AlunosDisciplinas alunosDisciplinas) {
        return alunosDisciplinasRepository.save(alunosDisciplinas);
    }

    @DeleteMapping(path = "/{idAluno}/{idDisciplina}")
    public boolean deleteAlunosDisciplinas(@PathVariable("idAluno") Long idAluno,
                                           @PathVariable("idDisciplina") Long idDisciplina) {
        AlunosDisciplinasId id = new AlunosDisciplinasId();
        id.setIdAluno(idAluno);
        id.setIdDisciplina(idDisciplina);

        alunosDisciplinasRepository.deleteById(id);
        return true;
    }
}
