package com.engsoft.AgendaVirtual.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import java.util.Date;

@Entity
public class Tasks{
    private @Id @GeneratedValue Long id;
    private String titulo;
    private Boolean feito;
    @Column(nullable = true)
    private Date dia;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private User user;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Boolean getFeito(){
        return feito;
    }

    public void setFeito(Boolean feito){
        this.feito = feito;
    }

    public Date getDia(){
        return dia;
    }

    public void setDia(Date dia){
        this.dia = dia;
    }
}