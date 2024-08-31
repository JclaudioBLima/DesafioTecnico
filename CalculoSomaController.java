package com.exemplo.springboot.controller;

import com.exemplo.springboot.service.CalculoSomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculoSomaController {

    @Autowired
    private CalculoSomaService calculoSomaService;

    @GetMapping("/soma/{indice}")
    public int calcularSoma(@PathVariable int indice) {
        return calculoSomaService.calcularSoma(indice);
    }
}