package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;

import java.util.ArrayList;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Disciplina;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Matricula;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Professor;

// Data Transfer Object
// JavaBean

public class NovaTurma {
    // CoC: Convention over Configuration
    // Convenção antes de Configuração
   private Disciplina disciplina;
    private String semestre;
    private String sala;
    private String periodos;
    private Professor professor;

    
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    private ArrayList<Matricula> matriculas;
    public String getPeriodos() {
        return periodos;
    }
    public void setPeriodos(String periodos) {
        this.periodos = periodos;
    }
    @SuppressWarnings("rawtypes")
    public ArrayList getMatriculas() {
        return matriculas;
    }
    @SuppressWarnings("unchecked")
    public void setMatriculas(ArrayList matriculas) {
        this.matriculas = matriculas;
    }
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
    private int vagas;

   
    
  

    
}
