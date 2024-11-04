package br.edu.ifrs.riogrande.tads.ppa.ligaa.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class Disciplina {

    private UUID id;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime dataHoraAlteracao;
    private boolean desativada; // false
    private String ementa;
    private String nome;
    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }
    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }
    public LocalDateTime getDataHoraAlteracao() {
        return dataHoraAlteracao;
    }
    public void setDataHoraAlteracao(LocalDateTime dataHoraAlteracao) {
        this.dataHoraAlteracao = dataHoraAlteracao;
    }
    public boolean isDesativada() {
        return desativada;
    }
    public void setDesativada(boolean desativada) {
        this.desativada = desativada;
    }
    private String cargaHoraria;
    private ArrayList<Disciplina> preRequisitos;
    private Integer creditos;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
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
    



}
