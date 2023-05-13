package Controlador;

import Conexion.ConexionBD;
import Modelo.Stock_Entrada;
import Modelo.Stock_Salida;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class control_Stock {

    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;

    public boolean Entrada_Materia(Stock_Entrada se, boolean si) {
        boolean status = false;
        String sql;

        if (si == true) {
            sql = "insert into entrada_materiaprim (id_materia,id_factura_mat,fecha,cantidad,precio_compra_mat) values (?,?,?,?,?)";
        } else {
            sql = "insert into entrada_materiaprim (id_materia,fecha,cantidad,precio_compra_mat) values (?,?,?,?)";
        }
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);

            if (si == true) {
                comando.setInt(1, se.getId());
                comando.setInt(2, se.getFactura());
                comando.setDate(3, (Date) se.getFecha());
                comando.setDouble(4, se.getCantidad_m());
                comando.setFloat(5, se.getPrecio_compra());
            } else {
                comando.setInt(1, se.getId());
                comando.setDate(2, se.getFecha());
                comando.setDouble(3, se.getCantidad_m());
                comando.setFloat(4, se.getPrecio_compra());
            }

            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Stock.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public boolean Entrada_Producto(Stock_Entrada se, boolean si) {
        boolean status = false;
        String sql;

        if (si == true) {
            sql = "insert into entrada_productos (id_producto,id_factura_mat,fecha,cantidad,precio_compra) values (?,?,?,?,?)";
        } else {
            sql = "insert into entrada_productos (id_producto,fecha,cantidad,precio_compra) values (?,?,?,?)";
        }
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);

            if (si == true) {
                comando.setInt(1, se.getId());
                comando.setInt(2, se.getFactura());
                comando.setDate(3, (Date) se.getFecha());
                comando.setInt(4, se.getCantidad_p());
                comando.setFloat(5, se.getPrecio_compra());
            } else {
                comando.setInt(1, se.getId());
                comando.setDate(2, se.getFecha());
                comando.setInt(3, se.getCantidad_p());
                comando.setFloat(4, se.getPrecio_compra());
            }

            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Stock.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public boolean Salida_Materia(Stock_Salida ss) {
        boolean status = false;
        String sql = "insert into salida_materiaprim (id_materia,fecha,concepto,cantidad) values (?,?,?,?)";

        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);

            comando.setInt(1, ss.getId());
            comando.setDate(2, (Date) ss.getFecha());
            comando.setString(3, ss.getConcepto());
            comando.setDouble(4, ss.getCantidad_m());

            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Stock.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public boolean Salida_Producto(Stock_Salida ss) {
        boolean status = false;
        String sql = "insert into salida_productos (id_producto,fecha,concepto,cantidad) values (?,?,?,?)";

        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);

            comando.setInt(1, ss.getId());
            comando.setDate(2, (Date) ss.getFecha());
            comando.setString(3, ss.getConcepto());
            comando.setInt(4, ss.getCantidad_p());

            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Stock.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }
}
