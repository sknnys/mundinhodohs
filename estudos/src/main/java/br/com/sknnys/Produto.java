package br.com.sknnys;

public class Produto {
    private String nomeProduto;
    private double valorUnitario;

    public Produto(String nomeProduto, double valorUnitario) {
        this.nomeProduto = nomeProduto;
        this.valorUnitario = valorUnitario;

    }
    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public double getValorUnitari(){
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    
}
