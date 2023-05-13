package Modelo;

public class Inventario_Producto {
    private int inv_id_producto;
    private String inv_name;
    private int inv_entradas;
    private int inv_salidas;
    private int inv_stock;

    public Inventario_Producto() {
    }

    public Inventario_Producto(int inv_id_producto, String inv_name, int inv_entradas, int inv_salidas, int inv_stock) {
        this.inv_id_producto = inv_id_producto;
        this.inv_name = inv_name;
        this.inv_entradas = inv_entradas;
        this.inv_salidas = inv_salidas;
        this.inv_stock = inv_stock;
    }

    public int getInv_id_producto() {
        return inv_id_producto;
    }

    public void setInv_id_producto(int inv_id_producto) {
        this.inv_id_producto = inv_id_producto;
    }

    public String getInv_name() {
        return inv_name;
    }

    public void setInv_name(String inv_name) {
        this.inv_name = inv_name;
    }

    public int getInv_entradas() {
        return inv_entradas;
    }

    public void setInv_entradas(int inv_entradas) {
        this.inv_entradas = inv_entradas;
    }

    public int getInv_salidas() {
        return inv_salidas;
    }

    public void setInv_salidas(int inv_salidas) {
        this.inv_salidas = inv_salidas;
    }

    public int getInv_stock() {
        return inv_stock;
    }

    public void setInv_stock(int inv_stock) {
        this.inv_stock = inv_stock;
    }

    
}
