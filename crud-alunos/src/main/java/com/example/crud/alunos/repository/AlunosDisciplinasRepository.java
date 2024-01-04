package com.example.crud.alunos.repository;

import com.example.crud.alunos.model.AlunosDisciplinas;
import com.example.crud.alunos.model.AlunosDisciplinasId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/* Usado para interagir com o banco de dados */
@Repository
public interface AlunosDisciplinasRepository extends CrudRepository<AlunosDisciplinas, AlunosDisciplinasId> {

}
