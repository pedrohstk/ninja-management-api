package com.pedrostucky.ninjas.ninja_management_api.Ninjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    // Adicionar Ninja (CREATE)
    @PostMapping("/api/v1/ninja/create")
    public String createNinja() {
        return "Ninja cadastrado com sucesso";
    }
    // Procurar Ninja por Id (READ)
    @GetMapping("/api/v1/ninja/{id}")
    public String getNinjaById() {
        return "Ninja por id";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("api/v1/ninja/all")
    public String getAllNinjas() {
        return "Ninjas";
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/api/v1/ninja/update/{id}")
    public String updateNinja() {
        return "Alterar ninja";
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/api/v1/ninja/delete/{id}")
    public String deleteNinja() {
        return "Deletar ninja";
    }
}