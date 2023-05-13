package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {

    private String driver = "org.postgresql.Driver";
    private String Cadenacon;
    private String Usuario = "postgres";
    private String Password = "unach";//"AH18192001";

    private ConexionBD() {
    }

    public static ConexionBD getInstance() {
        return ConexionBDHolder.INSTANCE;
    }

    private static class ConexionBDHolder {

        private static final ConexionBD INSTANCE = new ConexionBD();
    }

    public Connection conectar() {

        Connection con = null;
        Cadenacon = "jdbc:postgresql://localhost:5433/agua";

        try {
            con = DriverManager.getConnection(Cadenacon, Usuario, Password);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
