package Controlador;

import Conexion.ConexionBD;
import Modelo.Personal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class control_Personal {
    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;

    public List<Personal> Mostrar_Personal() {
        List<Personal> P = new ArrayList<>();
        try {

            String sql = "select id_personal, rol from personal";

            PreparedStatement comando = null;

            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Personal p = new Personal(Resultado.getInt("id_personal"),
                        Resultado.getString("rol"));
                P.add(p);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Materia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return P;
    }
}
