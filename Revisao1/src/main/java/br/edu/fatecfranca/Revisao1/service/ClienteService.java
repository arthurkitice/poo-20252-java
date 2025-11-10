package br.edu.fatecfranca.Revisao1.service;

import br.edu.fatecfranca.Revisao1.model.Cliente;
import br.edu.fatecfranca.Revisao1.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id){
        return clienteRepository.findById(id);
    }

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public boolean atualizar(Long id, Cliente clienteAtualizado){
        if(clienteRepository.existsById(id)){
            clienteAtualizado.setId(id);
            clienteRepository.save(clienteAtualizado);
            return true;
        }
        return false;
    }

    public boolean deletar(Long id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
