/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fornaso.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class MensajesDAO {
    
    public static void crearMensajeDB(Mensaje mensaje){
        //Se crea la conexion a la BDD
        Conexion db_connect =  new Conexion();
        
        //Enviamos los datos a la BDD con un try and catch
        //El try evalua la conexión a nuestra BDD
        try(Connection conexion = db_connect.get_connection()){
            //Dentro de otro try generamos la inserción de los datos
            PreparedStatement ps = null;
            try{
                //Los signos de interrogación en VALUES (?, ?) significa que los
                //datos que ingresan a la BDD van a llegar a traves de los
                //parámetros del objeto mensaje
                
                //Consulta a la BDD
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                
                //Ejecutamos actualización: envia la consulta a la BDD
                ps.executeUpdate();
                //Notificamos que el mensaje se cre correctamente
                System.out.println("Mensaje creado");
            }catch(SQLException ex){
                System.out.println(ex);
            }
        //Capturamos la excepción
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void leerMensajeDB(){
        
    }
    
    public static void borrarMensajeDB(int id_mensaje){
        
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje){
        
    }
}
