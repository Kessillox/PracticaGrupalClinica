package cl.awakelab.gestionclinica.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "Nombre", length = 100)
    private String nombre;

    @Column(name = "Fecha_Nacimiento")
    private LocalDate fechaNacimiento;

}