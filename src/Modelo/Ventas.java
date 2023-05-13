
package Modelo;

import java.sql.Date;

public class Ventas {
    private int id_venta;
    private int id_producto;
    private int id_materia;
    private Date fecha;
    private int cantidad;
    private float importe;
    private float pago;
    private float cambio;
    private int id_personal;
    private int id_servicio;
    private int cantidad_litro;

    public Ventas(int id_venta, int id_producto, int id_materia, Date fecha, int cantidad, float importe, float pago, float cambio, Integer id_personal, int id_servicio) {
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.id_materia = id_materia;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.importe = importe;
        this.pago = pago;
        this.cambio = cambio;
        this.id_personal = id_personal;
        this.id_servicio = id_servicio;
    }
    public Ventas(int id_materia,int cantidad, Integer id_personal, Integer id_servicio) {
        this.id_materia = id_materia;
        this.cantidad = cantidad;
        this.id_personal = id_personal;
        this.id_servicio = id_servicio;
    }

    public Ventas(int cantidad, float importe, float pago, float cambio, int id_servicio, int id_personal) {
        this.cantidad = cantidad;
        this.importe = importe;
        this.pago = pago;
        this.cambio = cambio;
        this.id_servicio = id_servicio;
        this.id_personal = id_personal;
    }
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    public Integer getId_personal() {
        return id_personal;
    }

    public void setId_personal(Integer id_personal) {
        this.id_personal = id_personal;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }
    
     public int getCantidad_litro() {
        return cantidad_litro;
    }

    public void setCantidad_litro(int cantidad_litro) {
        this.cantidad_litro = cantidad_litro;
    }
    
    
    
    
}
