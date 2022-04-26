package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerPrueba {

    @GetMapping
    public String getMessage(){
        return "Hola mundo, como estas?";
    }

}
