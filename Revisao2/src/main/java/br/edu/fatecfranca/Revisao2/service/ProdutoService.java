package br.edu.fatecfranca.Revisao2.service;

import br.edu.fatecfranca.Revisao2.model.Produto;
import br.edu.fatecfranca.Revisao2.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listaTodos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id){
        return produtoRepository.findById(id);
    }

    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }

    public boolean remover(Long id){
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean atualizar(Produto produto, Long id) {
        if(produtoRepository.existsById(id)){
            produto.setId(id);
            produtoRepository.save(produto);
            return true;
        }
        return false;
    }

}
