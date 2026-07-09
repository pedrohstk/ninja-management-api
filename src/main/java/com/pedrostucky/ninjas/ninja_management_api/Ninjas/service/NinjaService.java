package com.pedrostucky.ninjas.ninja_management_api.Ninjas.service;

import com.pedrostucky.ninjas.ninja_management_api.Ninjas.model.NinjaModel;
import com.pedrostucky.ninjas.ninja_management_api.Ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os ninjas
    public List<NinjaModel> findAllNinjas() {
        return ninjaRepository.findAll();
    }

    // Listar ninja por Id
    public NinjaModel findNinjaById(Long id) {
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.orElse(null);
    }

    // Criar um novo ninja
    public NinjaModel createNinja(NinjaModel ninjaModel) {
        return ninjaRepository.save(ninjaModel);
    }

    // Deletar ninja
    public void deleteNinja(Long id) {
        ninjaRepository.deleteById(id);
    }

    // Atualizar ninja
    public NinjaModel updateNinja(Long id, NinjaModel ninjaModel) {
        if (ninjaRepository.existsById(id)) {
            ninjaModel.setId(id);
            return ninjaRepository.save(ninjaModel);
        }
        return null;
    }
}

