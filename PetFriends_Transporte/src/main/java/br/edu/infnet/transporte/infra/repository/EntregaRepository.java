package br.edu.infnet.transporte.infra.repository;

import br.edu.infnet.transporte.domain.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
    
}
