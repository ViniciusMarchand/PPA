package br.edu.ifrs.riogrande.tads.ppa.ligaa.service;
// new TurmaService()

import java.util.List;
import org.springframework.stereotype.Service;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Matricula;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.repository.MatriculaRepository;

@Service // qualificando o objeto
public class MatriculaService {

    // dependência
    private final MatriculaRepository matriculaRepository;

    public MatriculaService(MatriculaRepository matriculaRepository) {
        this.matriculaRepository = matriculaRepository;
    }

    public void cadastrarMatricula(NovaMatricula novaMatricula) {

        // ONDE FICAM AS REGRAS DE DOMÍNIO
        Matricula matricula = new Matricula();

        matricula.setNumero(novaMatricula.getNumero());
        matricula.setAprovacao(true);
        matricula.setAluno(novaMatricula.getAluno());
        

        matriculaRepository.save(matricula);        
    }

    public List<Matricula> findAll() {
        return matriculaRepository.findAll();
    }

 
}
