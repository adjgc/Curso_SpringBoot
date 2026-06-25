package com.app.cursos.controller;

import com.app.cursos.model.Curso;
import com.app.cursos.service.ICursoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CursoController {
    
    private final ICursoService cursoService;
    
    @GetMapping("/cursos")
    public List<Curso> getCursos(){
        return cursoService.getCursos();
    }
    
    @GetMapping("/curso")
    public List<Curso> getCursos(@RequestParam String filtro){
        return cursoService.getCursos(filtro);
    }
    
    @PostMapping("/curso")
    public Curso saveCurso(@RequestBody Curso curso){
        return cursoService.saveCurso(curso);
    }
    
    @PutMapping("/curso")
    public Curso editCurso(@RequestBody Curso curso){
        return cursoService.editCurso(curso);
    }
    
}
