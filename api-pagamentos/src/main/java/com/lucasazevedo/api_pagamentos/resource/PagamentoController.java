package com.lucasazevedo.api_pagamentos.resource;

import com.lucasazevedo.api_pagamentos.dtos.PagamentoDTO;
import com.lucasazevedo.api_pagamentos.service.PagamentoContext;
import com.lucasazevedo.api_pagamentos.service.strategy.BoletoPagamento;
import com.lucasazevedo.api_pagamentos.service.strategy.CartaoCreditoPagamento;
import com.lucasazevedo.api_pagamentos.service.strategy.PixPagamento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @PostMapping
    public ResponseEntity<?> efetuarPagamento(
            @RequestBody PagamentoDTO pagamentoDTO
            ){
        PagamentoContext pagamentoContext = new PagamentoContext();
        try{
            switch (pagamentoDTO.getMetodoPagamento().toUpperCase(Locale.ROOT)) {
                case "PIX" -> {
                    pagamentoContext.setPagamentosStrategy(new PixPagamento(pagamentoDTO.getValorChave()));
                    return ResponseEntity.ok(pagamentoContext.efetuarPagamento(pagamentoDTO.getValor()));
                }
                case "BOLETO" -> {
                    pagamentoContext.setPagamentosStrategy(new BoletoPagamento(pagamentoDTO.getValorChave()));
                    return ResponseEntity.ok(pagamentoContext.efetuarPagamento(pagamentoDTO.getValor()));
                }
                case "CARTAO" -> {
                    pagamentoContext.setPagamentosStrategy(new CartaoCreditoPagamento(pagamentoDTO.getValorChave()));
                    return ResponseEntity.ok(pagamentoContext.efetuarPagamento(pagamentoDTO.getValor()));
                }
            }
            return ResponseEntity.status(404).body("Nenhum método de pagamento encontrado");
        }catch (IllegalArgumentException exception){
            return ResponseEntity.status(404).body(exception.getMessage());
        }
    }
}
