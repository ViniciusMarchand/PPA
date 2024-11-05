package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;

import java.util.ArrayList;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Disciplina;

// Data Transfer Object
// JavaBean

public class NovaDisciplina {
    // CoC: Convention over Configuration
    // Convenção antes de Configuração
    private String ementa;
    public String getEmenta() {
        return ementa;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public ArrayList<Disciplina> getPreRequisitos() {
        return preRequisitos;
    }
    public void setPreRequisitos(ArrayList<Disciplina> preRequisitos) {
        this.preRequisitos = preRequisitos;
    }
    public Integer getCreditos() {
        return creditos;
    }
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
    private String nome;
    private String cargaHoraria;
    private ArrayList<Disciplina> preRequisitos;
    private Integer creditos;
    

   
    
  

    
}
