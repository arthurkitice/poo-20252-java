package br.edu.fatecfranca.ExemploBD.service;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // Metodo que consulta um produto em particular
    public Optional<Produto> listaPorId(Long id){
        // Se o findById() encontrar um produto, retorna ele
        // Se o findById() não encontrar um produto, retorna null
        return produtoRepository.findById(id);
    }

    // Metodo para inserir um produto na tabela tb_produto
    public Produto insere(Produto produto){
        return produtoRepository.save(produto);
    }

    // Metodo para remover um produto na tabela tb_produto
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
            produtoRepository.save(produto); // Save atualiza caso o mesmo id já existir
            return true;
        }
        return false;
    }

}
