package fp.muebles;

import java.time.LocalDate;
import java.util.spi.LocaleNameProvider;

public class Muebles {
    public Muebles(){
        System.out.println("Nuevo Objeto Mueble Creado");
    }
    private String shipmode;
    int ventas;
    int calidad;
    int descuento;
    int beneficio;
    String segmento;
    String region;
    String estado;
    String subcategoria;
    LocalDate dia;
}
