package cl.awakelab.gestionclinica.repository;

import cl.awakelab.gestionclinica.entity.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICitaRepo extends JpaRepository<Cita, Integer> {
}
