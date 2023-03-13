package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        if (tipoImposto.equals(TipoImposto.ICMS)) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        } else if (tipoImposto.equals(TipoImposto.ISS)) {
            return orcamento.getValor().multiply(new BigDecimal("0.6"));
        } else {
            return BigDecimal.ZERO;
        }
    }
}
