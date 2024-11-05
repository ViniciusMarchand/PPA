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

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Professor;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.ProfessorService;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.NovoProfessor;
@RestController
public class ProfessorController {
    private final ProfessorService professorService;

    // o ProfessorService será "injetado" pelo Spring (framework)
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }
   
    // rotear
    @PostMapping(path = "/api/v1/professores", 
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public void novoAluno(@RequestBody NovoProfessor professor) {

        System.out.println(professor);
        professorService.cadastrarAluno(professor); 
    }
    

    @GetMapping(path = "/api/v1/professores")
    public ResponseEntity<List<Professor>> buscaTodos() {
        return ResponseEntity.ok(professorService.findAll()); 
    }

   
}
