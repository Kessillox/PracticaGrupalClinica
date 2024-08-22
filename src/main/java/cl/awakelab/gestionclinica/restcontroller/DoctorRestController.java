package cl.awakelab.gestionclinica.restcontroller;

import cl.awakelab.gestionclinica.entity.Doctor;
import cl.awakelab.gestionclinica.service.ICrudGenerico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DoctorRestController {
    @Autowired
    ICrudGenerico<Doctor> crudDoctor;

    @GetMapping("/doctores")
    public List<Doctor> listarDoctores(){
        return crudDoctor.listar();
    }

    @PostMapping("/crearDoctor")
    public Doctor crearDoctor(@RequestBody Doctor doctor){
        return crudDoctor.crear(doctor);
    }

    @PutMapping("/actualizarDoctor")
    public Doctor actualizarDoctor(@RequestBody Doctor doctor){
        return crudDoctor.atualizar(doctor);
    }

    @GetMapping("/doctor/{id}")
    public Doctor obtenerDoctor(@PathVariable int id){
        return crudDoctor.buscarPorId(id);
    }

    @DeleteMapping("/removerDoctor")
    public void removerDoctor(@RequestBody Doctor doctor){
        crudDoctor.remover(doctor.getId());
    }
}
