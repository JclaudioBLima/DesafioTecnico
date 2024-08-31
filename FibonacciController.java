package com.exemplo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.springboot.util.FibonacciUtil;

@RestController
public class FibonacciController {

    @GetMapping("/fibonacci/{numero}")
    public String pertenceFibonacci(@PathVariable int numero) {
        if (FibonacciUtil.pertenceFibonacci(numero)) {
            return "O número " + numero + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + numero + " não pertence à sequência de Fibonacci.";
        }
    }
}