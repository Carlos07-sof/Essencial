
package Controlador;

import Conexion.ConexionBD;
import Modelo.Cat_Servicio;
import Modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class control_Servicio {
    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;
    
    public List<Cat_Servicio> Mostrar_Servicio() {
        List<Cat_Servicio> ct = new ArrayList<>();

        String sql = "select cs.id_servicio, cs.tipo_servicio, tr.tarifa " +
                "from cat_servicio cs " +
                "inner join tarifa tr " +
                "on tr.id_servicio = cs.id_servicio " +
                "order by cs.id_servicio ";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_Servicio m = new Cat_Servicio(
                    Resultado.getInt("id_servicio"),
                    Resultado.getString("tipo_servicio"),
                    Resultado.getFloat("tarifa"));
                ct.add(m);
            }

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            Logger.getLogger(control_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ct;
    }
}
