package br.edu.ifrs.riogrande.tads.ppa.ligaa.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Disciplina;

@Repository // infraestrutura
public class DisciplinaRepository implements IRepository<Disciplina> {

    private Map<UUID, Disciplina> mapa = new HashMap<>();

    @Override
    public Disciplina save(Disciplina a) { // a id=f1323, desativado=true

        LocalDateTime agora = LocalDateTime.now();
        
        if (a.getId() == null) { // não é persistente
            a.setDataHoraCriacao(agora);
            a.setId(UUID.randomUUID()); // atribuir um ID
            a.setDesativada(false);
        }
        
        if (a.isDesativada() || (mapa.containsKey(a.getId()) && mapa.get(a.getId()).isDesativada())) {
            throw new EntidadeInativaException();
        }
        
        a.setDataHoraAlteracao(agora);
        
        mapa.put(a.getId(), a);
        
        return a;
    }

    


    @Override
    public boolean delete(Disciplina e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Disciplina> findAll() {
        return new ArrayList<Disciplina>(mapa.values());
    }

}
