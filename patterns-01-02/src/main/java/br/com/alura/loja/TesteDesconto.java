package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadorDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarITem(new ItemOrcamento(new BigDecimal("400")));

        Orcamento segundo = new Orcamento();
        segundo.adicionarITem(new ItemOrcamento(new BigDecimal("400")));

        Orcamento terceiro = new Orcamento();
        terceiro.adicionarITem(new ItemOrcamento(new BigDecimal("400")));

        CalculadorDeDescontos calculadora = new CalculadorDeDescontos();

        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));
    }
}