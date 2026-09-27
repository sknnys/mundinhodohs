package br.com.sknnys;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private int idPedidoAtual;
    private double valorTotalPedido;

    public Pedido(Cliente cliente) {
        this.idPedidoAtual = idPedidoAtual++;
        this.cliente = cliente;
    }

    public int getIdPedido() {
        return idPedidoAtual;
    }

    public void setIdPedidoAtual(int idPedidoAtual) {
        this.idPedidoAtual = idPedidoAtual;
    }

    public double getvalorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public void formarPedido(int idPedidoAtual, List<Produto> produtos){
        if(idPedidoAtual == 0){
            idPedidoAtual++;
            setIdPedidoAtual(idPedidoAtual);
        }
        this.produtos = produtos;
    }

}
