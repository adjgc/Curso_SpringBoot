package com.app.cursos.service;

import com.app.cursos.model.Curso;
import com.app.cursos.model.Tema;
import com.app.cursos.repository.TemaRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TemaService implements ITemaService {

    private final TemaRepository temaRepository;
    private final ICursoService cursoService;
    
    @Override
    public Tema getTema(Long id_tema) {
        return temaRepository.findById(id_tema).orElse(null);
    }

    @Override
    public Tema saveTema(Tema tema) {
        temaRepository.save(tema);
        return this.getTema(tema.getId_tema());
    }

    @Override
    public List<Tema> getTemasFromCurso(Curso curso) {
        return cursoService.getCurso(curso.getId_curso()).getListaTemas();
    }

    @Override
    public Tema editTema(Tema tema) {
        this.saveTema(tema);
        return this.getTema(tema.getId_tema());
    }
    
}
