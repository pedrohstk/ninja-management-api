package com.pedrostucky.ninjas.ninja_management_api.Missoes.service;

import com.pedrostucky.ninjas.ninja_management_api.Missoes.model.MissoesModel;
import com.pedrostucky.ninjas.ninja_management_api.Missoes.repository.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {
    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Criar nova missão
    public MissoesModel createMissao(MissoesModel missaoModel) {
        return missoesRepository.save(missaoModel);
    }

    // Listar missoes
    public List<MissoesModel> findAllMissoes() {
        return missoesRepository.findAll();
    }
}
