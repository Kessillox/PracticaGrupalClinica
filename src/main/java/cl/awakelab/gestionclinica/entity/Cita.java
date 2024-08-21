package cl.awakelab.gestionclinica.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Citas", indexes = {
        @Index(name = "Paciente_ID", columnList = "Paciente_ID"),
        @Index(name = "Doctor_ID", columnList = "Doctor_ID"),
        @Index(name = "Factura_ID", columnList = "Factura_ID")
})
public class Cita {
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

    @Column(name = "Fecha")
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Factura_ID")
    private cl.awakelab.gestionclinica.entity.Factura factura;

}