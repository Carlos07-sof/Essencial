
package Modelo;

public class Cat_Servicio {
    private int id_servicio;
    private int consec;
    private String tipo_servicio;
    private float tarifa;
    
    public Cat_Servicio(int id_servicio, String tipo_servicio, float tarifa) {
        this.id_servicio = id_servicio;
        this.tipo_servicio = tipo_servicio;
        this.tarifa = tarifa;
    }
    
    
    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public int getConsec() {
        return consec;
    }

    public void setConsec(int consec) {
        this.consec = consec;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
    
    
    
}
