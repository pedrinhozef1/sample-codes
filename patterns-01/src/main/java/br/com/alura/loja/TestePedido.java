package br.com.alura.loja;

import br.com.alura.loja.pedido.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = "Pedro Lucas";
        BigDecimal valorOrcamento = new BigDecimal("800");
        int quantidadeItens = 6;

        GeraPedido gerarPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

        EmailService emailService = new EmailService();
        PedidoService pedidoService = new PedidoService();

        List acoes = Arrays.asList(emailService, pedidoService);

        GeraPedidoHandler handler = new GeraPedidoHandler(acoes);
        handler.execute(gerarPedido);
    }
}
