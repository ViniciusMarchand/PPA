package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;
// new DisciplinaService()
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Disciplina;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.DisciplinaRepository;

@Service // qualificando o objeto
public class DisciplinaService {

    // dependência
    private final DisciplinaRepository disciplinaRepository;

    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    public void cadastrarDisciplina(NovaDisciplina novaDisciplina) {

        // ONDE FICAM AS REGRAS DE DOMÍNIO
        Disciplina disciplina = new Disciplina();

        disciplina.setEmenta(novaDisciplina.getEmenta());
        disciplina.setNome(novaDisciplina.getNome());
        disciplina.setCreditos(novaDisciplina.getCreditos());
        disciplina.setCargaHoraria(novaDisciplina.getCargaHoraria());
        disciplina.setPreRequisitos(novaDisciplina.getPreRequisitos());

        disciplinaRepository.save(disciplina);        
    }

    public List<Disciplina> findAll() {
        return disciplinaRepository.findAll();
    }

 

   
 
}
