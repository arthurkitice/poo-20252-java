package br.edu.fatecfranca.Revisao2.repository;

import br.edu.fatecfranca.Revisao2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    3. REPOSITORY
            --------------------------------------------------------------
                    - Camada que conversa DIRETO com o banco de dados.
            - Spring geralmente usa interfaces que estendem JpaRepository.
            - A Repository faz CRUD: create, read, update, delete.
            - NENHUMA regra de negócio deve ficar aqui — apenas acesso a dados.

            --------------------------------------------------------------
*/
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}