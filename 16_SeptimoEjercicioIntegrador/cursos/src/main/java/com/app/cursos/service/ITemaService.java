package com.app.cursos.service;

import com.app.cursos.model.Curso;
import com.app.cursos.model.Tema;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ITemaService {
    
    public Tema getTema(Long id_tema);
    public Tema saveTema(Tema tema);
    public List<Tema> getTemasFromCurso(Curso curso);
    public Tema editTema(Tema tema);
    
}
