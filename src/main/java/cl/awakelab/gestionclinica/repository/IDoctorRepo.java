package cl.awakelab.gestionclinica.repository;

import cl.awakelab.gestionclinica.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {
}
