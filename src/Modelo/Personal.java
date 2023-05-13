package Modelo;
public class Personal {
    private Integer id_personal;
    private String rol;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private Integer edad;

    public Personal() {
    }

    public Personal(Integer id_personal, String rol) {
        this.id_personal = id_personal;
        this.rol = rol;
    }
    
    public Integer getId_personal() {
        return id_personal;
    }

    public void setId_personal(Integer id_proveedor) {
        this.id_personal = id_proveedor;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
    
}
