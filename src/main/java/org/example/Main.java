package org.example;
import java.sql.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        String[] equipos = {"Boca Juniors", "River Plate", "Independiente", "Racing Club",
                "San Lorenzo", "Huracán", "Vélez Sarsfield", "Estudiantes", "Gimnasia y Esgrima",
                "Argentinos Juniors", "Newell", "Old Boys", "Rosario Central", "Talleres", "Belgrano", "Unión",
                "Colón", "Banfield", "Lanús", "Arsenal", "Godoy Cruz"};
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            String equipo_local = equipos[rand.nextInt(equipos.length)];
            String equipo_visitante = equipos[rand.nextInt(equipos.length)];
            while (equipo_visitante.equals(equipo_local)) {
                equipo_visitante = equipos[rand.nextInt(equipos.length)];
            }
            int goles_local = rand.nextInt(5);
            int goles_visitante = rand.nextInt(5);
            Date fecha = new Date(System.currentTimeMillis() + (i * 86400000));
            conexion.guardarPartido(equipo_local, equipo_visitante, goles_local, goles_visitante, fecha);
            System.out.println(equipo_local + " vs " + equipo_visitante + " - " + goles_local + " : " + goles_visitante + " (" + fecha + ")");
        }
    }
}