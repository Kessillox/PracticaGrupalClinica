package cl.awakelab.gestionclinica.repository;

import cl.awakelab.gestionclinica.entity.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistoriaClinicaRepo extends JpaRepository<HistoriaClinica, Integer> {
}
