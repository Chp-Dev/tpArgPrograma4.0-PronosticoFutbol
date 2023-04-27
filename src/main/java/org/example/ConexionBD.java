package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Date;
import java.sql.*;

public class ConexionBD {

    private Connection conexion;
    private Statement statement;

    public ConexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pronosticoDB", "admin", "admin");
        } catch (Exception e) {
            System.out.println("Aca valio xd");
            e.printStackTrace();
        }
    }

    public void guardarPartido(String equipo_local, String equipo_visitante, int goles_local, int goles_visitante, Date fecha) {
        try {
            String sql = "INSERT INTO partidos (equipo_local, equipo_visitante, goles_local, goles_visitante, fecha) " +
                    "VALUES ('" + equipo_local + "', '" + equipo_visitante + "', " + goles_local + ", " + goles_visitante + ", '" + fecha + "')";
            //System.out.println(sql);
            System.out.println(conexion.toString());
            statement = conexion.createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}