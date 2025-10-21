package br.edu.fatecfranca.ExemploAPI.controller;


import org.springframework.web.bind.annotation.*;
import br.edu.fatecfranca.ExemploAPI.model.Produto;

import java.util.ArrayList;
import java.util.List;

@RestController //Sempre que chegar um requisição essa classe que vai responder
@RequestMapping("/produto") //Classe vai responder pelas requisições "/mensagem"
public class ExemploController {
    List<Produto> produtos = new ArrayList<Produto>();

    //Verbo GET
    @GetMapping
    public List<Produto> consulta(){
        return produtos;
    }

    //Verbo GET
    @GetMapping("/{id}")
    public Produto consultaPersonalizada(@PathVariable int id){
        for (Produto produto: produtos){
            if(produto.getId() == id){
                return produto;
            }
        }
        return null;
    }

    //Verbo POST
    @PostMapping
    public Produto insere(@RequestBody Produto produto){ //Serve para pegar os valores dentro da requisição
        produtos.add(produto);
        return produto;
    }

    //Verbo DELETE
    @DeleteMapping("/{id}")
    public Produto remover(@PathVariable int id){
        for (Produto produto: produtos){
            if(produto.getId() == id){
                produtos.remove(produto);
                return produto;
            }
        }
        return null;
    }
}
