package cl.awakelab.gestionclinica.javaapp;

import java.util.ArrayList;
import java.util.List;

public class CalculoSimple implements ICalculoDescuento{
    @Override
    public List<Double> calculoDescuento(List<Detalle> detalles) {
        List<Double> descuentos = new ArrayList<>();
        double desct = 0;
        for (Detalle detalle : detalles) {
            if(detalle.getEdad() <= 5){
                desct = 0.05d;
                descuentos.add(desct);
            } else if ( detalle.getEdad() < 13) {
                desct = 0.03d;
                descuentos.add(desct);
            }else if (detalle.getEdad() <= 35) {
                if(detalle.getSexo().equals("Hombre")){
                    desct = 0d;
                    descuentos.add(desct);
                }else{
                    desct = 1.02d;
                    descuentos.add(desct);
                }
            } else if (detalle.getEdad() < 60) {
                desct = 0.1d;
                descuentos.add(desct);
            }else{
                if(detalle.getSexo().equals("Hombre")){
                    desct = 0.2d;
                    descuentos.add(desct);
                }else{
                    desct = 0.3d;
                    descuentos.add(desct);
                }
            }
        }
        return descuentos;
    }
}
