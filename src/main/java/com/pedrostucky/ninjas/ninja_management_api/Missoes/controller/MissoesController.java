package com.pedrostucky.ninjas.ninja_management_api.Missoes.controller;

import com.pedrostucky.ninjas.ninja_management_api.Missoes.model.MissoesModel;
import com.pedrostucky.ninjas.ninja_management_api.Missoes.service.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/missoes")
public class MissoesController {
    private final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping("/create")
    public MissoesModel createMissao(@RequestBody MissoesModel missoesModel) {
        return missoesService.createMissao(missoesModel);
    }

    @GetMapping("/find")
    public List<MissoesModel> findAllMissoes() {
        return missoesService.findAllMissoes();
    }

    @GetMapping("/find/{id}")
    public String findMissaoById() {
        return "Missao por ID";
    }

    @PutMapping("/update/{id}")
    public String updateMissao() {
        return "Alterar missao";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMissao() {
        return "Deletar missao";
    }
}
