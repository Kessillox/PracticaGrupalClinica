package cl.awakelab.gestionclinica.service.impl;

import cl.awakelab.gestionclinica.entity.Doctor;
import cl.awakelab.gestionclinica.repository.IDoctorRepo;
import cl.awakelab.gestionclinica.service.ICrudGenerico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements ICrudGenerico<Doctor> {

    @Autowired
    IDoctorRepo doctorRepo;

    @Override
    public List<Doctor> listar() {
        return doctorRepo.findAll();
    }

    @Override
    public Doctor buscarPorId(int id) {
        return doctorRepo.findById(id).orElse(null);
    }

    @Override
    public Doctor crear(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public Doctor atualizar(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public void remover(int id) {
        doctorRepo.deleteById(id);
    }
}
