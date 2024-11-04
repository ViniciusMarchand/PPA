package br.edu.ifrs.riogrande.tads.ppa.ligaa.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Turma;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.TurmaService;
import br.edu.ifrs.riogrande.tads.ppa.ligaa.service.NovaTurma;
import org.springframework.web.bind.annotation.RequestParam;



// Rotear tudo "que tem a ver" com Disciplina

@RestController
public class TurmaController {

    private final TurmaService turmaService;

    // o TurmaService será "injetado" pelo Spring (framework)
    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }
   
    // rotear
    @PostMapping(path = "/api/v1/turma", 
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public void novoAluno(@RequestBody NovaTurma novaTurma) {

        System.out.println(novaTurma);
        turmaService.cadastrarTurma(novaTurma); // não deve ser IDEMPOTENTE
    }
 

    @GetMapping(path = "/api/v1/turma")
    public ResponseEntity<List<Turma>> buscaTodos() {
        return ResponseEntity.ok(turmaService.findAll()); // outras opções: 404 ou 204
    }

    @GetMapping(path = "/api/v1/turma/matricular/{idTurma}/{idMatricula}")
    public String matricularAluno(@PathVariable("idTurma") UUID idTurma, @PathVariable("idMatricula") UUID idMatricula) {

        turmaService.matricularAluno(idTurma, idMatricula);

        return new String();
    }
    

    // public void novoAlunoV2(NovoAlunoV2 disciplina)
}
