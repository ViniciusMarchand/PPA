package br.edu.ifrs.riogrande.tads.ppa.ligaa.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Turma {

    private UUID id;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime dataHoraAlteracao;
    private Disciplina disciplina;
    private String semestre;
    private String sala;
    private int vagas;
    public Professor professor;

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
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
    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
    private String periodos;
    private ArrayList<Matricula> matriculas = new ArrayList<>();
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }
    public int getVagas() {
        return vagas;
    }
    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
    public String getPeriodos() {
        return periodos;
    }
    public void setPeriodos(String periodos) {
        this.periodos = periodos;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
}
