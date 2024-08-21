package cl.awakelab.gestionclinica.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Especialidades")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "Nombre", length = 100)
    private String nombre;

    @OneToMany(mappedBy = "especialidad")
    private Set<Doctor> doctores = new LinkedHashSet<>();

}