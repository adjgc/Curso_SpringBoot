package com.app.cursos.service;

import com.app.cursos.model.Curso;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ICursoService {
    
    public Curso getCurso(Long id_curso);
    public List<Curso> getCursos();
    public List<Curso> getCursos(String filtro);
    public Curso saveCurso(Curso curso);
    public Curso editCurso(Curso curso);
    
}
