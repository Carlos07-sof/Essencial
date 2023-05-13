package Modelo;

public class Proveedor {
    private Integer id_proveedor;
    private String razon_social;
    private String telefono;
    private String email;
    private String direccion;
    private String categoria;
    public Proveedor() {
    }

    public Proveedor(Integer id_proveedor, String razon_social, String telefono, String email, String direccion, String categoria) {
        this.id_proveedor = id_proveedor;
        this.razon_social = razon_social;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.categoria = categoria;
    }

    public Proveedor(String razon_social, String telefono, String email, String direccion, String categoria) {
        this.razon_social = razon_social;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.categoria = categoria;
    }

    public Proveedor(Integer id_proveedor, String razon_social) {
        this.id_proveedor = id_proveedor;
        this.razon_social = razon_social;
    }

    public Integer getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setDescripcion(String categoria) {
        this.categoria = categoria;
    }
    
}
