package com.cursosdedesarrollo.springboot3security6basico.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String main(){
        return "Hola";
    }
}
