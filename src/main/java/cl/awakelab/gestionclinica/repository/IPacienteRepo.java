package cl.awakelab.gestionclinica.repository;

import cl.awakelab.gestionclinica.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {
}
