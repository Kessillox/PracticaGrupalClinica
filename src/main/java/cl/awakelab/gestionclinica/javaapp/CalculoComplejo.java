package cl.awakelab.gestionclinica.javaapp;

import java.util.ArrayList;
import java.util.List;
/*
* Para el cálculo según experiencia y especialidad, se debe cumplir con el siguiente detalle:
•	Si el médico es de cualquier especialidad y tiene menos de 10 años de experiencia, tiene un 15% de descuento.
•	Si el médico es Cardiólogo o Neurólogo y tiene más de 10 años de experiencia y menos de 20, se aplica un 5% de descuento
•	Si el médico es Endocrinólogo u Oncólogo y tiene más de 5 años de experiencia, se aplica un 10% de descuento.
•	Si el médico es Dermatólogo no tiene porcentaje de descuento
•	Si el médico tiene más de 20 años de experiencia se aplica sólo un 5% de descuento.
*/
public class CalculoComplejo implements ICalculoDescuento{
    @Override
    public List<Double> calculoDescuento(List<Detalle> detalles) {
        List<Double> descuentos = new ArrayList<>();

        for (Detalle detalle : detalles) {
            if (detalle.getExperiencia() < 10) {
                descuentos.add(0.15);
            } else if (detalle.getExperiencia() < 20 && (detalle.getEspecialidad().equals("Cardiología") || detalle.getEspecialidad().equals("Neurología"))) {
                descuentos.add(0.05);
            } else if ((detalle.getEspecialidad().equals("Endocrinología") || detalle.getEspecialidad().equals("Oncología"))) {
                descuentos.add(0.10);
            } else if (detalle.getEspecialidad().equals("Dermatología")) {
                descuentos.add(0.0);
            } else if (detalle.getExperiencia() > 20) {
                descuentos.add(0.05);
            }
        }
        return descuentos;
    }
}
