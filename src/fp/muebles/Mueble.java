package fp.muebles;

import fp.common.Auxiliares;

import java.time.LocalDate;

public class Mueble extends Auxiliares {
    public Mueble(){
        System.out.println("Nuevo Objeto Mueble Creado");
    }
    public Mueble(String shipmode, Integer ventas, Integer cantidad, Integer descuento, Integer beneficio,
                  Integer añoPedida,  Integer mesPedida,  Integer díaPedida){

        System.out.println("Nuevo Objeto Mueble Creado");
        this.añoPedida = añoPedida;
        this.mesPedida = mesPedida;
        this.díaPedida = díaPedida;
        this.descuento = descuentoPorcentaje(descuento);
        this.shipmode = shipmode;
        this.ventas = ventas;
        this.cantidad = cantidad;
        this.beneficio = beneficio;

    }
    private String shipmode;
    private Integer ventas;
    private Integer cantidad;
    private Double descuento;
    private Integer beneficio;
    private Integer mesPedida;
    private Integer díaPedida;
    private Integer añoPedida;
    public String getShip(){
        return this.shipmode;
    }
    public void setShip(String valor){
        if (valor.equals(null)) {
            throw new IllegalArgumentException("valor cannot be null");
        }
        this.shipmode = valor;
    }
    public Integer getVentas() {
        return ventas;
    }

    public void setVentas(Integer ventas) {
        this.ventas = ventas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Integer getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(Integer beneficio) {
        this.beneficio = beneficio;
    }
    public LocalDate setDiaDelPedido(Integer año, Integer mes, Integer día) {
        return fecha(año, mes, día);
    }

    public boolean isHayDescuento() {
        if (this.descuento == 0){
            return false;
        }
        else if (this.descuento == null){
            return false;
        }
        else{
            return true;
        }
    }
    public static Integer gastos(Integer vent, Integer benef){
        return vent-benef;
    }

    public static Integer precioReal(Integer vent, Integer desc){
        return ((desc/100)*vent)+vent;
    }

    public static Integer precio_por_mueble(Integer ven, Integer cant){
        return ven/cant;
    }

    public static Double descuentoPorcentaje(Integer i){
        double ii = i;
        Double descuento = ii * 0.01;
        return descuento;
    }

    @Override
    public String toString() {
        return "Mueble{" +
                "shipmode='" + shipmode + '\'' +
                ", ventas=" + ventas +
                ", cantidad=" + cantidad +
                ", descuento=" + descuento +
                ", beneficio=" + beneficio +
                ", hayDescuento=" + isHayDescuento() +
                ", diaPedida=" + setDiaDelPedido(añoPedida, mesPedida, díaPedida) +
                '}';
    }


}
