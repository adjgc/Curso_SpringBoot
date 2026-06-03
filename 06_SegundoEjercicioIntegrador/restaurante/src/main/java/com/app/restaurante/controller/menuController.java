package com.app.restaurante.controller;

import com.app.restaurante.model.Platillo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class menuController {

    @GetMapping("/platillo")
    @ResponseBody
    public Platillo consultarPlatillo(@RequestParam int id){
        List<Platillo> menu = new ArrayList<>();
        Platillo filtro = null;
        menu.add(new Platillo(1, "Enchiladas Suizas", 125.50, "Tortillas rellenas de pollo bañadas en salsa verde cremosa y queso gratinado."));
        menu.add(new Platillo(2, "Tacos al Pastor", 95.00, "Orden de 5 tacos con carne de cerdo marinada, piña, cebolla y cilantro."));
        menu.add(new Platillo(3, "Sopa Azteca", 75.00, "Caldo de tomate calientito con tiritas de tortilla frita, aguacate, queso y crema."));
        menu.add(new Platillo(4, "Hamburguesa Clásica", 140.00, "Carne de res jugosa con queso cheddar, lechuga, tomate y guarnición de papas a la francesa."));
        menu.add(new Platillo(5, "Pastel de Chocolate", 65.00, "Rebanada de pastel de chocolate amargo con centro líquido y bola de helado de vainilla."));
        for(Platillo platillo : menu){
            if(platillo.getId() == id){
                filtro = platillo;
            }
        }
        return filtro;
    }
    
}
