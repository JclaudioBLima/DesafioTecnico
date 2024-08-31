package com.exemplo.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class CalculoSomaService {

    public int calcularSoma(int indice) {
        int soma = 0;
        for (int k = 1; k < indice; k++) {
            soma += k;
        }
        return soma;
    }
}