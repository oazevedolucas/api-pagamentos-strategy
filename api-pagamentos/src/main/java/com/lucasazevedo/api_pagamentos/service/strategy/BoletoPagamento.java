package com.lucasazevedo.api_pagamentos.service.strategy;

public class BoletoPagamento implements PagamentosStrategy{

    private String codigoBarras;

    public BoletoPagamento(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String efetuarPagamentos(double valor) {
        return "Pagamento efetuado no valor: " + valor + " no código de barras do boleto: " + codigoBarras;
    }
}
