package com.lucasazevedo.api_pagamentos.service;

import com.lucasazevedo.api_pagamentos.service.strategy.PagamentosStrategy;
import org.springframework.stereotype.Component;

@Component
public class PagamentoContext {
    private PagamentosStrategy pagamentosStrategy;

    public void setPagamentosStrategy(PagamentosStrategy pagamentosStrategy) {
        this.pagamentosStrategy = pagamentosStrategy;
    }

    public String efetuarPagamento(double valor){
        if(pagamentosStrategy == null){
            throw new IllegalArgumentException("Método de pagamento não configurado");
        }
        return pagamentosStrategy.efetuarPagamentos(valor);
    }
}
