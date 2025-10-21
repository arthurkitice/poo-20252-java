package br.edu.fatecfranca.ExemploAPI.model;

public class Produto {
    private int id, qtde;
    private String nome;
    private float preco;

    public Produto() {
    }

    public Produto(int id, int qtde, String nome, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
