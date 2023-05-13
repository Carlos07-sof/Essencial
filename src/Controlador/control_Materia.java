package Controlador;

import Conexion.ConexionBD;
import Modelo.Inventario_Materia;
import Modelo.Materia_prima;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class control_Materia {

    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;

    public boolean Insertar_Materias(Materia_prima materia) {
        boolean status = false;

        String sql = "insert into materia_prima (id_proveedor,nombre,descripcion) values (?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setInt(1, materia.getId_proveedor());
            comando.setString(2, materia.getNombre());
            comando.setString(3, materia.getDescripcion());

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
        String sql = "CALL NUEVA_MATERIA(?)";
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

    public boolean Eliminar_Materia(int id) {
        boolean status;

        String sql = "update materia_prima set status = 'Inactivo' where id_materia = ?";
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
            Logger.getLogger(control_Materia.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public boolean Actualizar(Materia_prima materia) {
        boolean status = false;

        String sql = "update materia_prima "
                + "set id_proveedor = ?, "
                + "nombre = ?, "
                + "descripcion=? "
                + "where id_materia = ? "
                + "and "
                + "status = 'Activo';";

        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, materia.getId_proveedor());
            comando.setString(2, materia.getNombre());
            comando.setString(3, materia.getDescripcion());
            comando.setInt(4, materia.getId_materia());

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

    public List<Materia_prima> Mostrar_Materia() {
        List<Materia_prima> MP = new ArrayList<>();
        try {

            String sql = "select mp.id_materia, pv.razon_social,mp.nombre,mp.descripcion,mp.estado "
                    + "from materia_prima mp "
                    + "inner join proveedores pv "
                    + "on pv.id_proveedor = mp.id_proveedor "
                    + "where mp.status = 'Activo' order by mp.id_materia asc";

            PreparedStatement comando = null;

            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Materia_prima m = new Materia_prima(Resultado.getInt("id_materia"),
                        Resultado.getString("razon_social"),
                        Resultado.getString("nombre"),
                        Resultado.getString("descripcion"),
                        Resultado.getString("estado"));
                MP.add(m);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Materia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MP;
    }

    public List<Materia_prima> Search_Materia(int id) {
        List<Materia_prima> MP = new ArrayList<>();

        String sql = "select * from materia_prima where id_materia = ?";
        PreparedStatement comando = null;

        try {

            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                Materia_prima mp = new Materia_prima(Resultado.getInt("id_materia"),
                        Resultado.getInt("id_proveedor"),
                        Resultado.getString("nombre"),
                        Resultado.getString("descripcion"),
                        Resultado.getString("estado"));
                MP.add(mp);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return MP;
    }

    public List<Inventario_Materia> Mostrar_Inventario_Materia() {
        List<Inventario_Materia> IP = new ArrayList<>();
        try {

            String sql = "select im.inv_mat_codigo,mp.descripcion,im.inv_entradas,im.inv_salidas,im.inv_stock "
                    + "from inventario_materiaprim im "
                    + "inner join materia_prima mp "
                    + "on im.inv_mat_codigo = mp.id_materia ";
            PreparedStatement comando = null;

            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Inventario_Materia m = new Inventario_Materia(Resultado.getInt("inv_mat_codigo"),
                        Resultado.getString("descripcion"), Resultado.getInt("inv_entradas"),
                        Resultado.getInt("inv_salidas"), Resultado.getInt("inv_stock"));
                IP.add(m);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Materia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return IP;
    }
    
    public List<Materia_prima> Mostrar_Materia_prima() {
        List<Materia_prima> MP = new ArrayList<>();
        try {

            String sql = "select id_materia, nombre "
                    + "from materia_prima "
                    + "where status = 'Activo' order by id_materia asc";

            PreparedStatement comando = null;

            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Materia_prima mp = new Materia_prima(Resultado.getInt("id_materia"),
                        Resultado.getString("nombre"));
                MP.add(mp);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Materia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MP;
    }
    
}
