package br.com.alura.loja.pedido;

public class LogDePedido implements AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
