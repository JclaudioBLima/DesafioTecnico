package com.exemplo.springboot.service;

import com.exemplo.springboot.model.EstadoFaturamento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FaturamentoPorEstadoService {

    public Map<String, Double> calcularPercentualPorEstado(List<EstadoFaturamento> faturamentos) {
        double valorTotal = faturamentos.stream().mapToDouble(EstadoFaturamento::getValor).sum();
        return faturamentos.stream()
                .collect(Collectors.toMap(
                        EstadoFaturamento::getEstado,
                        estadoFaturamento -> (estadoFaturamento.getValor() / valorTotal) * 100
                ));
    }
//}