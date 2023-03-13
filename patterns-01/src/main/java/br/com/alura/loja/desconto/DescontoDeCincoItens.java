package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoDeCincoItens extends Desconto {

    public DescontoDeCincoItens(Desconto proximo) {
        super(proximo);
    }
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento){
        return orcamento.getQuantidadeItens() > 5;
    }
}
