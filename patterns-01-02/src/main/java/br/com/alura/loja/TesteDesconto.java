package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadorDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento teste = new Orcamento(new BigDecimal("6000"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("500"), 1);

        CalculadorDeDescontos calculadora = new CalculadorDeDescontos();

        System.out.println(calculadora.calcular(teste));
        System.out.println(calculadora.calcular(segundoOrcamento));
    }
}