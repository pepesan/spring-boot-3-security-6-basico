package com.cursosdedesarrollo.springboot3security6basico.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String adminOnly() {
        return "Solo ADMIN puede ver esto";
    }
}
