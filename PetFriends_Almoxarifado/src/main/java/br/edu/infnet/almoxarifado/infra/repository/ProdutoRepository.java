package br.edu.infnet.almoxarifado.infra.repository;

import br.edu.infnet.almoxarifado.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
