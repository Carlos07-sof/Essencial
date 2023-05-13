package Modelo;

public class Agenda {
    private int id_agenda;
    private int lunes;
    private int martes;
    private int miercoles;
    private int jueves;
    private int viernes;
    private int sabado;
    private int id_mes;
    private String Mes;
    private int id_cliente;
    private String nombre;

    public Agenda() {
    }

    public Agenda(int lunes, int martes, int miercoles, int jueves, int viernes, int sabado, int id_mes, int id_cliente) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.id_mes = id_mes;
        this.id_cliente = id_cliente;
    }

    public Agenda(int id_agenda, int lunes, int martes, int miercoles, int jueves, int viernes, int sabado, int id_mes, int id_cliente) {
        this.id_agenda = id_agenda;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.id_mes = id_mes;
        this.id_cliente = id_cliente;
    }

    public Agenda(int id_agenda, int lunes, int martes, int miercoles, int jueves, int viernes, int sabado, int id_cliente, String nombre) {
        this.id_agenda = id_agenda;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.id_cliente = id_cliente;
        this.nombre = nombre;
    }
    
    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public int getLunes() {
        return lunes;
    }

    public void setLunes(int lunes) {
        this.lunes = lunes;
    }

    public int getMartes() {
        return martes;
    }

    public void setMartes(int martes) {
        this.martes = martes;
    }

    public int getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(int miercoles) {
        this.miercoles = miercoles;
    }

    public int getJueves() {
        return jueves;
    }

    public void setJueves(int jueves) {
        this.jueves = jueves;
    }

    public int getViernes() {
        return viernes;
    }

    public void setViernes(int viernes) {
        this.viernes = viernes;
    }

    public int getSabado() {
        return sabado;
    }

    public void setSabado(int sabado) {
        this.sabado = sabado;
    }

    public int getId_mes() {
        return id_mes;
    }

    public void setId_mes(int id_mes) {
        this.id_mes = id_mes;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
