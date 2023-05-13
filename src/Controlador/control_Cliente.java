package Controlador;

import Conexion.ConexionBD;
import Modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class control_Cliente {

    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;

    public boolean Insertar_Cliente(Cliente cl) {
        boolean status = false;

        String sql = "insert into clientes (nombre,apellido_p,apellido_m,telefono,residencia,calle,manzana,lote) values (?,?,?,?,?,?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, cl.getNombre());
            comando.setString(2, cl.getApellido_p());
            comando.setString(3, cl.getApellido_m());
            comando.setString(4, cl.getTelefono());
            comando.setString(5, cl.getResidencia());
            comando.setString(6, cl.getCalle());
            comando.setString(7, cl.getManzana());
            comando.setString(8, cl.getLote());

            comando.executeUpdate();
            status = true;
        } catch (SQLException ex) {
            status = false;
            Logger.getLogger(control_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public List<Cliente> Mostrar_Clientes() {
        List<Cliente> C = new ArrayList<>();

        String sql = "select * from clientes";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cliente c = new Cliente(Resultado.getInt("id_cliente"),
                        Resultado.getString("nombre"),
                        Resultado.getString("apellido_p"),
                        Resultado.getString("apellido_m"),
                        Resultado.getString("telefono"),
                        Resultado.getString("residencia"),
                        Resultado.getString("calle"),
                        Resultado.getString("manzana"),
                        Resultado.getString("lote"));
                C.add(c);
            }

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return C;
    }

    public List<Cliente> Search(int id){
        List<Cliente> CL = new ArrayList<>();
        
        String sql = "select * from clientes where id_cliente = ? and status = 'Activo'";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                Cliente c = new Cliente(Resultado.getInt("id_cliente"),
                        Resultado.getString("nombre"),
                        Resultado.getString("apellido_p"),
                        Resultado.getString("apellido_m"),
                        Resultado.getString("telefono"),
                        Resultado.getString("residencia"),
                        Resultado.getString("calle"),
                        Resultado.getString("manzana"),
                        Resultado.getString("lote"));
                CL.add(c);
            }

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return CL;
    }
    
    public List<Cliente> Mostrar_Clientes_Agenda() {
        List<Cliente> C = new ArrayList<>();

        String sql = "select clientes.id_cliente, clientes.nombre, clientes.apellido_p, clientes.apellido_m "
                + "from agenda inner join clientes "
                + "on clientes.id_cliente = agenda.id_cliente "
                + "group by clientes.id_cliente "
                + "order by clientes.id_cliente";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cliente c = new Cliente(Resultado.getInt("id_cliente"),
                        Resultado.getString("nombre"),
                        Resultado.getString("apellido_p"),
                        Resultado.getString("apellido_m"));
                C.add(c);
            }

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return C;
    }

}
