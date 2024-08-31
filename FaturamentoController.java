package com.exemplo.springboot.controller;

import com.exemplo.springboot.model.AnalisarFaturamento;
import com.exemplo.springboot.model.Faturamento;
import com.exemplo.springboot.service.FaturamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FaturamentoController {

    @Autowired
    private FaturamentoService faturamentoService;

    @PostMapping("/faturamento")
    public AnalisarFaturamento analisarFaturamento(@RequestBody List<Faturamento> faturamentos) {
        return faturamentoService.analisarFaturamento(faturamentos);
    }
}