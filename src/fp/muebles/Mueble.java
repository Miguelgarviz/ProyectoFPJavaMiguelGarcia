package fp.muebles;

import fp.common.Auxiliares;

import java.time.LocalDate;

public class Mueble extends Auxiliares {
    public Mueble(){
        System.out.println("Nuevo Objeto Mueble Creado");
    }
    public Mueble(String shipmode, Integer ventas, Integer cantidad, Integer descuento, Integer beneficio, String segmento, String estado, String subcategoria){
        System.out.println("Nuevo Objeto Mueble Creado");
        setShip(shipmode);
        setVentas(ventas);
        setCantidad(cantidad);
        setDescuento(descuento);
        setBeneficio(beneficio);
        System.out.println("Caracteristicas \n");
        System.out.println("Shipmode: " + shipmode);
        System.out.println("Ventas: " + ventas);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descuento: " + descuento);
        System.out.println("Beneficio: " + beneficio);
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

    public void setDiaPedida(Integer día, Integer mes, Integer año) {
        this.diaPedida = fecha(año, mes, día);
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
}
