package br.edu.fatecfranca.Revisao2.service;

import br.edu.fatecfranca.Revisao2.model.Produto;
import br.edu.fatecfranca.Revisao2.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    /*
        2. SERVICE
            --------------------------------------------------------------
                    - Camada de LÓGICA DE NEGÓCIO.
            - Aqui ficam regras, validações, cálculos, verificações, etc.
            - O Controller chama o Service.
            - O Service pode chamar um Repository para acessar o banco de dados.

        Exemplo: validar campos, aplicar regras, impedir duplicações, processar dados.

            --------------------------------------------------------------
    */
    /*
        @Autowired
            - Faz injeção de dependência automática.
            - O Spring cria e injeta um objeto pronto, sem você precisar instanciá-lo com "new".
                - Usado para injetar Services ou Repositories dentro de Controllers/Services.
    */
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
