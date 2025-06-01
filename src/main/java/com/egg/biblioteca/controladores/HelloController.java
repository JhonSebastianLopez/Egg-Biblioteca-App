package com.egg.biblioteca.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hola() {
        return "Hola desde Railway!";
    }
}