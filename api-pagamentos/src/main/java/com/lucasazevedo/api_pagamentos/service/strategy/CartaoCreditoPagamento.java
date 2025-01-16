package com.lucasazevedo.api_pagamentos.service.strategy;

public class CartaoCreditoPagamento implements PagamentosStrategy{

    private String cartaoCredito;

    public CartaoCreditoPagamento(String cartaoCredito){
        this.cartaoCredito = cartaoCredito;
    }

    @Override
    public String efetuarPagamentos(double valor) {
        return "Pagamento efetuado no valor: " + valor + " pelo cartão de crédito: " + cartaoCredito;
    }
}
