/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fornaso.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author root
 */
public class Inicio {
    public static void main(String[] args){
       
        //Validamos si nos podemos conectar a la BDD
        Conexion conexion = new Conexion();
        
        //Intentamos conectarnos a la BDD
        try (Connection cnx = conexion.get_connection()){
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
