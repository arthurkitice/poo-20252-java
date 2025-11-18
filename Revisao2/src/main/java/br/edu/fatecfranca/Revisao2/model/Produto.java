package br.edu.fatecfranca.Revisao2.model;

/*
    RESUMÃO DO FLUXO
            --------------------------------------------------------------
            (Usuario faz requisição HTTP)
            |
            v
            CONTROLLER  → recebe a requisição e delega
            |
            v
            SERVICE   → executa lógica de negócio
            |
            v
            REPOSITORY  → acessa o banco de dados
            |
            v
            SERVICE / CONTROLLER → retorna resposta ao usuário

            ==============================================================
*/

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_pedido_entrega")
public class Produto {
    /*
        perguntas 1 e 2 sobre classe abstrata e interface, uma delas é pra falar a incorreta.
        3 e 4 perguntas com códigos para analisar a implementação. 5 em diante perguntas sobre
        API: sobre qual retorna requisições (@RestController ), sobre de onde que vem o método
        .save(produto) no ProdutoService (produtoRepository.save(), do Repository), Qual a função
        do ProdutoRepository (criar os métodos prontos do JpaRepository), a ordem correta do fluxo
        (Controller, Service, Repository,Banco de dados)
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Double preco;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataEntrega;

    public Produto() {
    }

    public Produto(String descricao, Double preco, LocalDate dataEntrega) {
        this.descricao = descricao;
        this.preco = preco;
        this.dataEntrega = dataEntrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
