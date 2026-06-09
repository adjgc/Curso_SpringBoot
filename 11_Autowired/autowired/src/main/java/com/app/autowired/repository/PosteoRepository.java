package com.app.autowired.repository;

import com.app.autowired.model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PosteoRepository implements IPosteoRepository{

    @Override
    public List<Posteo> consultarTodos() {
        List<Posteo> listaPosteos = new ArrayList<>();
        listaPosteos.add(new Posteo(1L, "¿Qué es Java?", "Oracle"));
        listaPosteos.add(new Posteo(2L, "IA vs México", "Notidiario"));
        return listaPosteos;
    }
    
}
