package com.example.crud.alunos;

import jakarta.persistence.*;

import java.util.Objects;

@Table(name = "alunos_disciplinas")
@Entity
public class AlunosDisciplinas {

    @EmbeddedId
    @Id
    private AlunosDisciplinasId id;

    public AlunosDisciplinasId getId() {
        return id;
    }

    public void setId(AlunosDisciplinasId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlunosDisciplinas that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AlunosDisciplinas{" +
                "id=" + id +
                '}';
    }
}
