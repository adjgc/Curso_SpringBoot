package com.app.cursos.controller;

import com.app.cursos.model.Curso;
import com.app.cursos.model.Tema;
import com.app.cursos.service.ITemaService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TemaController {
    
    private final ITemaService temaService;
    
    @GetMapping("/temas/from")
    public List<Tema> getTemas(@RequestBody Curso curso){
        return temaService.getTemasFromCurso(curso);
    }
    
    @PostMapping("/tema")
    public Tema saveTema(@RequestBody Tema tema){
        return temaService.saveTema(tema);
    }
    
    @PutMapping("/tema")
    public Tema editTema(@RequestBody Tema tema){
        return temaService.editTema(tema);
    }
    
}
