package com.example.crud.alunos.repository;

import com.example.crud.alunos.model.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/* Usado para interagir com o banco de dados */
@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {
}
