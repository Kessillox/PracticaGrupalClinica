package cl.awakelab.gestionclinica.javaapptest;

import cl.awakelab.gestionclinica.javaapp.CalculoSimple;
import cl.awakelab.gestionclinica.javaapp.Detalle;
import cl.awakelab.gestionclinica.javaapp.ICalculoDescuento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoComplejoTest {
    public static List<Detalle> detalles = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        detalles.add(new Detalle(3,7,"Neurología","Hombre"));
        detalles.add(new Detalle(15,20,"Dermatología", "Mujer"));
        detalles.add(new Detalle(60, 3,"Geriatría", "Mujer"));
        detalles.add(new Detalle(60, 3,"Geriatría", "Hombre"));
    }

    @Test
    public void testCalculoDescuento() {
        ICalculoDescuento calculoSimple = new CalculoSimple();

        List<Double> descuentoResult = calculoSimple.calculoDescuento(detalles);
        List<Double> listaEsperada = Arrays.asList(0.05, 1.02, 0.3, 0.2);

        assertEquals(descuentoResult, listaEsperada);
    }
}
