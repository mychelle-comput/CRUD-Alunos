package com.example.crud.alunos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/* Usado para interagir com o banco de dados */
@Repository
public interface DisciplinaRepository extends CrudRepository<Disciplina, Long> {
}
