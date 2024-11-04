package br.edu.ifrs.riogrande.tads.ppa.ligaa.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Matricula {
    private UUID id;
    private String numero;
    private boolean aprovacao;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime dataHoraAlteracao;
    private Aluno aluno;

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
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
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
