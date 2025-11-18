package com.cursosdedesarrollo.springboot3security6basico.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String userOnly() {
        return "Solo USER puede ver esto";
    }
}
