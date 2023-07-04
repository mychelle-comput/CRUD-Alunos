package com.example.crud.alunos;

import jakarta.persistence.*;

import java.util.Objects;

@Table(name = "disciplina")
@Entity
public class Disciplina {
    @Id // eh um PK = Primary Key
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENT
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}