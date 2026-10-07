/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory;

public class conexion {
    private static final String URL
            = "jdbc:mysql://localhost:3306/agenda_medica"
            + "?useSSL=false"
            + "&sreverTimezone=UTC"
            + "&allowPublicKeyRetrieval";

    private static final String USUARIO = "root";

    private static final String PASSWORD = "1234";

    private static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection(
                    URL,
                    USUARIO,
                    PASSWORD
            );
            System.out.println("Conexion a agenda_medica exitosa");
        } catch (ClassNotFoundException e){
            System.out.println("No se encontro el driver de MYSQL");
            e.printStackTrace();
        } catch (SQLException e){
            System.out.println("Error al conectar con agenda medica");
            e.printStackTrace(); 
        }
        return conexion;
    }
}
