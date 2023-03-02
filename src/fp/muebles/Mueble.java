package fp.muebles;

import java.time.LocalDate;
import java.util.Objects;

public class Mueble {
    public Mueble(){
        System.out.println("Nuevo Objeto Mueble Creado");
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
    private LocalDate dia_compra;
    private LocalDate dia_envio;
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

    public LocalDate getDia_compra() {
        return dia_compra;
    }

    public void setDia_compra(LocalDate dia_compra) {
        this.dia_compra = dia_compra;
    }

    public LocalDate getDia_envio() {
        return dia_envio;
    }

    public void setDia_envio(LocalDate dia_envio) {
        this.dia_envio = dia_envio;
    }

    public static Integer gastos(Integer vent, Integer benef){
        return vent-benef;
    }

    public static Integer precioReal(Integer vent, Integer desc){
        return ((desc/100)*vent)+vent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mueble mueble = (Mueble) o;
        return shipmode.equals(mueble.shipmode) && ventas.equals(mueble.ventas) && cantidad.equals(mueble.cantidad) && descuento.equals(mueble.descuento) && beneficio.equals(mueble.beneficio) && segmento.equals(mueble.segmento) && region.equals(mueble.region) && estado.equals(mueble.estado) && subcategoria.equals(mueble.subcategoria) && dia_compra.equals(mueble.dia_compra) && dia_envio.equals(mueble.dia_envio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmode, ventas, cantidad, descuento, beneficio, segmento, region, estado, subcategoria, dia_compra, dia_envio);
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
                ", dia_compra=" + dia_compra +
                ", dia_envio=" + dia_envio +
                '}';
    }

    public static Integer precio_por_mueble(Integer ven, Integer cant){
        return ven/cant;
    }
}
