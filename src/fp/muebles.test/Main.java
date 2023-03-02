package fp.muebles.test;

import fp.common.Auxiliares;
import fp.muebles.Mueble;
import java.time.LocalDate;

public class Main extends  Mueble{
    public static void main(String[] args) {
        Mueble silla = new Mueble("silla", 10,10,10,10, 2010, 3, 20);
        System.out.println("----------------------");
        Mueble sofa = new Mueble("sofa", 10,10,0,10,2011, 9, 30);
    }
}