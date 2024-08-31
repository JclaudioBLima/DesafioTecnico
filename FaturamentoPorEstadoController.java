package com.exemplo.springboot.controller;

import com.exemplo.springboot.model.EstadoFaturamento;
import com.exemplo.springboot.service.FaturamentoPorEstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class FaturamentoPorEstadoController {

    @Autowired
    private FaturamentoPorEstadoService faturamentoPorEstadoService;

    @PostMapping("/faturamento/estado")
    public Map<String, Double> calcularPercentualPorEstado(@RequestBody List<EstadoFaturamento> faturamentos) {
        return faturamentoPorEstadoService.calcularPercentualPorEstado(faturamentos);
    }
}