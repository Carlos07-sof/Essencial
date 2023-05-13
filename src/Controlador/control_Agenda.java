package Controlador;

import Conexion.ConexionBD;
import Modelo.Agenda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class control_Agenda {
    
    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;
    
    public boolean Insertar(Agenda ag) {
        boolean status = false;
        
        String sql = "insert into agenda_semanal (id_cliente,lunes,martes,miercoles,jueves,viernes,sabado,id_mes) values (?,?,?,?,?,?,?,?)";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, ag.getId_cliente());
            comando.setInt(2, ag.getLunes());
            comando.setInt(3, ag.getMartes());
            comando.setInt(4, ag.getMiercoles());
            comando.setInt(5, ag.getJueves());
            comando.setInt(6, ag.getViernes());
            comando.setInt(7, ag.getSabado());
            comando.setInt(8, ag.getId_mes());
            
            comando.executeUpdate();
            status = true;
        } catch (SQLException ex) {
            status = false;
            Logger.getLogger(control_Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public boolean Actualizar(Agenda ag) {
        boolean status = false;
        
        String sql = "update agenda_semanal set lunes = ?, martes = ?, miercoles = ?, jueves = ?, viernes = ?,"
                + "sabado = ? where id_agenda = ?";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, ag.getLunes());
            comando.setInt(2, ag.getMartes());
            comando.setInt(3, ag.getMiercoles());
            comando.setInt(4, ag.getJueves());
            comando.setInt(5, ag.getViernes());
            comando.setInt(6, ag.getSabado());
            comando.setInt(7, ag.getId_agenda());
            
            comando.executeUpdate();
            status = true;
        } catch (SQLException ex) {
            status = false;
            Logger.getLogger(control_Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public int Buscar(int id) {
        int registros = 0;
        
        String sql = "select * from agenda where id_cliente = ?";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);
            
            Resultado = comando.executeQuery();
            
            while (Resultado.next()) {
                registros++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(control_Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return registros;
    }
    
    public int Extraer_mes() {
        int mes = 0;
        
        String sql = "select extract(month from current_date)";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();
            
            if (Resultado.next()) {
                mes = (int) Resultado.getDouble(1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(control_Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mes;
    }
    
    public int Existencia(int folio) {
        int status = 0;
        String sql = "select id_mes from agenda_semanal where id_cliente = ?";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            
            Resultado = comando.executeQuery();
            
            if (Resultado.next()) {
                status = Resultado.getInt("id_mes");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(control_Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public List<Agenda> Agenda_cl() {
        List<Agenda> AG = new ArrayList<>();
        
        String sql = "select ags.id_agenda,ags.lunes,ags.martes,ags.miercoles,"
                + "ags.jueves,ags.viernes,ags.sabado,cl.id_cliente,"
                + "(cl.nombre ||' '||cl.apellido_p||' '||cl.apellido_m) as nombre "
                + "from agenda_semanal ags "
                + "inner join clientes cl "
                + "on cl.id_cliente = ags.id_cliente where ags.id_mes = extract(month from (current_timestamp)) order by ags.id_cliente asc";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();
            
            while (Resultado.next()) {
                Agenda ag = new Agenda(Resultado.getInt("id_agenda"),
                        Resultado.getInt("lunes"),
                        Resultado.getInt("martes"),
                        Resultado.getInt("miercoles"),
                        Resultado.getInt("jueves"),
                        Resultado.getInt("viernes"),
                        Resultado.getInt("sabado"),
                        Resultado.getInt("id_cliente"),
                        Resultado.getString("nombre"));
                AG.add(ag);
            }
            
            conexion.conectar().close();
            comando.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex, "Mensaje", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return AG;
    }
    
    public List<Agenda> Agenda_ex(int id_cl) {
        List<Agenda> AG = new ArrayList<>();
        
        String sql = "select ags.id_agenda,ags.lunes,ags.martes,ags.miercoles,"
                + "ags.jueves,ags.viernes,ags.sabado,cl.id_cliente,"
                + "(cl.nombre ||' '||cl.apellido_p||' '||cl.apellido_m) as nombre "
                + "from agenda_semanal ags "
                + "inner join clientes cl "
                + "on cl.id_cliente = ags.id_cliente where ags.id_mes = extract(month from (current_timestamp)) and ags.id_cliente = ?"
                + "order by ags.id_cliente asc";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id_cl);
            Resultado = comando.executeQuery();
            
            while (Resultado.next()) {
                Agenda ag = new Agenda(Resultado.getInt("id_agenda"),
                        Resultado.getInt("lunes"),
                        Resultado.getInt("martes"),
                        Resultado.getInt("miercoles"),
                        Resultado.getInt("jueves"),
                        Resultado.getInt("viernes"),
                        Resultado.getInt("sabado"),
                        Resultado.getInt("id_cliente"),
                        Resultado.getString("nombre"));
                AG.add(ag);
            }
            
            conexion.conectar().close();
            comando.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex, "Mensaje", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return AG;
    }
    
}
