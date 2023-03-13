package br.com.alura.loja.pedido;

public class EmailService implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email");
    }
}
