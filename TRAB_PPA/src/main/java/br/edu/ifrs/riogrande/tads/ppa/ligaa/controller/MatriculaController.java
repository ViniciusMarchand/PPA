package br.edu.ifrs.riogrande.tads.ppa.ligaa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Matricula;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.MatriculaService;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.NovaMatricula;


// Rotear tudo "que tem a ver" com Disciplina

@RestController
public class MatriculaController {

    private final MatriculaService matriculaService;

    // o MatriculaService será "injetado" pelo Spring (framework)
    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }
   
    // rotear
    @PostMapping(path = "/api/v1/matricula", 
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public void novoAluno(@RequestBody NovaMatricula novaMatricula) {

        System.out.println(novaMatricula);
        matriculaService.cadastrarMatricula(novaMatricula); // não deve ser IDEMPOTENTE
    }
 

    @GetMapping(path = "/api/v1/matricula")
    public ResponseEntity<List<Matricula>> buscaTodos() {
        return ResponseEntity.ok(matriculaService.findAll()); // outras opções: 404 ou 204
    }

    // public void novoAlunoV2(NovoAlunoV2 disciplina)
}
