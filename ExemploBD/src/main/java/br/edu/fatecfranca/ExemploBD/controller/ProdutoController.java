package br.edu.fatecfranca.ExemploBD.controller;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Responsável por requisições REST
@RequestMapping("/produto") // Endpoint da API
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listaTodos(){
        return produtoService.listaTodos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> listaPorId(@PathVariable Long id){
        return produtoService.listaPorId(id);
    }

    @PostMapping
    public Produto insere(@RequestBody Produto produto) {
        return produtoService.insere(produto);
    }

    @DeleteMapping("/{id}")
    public boolean remover(@PathVariable Long id) {
        return produtoService.remover(id);
    }

    @PutMapping("/{id}")
    public boolean atualizar(@RequestBody Produto produto, @PathVariable Long id) {
        return produtoService.atualizar(produto, id);
    }
}
