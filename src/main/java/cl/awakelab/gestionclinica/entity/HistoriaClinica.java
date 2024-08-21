package cl.awakelab.gestionclinica.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Historia_Clinica", indexes = {
        @Index(name = "Paciente_ID", columnList = "Paciente_ID"),
        @Index(name = "Doctor_ID", columnList = "Doctor_ID")
})
public class HistoriaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Paciente_ID")
    private cl.awakelab.gestionclinica.entity.Paciente paciente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Doctor_ID")
    private Doctor doctor;

    @Column(name = "Fecha_Cita")
    private LocalDate fechaCita;

    @Lob
    @Column(name = "Sintomas")
    private String sintomas;

    @Lob
    @Column(name = "Diagnostico")
    private String diagnostico;

    @Lob
    @Column(name = "Tratamiento")
    private String tratamiento;

}