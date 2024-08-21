package cl.awakelab.gestionclinica.javaapp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Detalle> detalles = new ArrayList<>();
        Detalle detalle1 = new Detalle(3,7,"Neurología","Hombre");
        Detalle detalle2 = new Detalle(15,20,"Dermatología", "Mujer");
        Detalle detalle3 = new Detalle(60, 3,"Geriatría", "Mujer");
        Detalle detalle4 = new Detalle(60, 3,"Geriatría", "Hombre");

        detalles.add(detalle1);
        detalles.add(detalle2);
        detalles.add(detalle3);
        detalles.add(detalle4);

        CalculoSimple calculoSimple = new CalculoSimple();
        calculoSimple.calculoDescuento(detalles);
        CalculoComplejo calculoComplejo= new CalculoComplejo();
        calculoComplejo.calculoDescuento(detalles);

        System.out.println("Los descuentos serán de : ");
        System.out.println(calculoSimple.calculoDescuento(detalles));
        System.out.println("****************************************************************************");
        System.out.println("Los descuentos serán de : ");
        System.out.println(calculoComplejo.calculoDescuento(detalles));

    }
}
