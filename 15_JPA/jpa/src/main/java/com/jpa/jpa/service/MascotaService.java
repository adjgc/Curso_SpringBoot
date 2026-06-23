package com.jpa.jpa.service;

import com.jpa.jpa.model.Mascota;
import com.jpa.jpa.repository.IMascotaRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MascotaService implements IMascotaService {

    private final IMascotaRepository mascotaRepository;
    
    @Override
    public Mascota getMascota(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public void editMascota(Long idOriginal, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        Mascota mascota = this.getMascota(idOriginal);
        mascota.setNombre(nuevoNombre);
        mascota.setEspecie(nuevaEspecie);
        mascota.setRaza(nuevaRaza);
        mascota.setColor(nuevoColor);
        this.saveMascota(mascota);
    }
    
}
