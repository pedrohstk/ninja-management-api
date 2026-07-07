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
}

