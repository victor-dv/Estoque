package models;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Produto> produtos;
    private List<Integer> quantidade;


    public Pedido(){}
    public Pedido(Cliente cliente, Vendedor vendedor, List<Produto> produtos, List<Integer> quantidade){
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.produtos = produtos;
    this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Integer> getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(List<Integer> quantidade) {
        this.quantidade = quantidade;
    }
}
