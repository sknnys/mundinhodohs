package br.com.sknnys;

public class Cliente {
    private String nome;
    private String bairro;

    public Cliente(String nome, String bairro) {
        this.nome = nome;
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public String getBairro() {
        return bairro;
    }
}
