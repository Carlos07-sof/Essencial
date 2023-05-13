package Modelo;

public class Usuario {

    private int idUsuario;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String usuario;
    private String password;
    private String telefono;

    public Usuario() {
        
    }

    public Usuario(int idUsuario, String nombre, String apellido_p, String apellido_m, String usuario,String password, String telefono) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.usuario = usuario;
        this.password = password;
        this.telefono = telefono;
    }

    public Usuario(String nombre, String apellido_p, String apellido_m, String usuario, String password, String telefono) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.usuario = usuario;
        this.password = password;
        this.telefono = telefono;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

}
