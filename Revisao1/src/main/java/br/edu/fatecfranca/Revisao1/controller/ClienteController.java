package br.edu.fatecfranca.Revisao1.controller;

import br.edu.fatecfranca.Revisao1.model.Cliente;
import br.edu.fatecfranca.Revisao1.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listar(){
        return clienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable Long id){
        return clienteService.buscarPorId(id);
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){
        return clienteService.salvar(cliente);
    }

    @PutMapping("/{id}")
    public boolean atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        return clienteService.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public boolean deletar(@PathVariable Long id){
        return clienteService.deletar(id);
    }
}
