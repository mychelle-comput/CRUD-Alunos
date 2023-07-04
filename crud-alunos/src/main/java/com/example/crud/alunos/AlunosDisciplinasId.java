package com.example.crud.alunos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class AlunosDisciplinasId {

    @Column(name = "aluno_id", nullable = false)
    private Long idAluno;
    @Column(name = "disciplina_id", nullable = false )
    private Long idDisciplina;

    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public Long getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlunosDisciplinasId that)) return false;
        return Objects.equals(idAluno, that.idAluno) && Objects.equals(idDisciplina, that.idDisciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAluno, idDisciplina);
    }

    @Override
    public String toString() {
        return "AlunosDisciplinasId{" +
                "idAluno=" + idAluno +
                ", idDisciplina=" + idDisciplina +
                '}';
    }
}
