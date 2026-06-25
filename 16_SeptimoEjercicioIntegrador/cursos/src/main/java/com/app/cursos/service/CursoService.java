package com.app.cursos.service;

import com.app.cursos.model.Curso;
import com.app.cursos.repository.CursoRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CursoService implements ICursoService {
    
    private final CursoRepository cursoRepository;

    @Override
    public Curso getCurso(Long id_curso) {
        return cursoRepository.findById(id_curso).orElse(null);
    }

    @Override
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public List<Curso> getCursos(String filtro) {
        List<Curso> listaCursos = cursoRepository.findAll();
        return listaCursos.stream()
                .filter(curso -> {
                    return curso.getNombre().contains(filtro);
                })
                .collect(Collectors.toList());
    }

    @Override
    public Curso saveCurso(Curso curso) {
        cursoRepository.save(curso);
        return this.getCurso(curso.getId_curso());
    }

    @Override
    public Curso editCurso(Curso curso) {
        this.saveCurso(curso);
        return this.getCurso(curso.getId_curso());
    }
    
}
