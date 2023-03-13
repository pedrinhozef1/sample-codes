package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedido {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 4);

        String cliente = "Pedro";
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido(cliente, data, orcamento);

        System.out.println("Salvar pedido no DB");
        System.out.println("Enviar email de novo pedido");
        System.out.println("Enviar um evento");
    }
}
