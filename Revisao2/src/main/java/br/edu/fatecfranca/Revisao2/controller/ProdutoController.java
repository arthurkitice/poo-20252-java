package br.edu.fatecfranca.Revisao2.controller;

import br.edu.fatecfranca.Revisao2.model.Produto;
import br.edu.fatecfranca.Revisao2.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
    @RestController
            - Indica que a classe é um Controller e que os métodos retornam diretamente JSON
            (sem precisar usar @ResponseBody).
            - Usada para APIs REST.
*/
@RestController
@RequestMapping("/produto")
public class ProdutoController {
    /*
        ==============================================================
                 CONCEITOS GERAIS SOBRE MVC EM POO (Controller / Service / Repository)
        ==============================================================

        MVC (Model–View–Controller) é um padrão arquitetural que separa as responsabilidades
        da aplicação em três camadas principais. No contexto de APIs Java/Spring Boot, usamos
        uma variação chamada "Controller–Service–Repository".

        --------------------------------------------------------------
        1. CONTROLLER
        --------------------------------------------------------------
        - É a camada que RECEBE as requisições HTTP (GET, POST, PUT, DELETE, ...).
        - Conversa com o Service para executar lógica de negócio.
        - Retorna respostas HTTP (JSON, status codes, mensagens, etc.).
        - Não deve conter regras de negócio — apenas delegar e organizar a entrada/saída.

        Exemplo: controlar rotas, parâmetros, headers, resposta, status code.
        --------------------------------------------------------------
    */
    /*
        @RequestMapping("/alguma/rota")
                - Define a rota/base que aquele Controller responde.
                - Pode ser usada em classe ou métodos.
                - Ex: @RequestMapping("/usuarios") → todos os métodos começam com /usuarios.
    */
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listaTodos(){
        return produtoService.listaTodos();
    }

    /*
        @GetMapping("/x")
            - Mapeia requisições HTTP GET.
                - Usado para buscar dados.
    */
    @GetMapping("/{id}")
    public Optional<Produto> buscarPorId(@PathVariable Long id){
        return produtoService.buscarPorId(id);
    }

    /*
        @PostMapping("/x")
            - Mapeia requisições HTTP POST.
                - Usado para criar dados novos.
    */
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }

    /*
        @DeleteMapping("/x")
            - Mapeia requisições HTTP DELETE.
                - Usado para deletar recursos.
    */
    @DeleteMapping("/{id}")
    public boolean remover(@PathVariable Long id) {
        return produtoService.remover(id);
    }

    /*
        @PutMapping("/x")
            - Mapeia requisições HTTP PUT.
                - Usado para atualizar recursos existentes.
    */
    @PutMapping("/{id}")
    public boolean atualizar(@RequestBody Produto produto, @PathVariable Long id) {
        return produtoService.atualizar(produto, id);
    }
}
