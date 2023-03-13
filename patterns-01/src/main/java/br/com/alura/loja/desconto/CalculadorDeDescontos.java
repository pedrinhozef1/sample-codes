package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadorDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal desconto = new DescontoDeCincoItens().calcular(orcamento);

        if (desconto == BigDecimal.ZERO) {
            desconto = new DescontoDeValorMaiorQuinhentos().calcular(orcamento);
        }

        return BigDecimal.ZERO;
    }
}
