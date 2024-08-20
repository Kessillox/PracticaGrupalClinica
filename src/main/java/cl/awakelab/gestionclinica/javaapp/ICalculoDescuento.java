package cl.awakelab.gestionclinica.javaapp;

import java.util.List;

public interface ICalculoDescuento {
    List<Double> calculoDescuento(List<Detalle> detalles);
}
