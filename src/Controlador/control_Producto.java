package Controlador;

import Conexion.ConexionBD;
import Modelo.Inventario_Producto;
import Modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class control_Producto {

    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;

    public boolean Insertar_Productos(Producto producto) {
        boolean status = false;
        String sql = "insert into productos (id_proveedor,nombre,descripcion) values (?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setInt(1, producto.getId_proveedor());
            comando.setString(2, producto.getNombre());
            comando.setString(3, producto.getDescripcion());

            comando.executeUpdate();
            Resultado = comando.getGeneratedKeys();

            if (Resultado.next()) {
                call_procedure_insertar(Resultado.getInt(1));
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

    private void call_procedure_insertar(int id_producto) {
        String sql = "CALL NUEVO_PRODUCTO(?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id_producto);

            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error -> " + ex);
        }

    }

    public boolean Actualizar(Producto producto) {
        boolean status = false;

        String sql = "update productos "
                + "set id_proveedor = ?, "
                + "nombre = ?, "
                + "descripcion=? "
                + "where id_producto = ? "
                + "and "
                + "status = 'Activo';";

        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, producto.getId_proveedor());
            comando.setString(2, producto.getNombre());
            comando.setString(3, producto.getDescripcion());
            comando.setInt(4, producto.getId_producto());

            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            status = false;
            Logger.getLogger(control_Materia.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public boolean Eliminar_producto(int id) {
        boolean status;

        String sql = "update productos set status = 'Inactivo' where id_producto = ?";
        PreparedStatement comando = null;

        try {

            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);

            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            status = false;
            Logger.getLogger(control_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    
    
    public List<Producto> Mostrar_Productos() {
        List<Producto> P = new ArrayList<>();

        String sql = "select pd.id_producto, pv.razon_social,pd.nombre,pd.descripcion,pd.estado "
                + "from productos pd "
                + "inner join proveedores pv "
                + "on pv.id_proveedor = pd.id_proveedor "
                + "where pd.status = 'Activo' order by pd.id_producto asc";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Producto m = new Producto(Resultado.getInt("id_producto"),
                        Resultado.getString("razon_social"),
                        Resultado.getString("nombre"),
                        Resultado.getString("descripcion"),
                        Resultado.getString("estado"));
                P.add(m);
            }

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            Logger.getLogger(control_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return P;
    }
    
    
    

    public List<Producto> Search_Producto(int id_producto) {
        List<Producto> P = new ArrayList<>();

        String sql = "select * from productos where id_producto = ?";
        PreparedStatement comando = null;

        try {

            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id_producto);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                Producto p = new Producto(Resultado.getInt("id_producto"),
                        Resultado.getInt("id_proveedor"),
                        Resultado.getString("nombre"),
                        Resultado.getString("descripcion"),
                        Resultado.getString("estado"));
                P.add(p);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return P;
    }

    public List<Inventario_Producto> Mostrar_Inventario_Productos() {
        List<Inventario_Producto> IP = new ArrayList<>();
        try {

            String sql = "select ip.inv_prod_codigo,pc.descripcion,ip.inv_entradas,ip.inv_salidas,ip.inv_stock "
                    + "from inventario_productos ip "
                    + "inner join productos pc "
                    + "on ip.inv_prod_codigo = pc.id_producto";
            PreparedStatement comando = null;

            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Inventario_Producto p = new Inventario_Producto(Resultado.getInt("inv_prod_codigo"),
                        Resultado.getString("descripcion"), Resultado.getInt("inv_entradas"),
                        Resultado.getInt("inv_salidas"), Resultado.getInt("inv_stock"));
                IP.add(p);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return IP;
    }

}
