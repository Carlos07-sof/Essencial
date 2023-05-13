package Modelo;

public class Producto {

    private int id_producto;
    private int id_proveedor;
    private String proveedor;
    private String nombre;
    private String descripcion;
    private String estado;

    public Producto() {
    }

    public Producto(int id_proveedor,String nombre, String descripcion) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
     public Producto(int id_proveedor,String nombre) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
    }
    public Producto(int id_producto, String proveedor,String nombre, String descripcion, String estado) {
        this.id_producto = id_producto;
        this.proveedor = proveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Producto(int id_producto, int id_proveedor, String nombre, String descripcion, String estado) {
        this.id_producto = id_producto;
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Producto(int id_producto, int id_proveedor, String nombre, String descripcion) {
        this.id_producto = id_producto;
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
