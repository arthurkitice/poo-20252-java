package br.edu.fatecfranca.ExemploBD.service;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    // Injeção de dependência
    // Usar um objeto para chamar um metodo sem precisar instanciá-lo
    @Autowired
    private ProdutoRepository produtoRepository;

    // Metodo que consulta todos os produtos
    public List<Produto> listaTodos(){
        // select * from tb_produto
        return produtoRepository.findAll();
    }
}
