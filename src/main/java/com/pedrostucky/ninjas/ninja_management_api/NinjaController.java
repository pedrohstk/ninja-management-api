package com.pedrostucky.ninjas.ninja_management_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/")
    public String boasVindas() {
        return "Configuração inicial da primeira rota da API.";
    }
}