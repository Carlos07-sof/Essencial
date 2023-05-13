package Controlador;

import Modelo.Usuario;
import Conexion.ConexionBD;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class control_Usuario {

    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;

    public boolean guardar(Usuario objeto) {
        boolean respuesta = false;

        try {

            PreparedStatement consulta = conexion.conectar().prepareStatement("insert into usuario(nombre,apellido_p,apellido_m,usuario,password,telefono) values(?,?,?,?,?,?)");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido_p());
            consulta.setString(3, objeto.getApellido_m());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            conexion.conectar().close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return respuesta;
    }

    public List<Usuario> Buscar_Usuario(int id) {
        List<Usuario> Us = new ArrayList<>();

        String sql = "select * from usuario where id_usuario = ? and status = 'Activo'";
        PreparedStatement comando = null;

        try {

            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                Usuario us = new Usuario(Resultado.getInt("id_usuario"),
                        Resultado.getString("nombre"),
                        Resultado.getString("apellido_p"),
                        Resultado.getString("apellido_m"),
                        Resultado.getString("usuario"),
                        Resultado.getString("password"),
                        Resultado.getString("telefono"));
                Us.add(us);
            }

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }

        return Us;
    }

    public List<Usuario> Mostrar_Usuarios() {
        List<Usuario> LU = new ArrayList<>();

        String sql = "select * from usuario where status = 'Activo' order by id_usuario asc";
        PreparedStatement comando = null;

        try {

            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Usuario Us = new Usuario(Resultado.getInt("id_usuario"),
                        Resultado.getString("nombre"),
                        Resultado.getString("apellido_p"),
                        Resultado.getString("apellido_m"),
                        Resultado.getString("usuario"),
                        Resultado.getString("password"),
                        Resultado.getString("telefono"));
                LU.add(Us);
            }

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        return LU;
    }

    public boolean existeUsu(String usuario) {
        boolean respuesta = false;
        String sql = "select usuario from usuario where usuario='" + usuario + "';";
        Statement st;
        try {
            st = conexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar usuario", "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        return respuesta;
    }

    //Metodo de inicio de sesion
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;

        String sql = "select usuario, password from usuario where usuario= '" + objeto.getUsuario() + "' and password='" + objeto.getPassword() + "';";
        Statement st;
        try {

            st = conexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            //st.close();

            while (rs.next()) {
                respuesta = true;

            }
        } catch (SQLException e) {

        }
        return respuesta;
    }

    public boolean actualizar(Usuario objeto) {
        boolean respuesta = false;
        try {
            PreparedStatement consulta = conexion.conectar().prepareStatement("update usuario set nombre=?, apellido_p=?, apellido_m=?, usuario=?, password=?, telefono=? where id_usuario=?");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido_p());
            consulta.setString(3, objeto.getApellido_m());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());
            consulta.setInt(7, objeto.getIdUsuario());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            conexion.conectar().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar usuario" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        return respuesta;
    }

    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        try {
            PreparedStatement consulta = conexion.conectar().prepareStatement("delete from usuario where id_usuario='" + idUsuario + "'");
            //consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
            conexion.conectar().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar usuario", "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        return respuesta;
    }
}
