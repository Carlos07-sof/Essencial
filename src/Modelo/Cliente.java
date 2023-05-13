
package Modelo;

/**
 *
 * @author Erick
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String telefono;
    private String residencia;
    private String calle;
    private String manzana;
    private String lote;

    public Cliente(int idCliente, String nombre, String apellido_p, String apellido_m, String telefono, String residencia, String calle, String manzana, String lote) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.telefono = telefono;
        this.residencia = residencia;
        this.calle = calle;
        this.manzana = manzana;
        this.lote = lote;
    }

    public Cliente(String nombre, String apellido_p, String apellido_m, String telefono, String residencia, String calle, String manzana, String lote) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.telefono = telefono;
        this.residencia = residencia;
        this.calle = calle;
        this.manzana = manzana;
        this.lote = lote;
    }

    public Cliente(int idCliente, String Nombre, String Apellido_p, String Apellido_m) {
        this.idCliente = idCliente;
        this.nombre = Nombre;
        this.apellido_p = Apellido_p;
        this.apellido_m = Apellido_m;
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
    
}
