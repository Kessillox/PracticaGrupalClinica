package cl.awakelab.gestionclinica.javaapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Detalle {
    private int edad;
    private int experiencia;
    private String especialidad;
    private String sexo;
}
