package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;

import java.util.ArrayList;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Aluno;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Disciplina;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Matricula;

// Data Transfer Object
// JavaBean

public class NovaMatricula {
    private String numero;
    private boolean aprovacao;
    private Aluno aluno;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public boolean isAprovacao() {
        return aprovacao;
    }
    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
