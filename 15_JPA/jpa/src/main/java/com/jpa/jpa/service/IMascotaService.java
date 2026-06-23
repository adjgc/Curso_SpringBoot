package com.jpa.jpa.service;

import com.jpa.jpa.model.Mascota;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IMascotaService {
    
    public Mascota getMascota(Long id);
    
    public List<Mascota> getMascotas();
    
    public void saveMascota(Mascota mascota);
    
    public void deleteMascota(Long id);
    
    public void editMascota(Long idOriginal, 
            String nuevoNombre,
            String nuevaEspecie,
            String nuevaRaza,
            String nuevoColor);
    
}
