package com.pedrostucky.ninjas.ninja_management_api.Ninjas.controller;

import com.pedrostucky.ninjas.ninja_management_api.Ninjas.model.NinjaModel;
import com.pedrostucky.ninjas.ninja_management_api.Ninjas.service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/create")
    public NinjaModel createNinja(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.createNinja(ninjaModel);
    }
    // Procurar Ninja por Id (READ)
    @GetMapping("/find/{id}")
    public NinjaModel findNinjaById(@PathVariable Long id) {
        return ninjaService.findNinjaById(id);
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/find")
    public List<NinjaModel> findAllNinjas() {
        return ninjaService.findAllNinjas();
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/update/{id}")
    public String updateNinja() {
        return "Alterar ninja";
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/delete/{id}")
    public String deleteNinja() {
        return "Deletar ninja";
    }
}