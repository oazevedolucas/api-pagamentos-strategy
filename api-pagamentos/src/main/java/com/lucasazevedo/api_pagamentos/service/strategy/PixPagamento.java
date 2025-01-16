package com.lucasazevedo.api_pagamentos.service.strategy;

public class PixPagamento implements PagamentosStrategy{

    private String chavePix;

    public PixPagamento(String chavePix){
        this.chavePix = chavePix;
    }

    @Override
    public String efetuarPagamentos(double valor) {
        return "Pagamento efetuado no valor: " + valor + " na chave PIX: " + chavePix;
    }
}
