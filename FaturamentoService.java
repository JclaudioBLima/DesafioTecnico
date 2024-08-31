package com.exemplo.springboot.service;

import com.exemplo.springboot.model.AnalisarFaturamento;
import com.exemplo.springboot.model.Faturamento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturamentoService {

    public AnalisarFaturamento analisarFaturamento(List<Faturamento> faturamentos) {
        if (faturamentos.isEmpty()) {
            return new AnalisarFaturamento(0, 0, 0);
        }
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double somaValores = 0;
        int diasComFaturamento = 0;
        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() > 0) {
                diasComFaturamento++;
                somaValores += faturamento.getValor();
                menorValor = Math.min(menorValor, faturamento.getValor());
                maiorValor = Math.max(maiorValor, faturamento.getValor());
            }
        }
        double mediaMensal = somaValores / diasComFaturamento;
        int diasAcimaDaMedia = 0;
        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        return new AnalisarFaturamento(menorValor, maiorValor, diasAcimaDaMedia);
    }
}