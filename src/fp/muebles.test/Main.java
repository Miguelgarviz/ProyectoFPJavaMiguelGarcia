package fp.muebles.test;

import fp.common.Auxiliares;
import fp.muebles.Mueble;
import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Mueble silla = new Mueble();
        silla.setDiaPedida(10,3,2010);
        System.out.println(silla.getDiaPedida());
    }
}