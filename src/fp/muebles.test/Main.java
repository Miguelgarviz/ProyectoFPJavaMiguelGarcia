package fp.muebles.test;

import fp.common.Auxiliares;
import fp.muebles.Mueble;
import java.time.LocalDate;

public class Main extends  Mueble{
    public static void main(String[] args) {
        Integer y = null;
        boolean x = hayDescuento(y);
        System.out.println(x);
    }
}