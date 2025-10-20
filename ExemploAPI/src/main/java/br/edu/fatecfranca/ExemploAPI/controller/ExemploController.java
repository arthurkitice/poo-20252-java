package br.edu.fatecfranca.ExemploAPI.controller;

import org.springframework.web.bind.annotation.*;

@RestController //Sempre que chegar um requisição essa classe que vai responder
@RequestMapping("/mensagem") //Classe vai responder pelas requisições "/mensagem"
public class ExemploController {

    //Verbo GET
    @GetMapping
    public String consulta(){
        return "Este método faz um select no banco de dados";
    }

    //Verbo GET
    @GetMapping("/{nome}/sobrenome/{sobrenome}")
    public String consultaPersonalizada(@PathVariable String nome, @PathVariable String sobrenome){
        return "Também faz select, mas agora com a cláusula where, " + nome + " " + sobrenome;
    }

    //Verbo POST
    @PostMapping
    public String insere(){
        return "Este método faz um insert no banco de dados";
    }
}
