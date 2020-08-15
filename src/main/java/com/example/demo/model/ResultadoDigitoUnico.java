package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class ResultadoDigitoUnico {
    @Id
    @Column
    private int id;
    @Column
    private String parametroN;
    @Column
    private int parametroK;
    @Column
    private int resultado;
    @ManyToOne
    private Usuario usuario;

    public String getParametroN() {
        return parametroN;
    }

    public void setParametroN(String parametroN) {
        this.parametroN = parametroN;
    }

    public int getParametroK() {
        return parametroK;
    }

    public void setParametroK(int parametroK) {
        this.parametroK = parametroK;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
