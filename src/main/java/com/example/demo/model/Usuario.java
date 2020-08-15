package com.example.demo.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class Usuario {
    @Id
    @Column
    private int id;
    @Column
    private String nome;
    @Column
    private String email;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Collection<ResultadoDigitoUnico> resultadosDigitoUnico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<ResultadoDigitoUnico> getResultadosDigitoUnico() {
        return resultadosDigitoUnico;
    }

    public void setResultadosDigitoUnico(Collection<ResultadoDigitoUnico> resultadosDigitoUnico) {
        this.resultadosDigitoUnico = resultadosDigitoUnico;
    }


}
