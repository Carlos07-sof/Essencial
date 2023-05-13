/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.ConexionBD;
import Modelo.Ventas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class control_ventas {
    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;   
    public boolean Insertar_Ventas(Ventas ventas) {
        boolean status = false;
        String sql = "insert into ventas (id_materia, fecha, cantidad, importe, pago, cambio, cantidad_litro) values (?,?,?,?,?,?,?)";
        PreparedStatement comando = null;
        try {
            comando = conexion.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setInt(2, ventas.getId_materia());
            comando.setDate(3, ventas.getFecha());
            comando.setInt(4, ventas.getCantidad());
            comando.setFloat(5, ventas.getImporte());
            comando.setFloat(6, ventas.getPago());
            comando.setFloat(7, ventas.getCambio());
            comando.setInt(10, ventas.getCantidad_litro());
            comando.executeUpdate();
            Resultado = comando.getGeneratedKeys();
            if (Resultado.next()) {
                call_procedure_actualizar(Resultado.getInt(1));
                call_procedure_actualizar_productos(Resultado.getInt(1));
            }
            status = true;
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            status = false;
            Logger.getLogger(control_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    private void call_procedure_actualizar(int id_venta) {
        String sql = "CALL inv_materiaprim_s(?)";
        PreparedStatement comando = null;
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id_venta);
            comando.executeUpdate();
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error -> " + ex);
        }
    }
    
    private void call_procedure_actualizar_productos(int id_venta) {
        String sql = "CALL inv_productos_s(?)";
        PreparedStatement comando = null;
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id_venta);
            comando.executeUpdate();
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error -> " + ex);
        }
    }
    public List<Ventas> Mostrar_Ventas() {
        List<Ventas> ventas = new ArrayList<>();
        try {

            String sql = "select * from ventas";

            PreparedStatement comando = null;

            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Ventas ve = new Ventas(
                        Resultado.getInt("id_venta"),
                        Resultado.getInt("cantidad"),
                        Resultado.getInt("id_servicio"),
                        Resultado.getInt("id_personal"));
                ventas.add(ve);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Materia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ventas;
    }
    
}