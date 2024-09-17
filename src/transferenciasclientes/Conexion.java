/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferenciasclientes;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author marco
 */
public class Conexion {
    //El codigo para la conexion con la base de datos y netbeans
    public static final String URL = "jdbc:mysql://localhost/evaluacioninterna";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static Connection getConnection() {
        //Clase para la conexion 
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }

        return connection;
    }
    
}