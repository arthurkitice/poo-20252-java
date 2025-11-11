package br.edu.fatecfranca.Revisao2.controller;

import br.edu.fatecfranca.Revisao2.model.Produto;
import br.edu.fatecfranca.Revisao2.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listaTodos(){
        return produtoService.listaTodos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> buscarPorId(@PathVariable Long id){
        return produtoService.buscarPorId(id);
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
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
