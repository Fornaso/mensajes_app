/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fornaso.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class Conexion {
    
    public Connection get_connection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            
            /*
            //Validación que muestra mensaje cuando la conexión es exitosa
            if(connection != null){
                System.out.println("Conexión exitosa");
            }
            */
        }catch(SQLException e){
            System.out.println(e);
        }
    return connection;
    }
}
