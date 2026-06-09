package com.app.autowired.repository;

import com.app.autowired.model.Posteo;
import java.util.List;

public interface IPosteoRepository {
    
    public List<Posteo> consultarTodos();
    
}
