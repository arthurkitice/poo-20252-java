package br.edu.fatecfranca.Revisao2.repository;

import br.edu.fatecfranca.Revisao2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}