package fp.muebles;

import fp.common.Auxiliares;

import java.time.LocalDate;

public class Mueble extends Auxiliares {
    public Mueble(){
        System.out.println("Nuevo Objeto Mueble Creado");
    }
    public Mueble(String shipmode, Integer ventas, Integer cantidad, Integer descuento, Integer beneficio, Integer año,  Integer mes,  Integer día){
        System.out.println("Nuevo Objeto Mueble Creado");

        this.shipmode = shipmode;

        setVentas(ventas);
        setCantidad(cantidad);
        TFhayDescuento(descuento);
        setBeneficio(beneficio);
        setDiaPedida(año, mes, día);
        if (isHayDescuento()){
            setDescuento(descuento);
            System.out.println("Descuento: " + descuento);
        }
        System.out.println("Beneficio: " + beneficio);
        System.out.println("Dia en el que se hizo el pedido: " + diaPedida);
    }

    private String shipmode;
    private Integer ventas;
    private Integer cantidad;
    private Integer descuento;
    private Integer beneficio;
    private String segmento;
    private String region;
    private String estado;
    private String subcategoria;
    private LocalDate diaPedida;

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

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public Integer getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(Integer beneficio) {
        this.beneficio = beneficio;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public LocalDate getDiaPedida() {
        return diaPedida;
    }

    public void setDiaPedida(Integer año, Integer mes, Integer día) {
        this.diaPedida = fecha(año, mes, día);
    }

    public boolean isHayDescuento() {
        if (this.descuento == 0){
            return False;
        }
        else if (this.descuento == null){
            return False;
        }
        else{
            return True;
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

    public Double descuento (Integer i){
        Double descuento = i * 0.01;
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
                ", segmento='" + segmento + '\'' +
                ", region='" + region + '\'' +
                ", estado='" + estado + '\'' +
                ", subcategoria='" + subcategoria + '\'' +
                ", diaPedida=" + diaPedida +
                ", hayDescuento=" + isHayDescuento() +
                ", toString='" + '\'' +
                '}';
    }


}
//{lote1, sofa, 3}, {
