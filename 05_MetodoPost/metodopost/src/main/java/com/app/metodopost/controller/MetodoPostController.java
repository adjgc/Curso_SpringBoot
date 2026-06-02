package com.app.metodopost.controller;

import com.app.metodopost.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetodoPostController {
    
    @PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cliente){
        System.out.println("Cliente creado");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());
    }
    
    @GetMapping("/clientes")
    @ResponseBody
    public List<Cliente> obtenerClientes(){
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente(1L, "Juan", "Perez"));
        listaClientes.add(new Cliente(2L, "Ana", "Jimenez"));
        listaClientes.add(new Cliente(3L, "Jesus", "Cuautle"));
        return listaClientes;
    }
    
    @GetMapping("/pruebacliente")
    ResponseEntity<String> obtenerClientesPrueba(){
        return new ResponseEntity<>("Esta es una prueba de response", HttpStatus.NOT_FOUND);
    }
    
}
