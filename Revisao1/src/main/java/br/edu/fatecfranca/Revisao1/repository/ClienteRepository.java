package br.edu.fatecfranca.Revisao1.repository;

import br.edu.fatecfranca.Revisao1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
