package fp.muebles;

import java.time.LocalDate;
import java.util.spi.LocaleNameProvider;

public class Muebles {
    public Muebles(){
        System.out.println("Nuevo Objeto Mueble Creado");
    }
    private String shipmode;
    private int ventas;
    int cantidad;
    int descuento;
    int beneficio;
    String segmento;
    String region;
    String estado;
    String subcategoria;
    LocalDate dia_compra;
    LocalDate dia_envio;
    public String get_ship(){
        return this.shipmode;
    }
    public void set_ship(String valor){
        this.shipmode = valor;
    }
    public static Integer gastos(Integer vent, Integer benef){
        return vent-benef;
    }
    public static Integer precio_real(Integer vent, Integer desc){
        return ((desc/100)*vent)+vent;
    }
    public static Integer precio_por_mueble(Integer ven, Integer cant){
        return ven/cant;
    }
}
