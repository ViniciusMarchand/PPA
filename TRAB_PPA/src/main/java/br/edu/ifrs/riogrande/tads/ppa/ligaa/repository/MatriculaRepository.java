package br.edu.ifrs.riogrande.tads.ppa.ligaa.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.entity.Matricula;

@Repository
public class MatriculaRepository implements IRepository<Matricula> {
    private Map<UUID, Matricula> mapa = new HashMap<>();

    @Override
    public Matricula save(Matricula t) {
        LocalDateTime agora = LocalDateTime.now();
        
        if (t.getId() == null) { // não é persistente
            t.setDataHoraCriacao(agora);
            t.setId(UUID.randomUUID()); // atribuir um ID
        }
        
        
        t.setDataHoraAlteracao(agora);
        
        mapa.put(t.getId(), t);
        
        return t;
    }

    @Override
    public boolean delete(Matricula e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Matricula> findAll() {
        return new ArrayList<Matricula>(mapa.values());
    }

    public Matricula findById(UUID id) {
        return mapa.get(id);
    }
}
