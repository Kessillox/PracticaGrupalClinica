package cl.awakelab.gestionclinica.repository;

import cl.awakelab.gestionclinica.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaRepo extends JpaRepository<Factura, Integer> {
}
