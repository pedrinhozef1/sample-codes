package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadorDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
       Desconto desconto = new DescontoDeCincoItens(
               new DescontoDeValorMaiorQuinhentos(
                       new SemDesconto()
               )
       );

        return desconto.calcular(orcamento);
    }
}
