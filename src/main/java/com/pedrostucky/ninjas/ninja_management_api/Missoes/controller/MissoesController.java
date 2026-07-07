package com.pedrostucky.ninjas.ninja_management_api.Missoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissoesController {
    @PostMapping("/api/v1/missoes/create")
    public String createMissao() {
        return "Criar missão";
    }

    @GetMapping("/api/v1/missoes/all")
    public String findAllMissoes() {
        return "Todas as missões";
    }

    @GetMapping("/api/v1/missoes/{id}")
    public String findMissaoById() {
        return "Missao por ID";
    }

    @PutMapping("/api/v1/missoes/update/{id}")
    public String updateMissao() {
        return "Alterar missao";
    }

    @DeleteMapping("/api/v1/missoes/delete/{id}")
    public String deleteMissao() {
        return "Deletar missao";
    }
}
