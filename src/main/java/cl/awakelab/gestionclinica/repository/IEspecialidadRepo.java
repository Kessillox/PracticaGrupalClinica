package cl.awakelab.gestionclinica.repository;

import cl.awakelab.gestionclinica.entity.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEspecialidadRepo extends JpaRepository<Especialidad, Integer> {
}
