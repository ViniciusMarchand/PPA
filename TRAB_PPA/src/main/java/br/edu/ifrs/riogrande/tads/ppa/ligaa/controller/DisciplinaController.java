package br.edu.ifrs.riogrande.tads.ppa.ligaa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Disciplina;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.DisciplinaService;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.NovaDisciplina;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.NovoAluno;
import org.springframework.web.bind.annotation.RequestParam;


// Rotear tudo "que tem a ver" com Disciplina

@RestController
public class DisciplinaController {

    private final DisciplinaService disciplinaService;

    // o DisciplinaService será "injetado" pelo Spring (framework)
    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }
   
    // rotear
    @PostMapping(path = "/api/v1/disciplinas", 
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public void novoAluno(@RequestBody NovaDisciplina disciplina) {

        System.out.println(disciplina);
        disciplinaService.cadastrarDisciplina(disciplina); // não deve ser IDEMPOTENTE
    }
 

    @GetMapping(path = "/api/v1/disciplinas")
    public ResponseEntity<List<Disciplina>> buscaTodos() {
        return ResponseEntity.ok(disciplinaService.findAll()); // outras opções: 404 ou 204
    }

    // public void novoAlunoV2(NovoAlunoV2 disciplina)
}
