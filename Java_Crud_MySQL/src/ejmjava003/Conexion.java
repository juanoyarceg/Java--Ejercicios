package ejmjava003;
import java.sql.*;
public class Conexion {
    public static Connection getConexion() {
        Connection connection = null;
        try {
            String driverClassName = "com.mysql.jdbc.Driver";
            String driverUrl = "jdbc:mysql://localhost/db_academia";
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(driverUrl, "root", "");
            System.out.println("Ok");
        } catch (Exception ex) {

        }
        return connection;
    }
}
