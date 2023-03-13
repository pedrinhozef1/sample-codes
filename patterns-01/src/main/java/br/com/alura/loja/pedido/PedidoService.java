package br.com.alura.loja.pedido;

public class PedidoService implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido na base de dados");
    }
}
