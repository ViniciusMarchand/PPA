package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;
// new TurmaService()

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Matricula;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Turma;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.MatriculaRepository;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.TurmaRepository;

@Service // qualificando o objeto
public class TurmaService {

    // dependência
    private final TurmaRepository turmaRepository;
    private final MatriculaRepository matriculaRepository;

    public TurmaService(TurmaRepository turmaRepository, MatriculaRepository matriculaRepository) {
        this.turmaRepository = turmaRepository;
        this.matriculaRepository = matriculaRepository;
    }

    public void cadastrarTurma(NovaTurma novaTurma) {

        // ONDE FICAM AS REGRAS DE DOMÍNIO
        Turma turma = new Turma();

        turma.setDisciplina(novaTurma.getDisciplina());
        turma.setPeriodos(novaTurma.getPeriodos());
        turma.setSala(novaTurma.getSala());
        turma.setSemestre(novaTurma.getSemestre());
        turma.setVagas(novaTurma.getVagas());
        turma.setMatriculas(new ArrayList<Matricula>(novaTurma.getMatriculas()));
        turma.setProfessor(novaTurma.getProfessor());

        turmaRepository.save(turma);        
    }

    public List<Turma> findAll() {
        return turmaRepository.findAll();
    }

    public void matricularAluno(UUID idTurma, UUID idMatricula) {
        Matricula matricula = matriculaRepository.findById(idMatricula);

        if(matricula == null) {
            throw new RuntimeException("Matrícula não encontrada");
        }

        if(!matricula.isAprovacao()) {
            throw new RuntimeException("Matrícula não aprovada");
        }

        if(turmaRepository.temVaga(idTurma)) {
            throw new RuntimeException("Turma sem vagas");
        }

        turmaRepository.matricularAluno(idTurma, matricula);

    }

 
}
