/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fornaso.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Inicio {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        //Creamos un menu para ejecutar cada una de las 4 operaciones
        do {
            System.out.println("----------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Opción: > ");
            //Leemos la opción elegida por el usuario
            opcion = sc.nextInt();
            switch (opcion){
            case 1:
                MensajesService.crearMensaje();
                break;
            case 2:
                MensajesService.listarMensaje();
                break;
            case 3:
                MensajesService.editarMensaje();
                break;
            case 4:
                MensajesService.borrarMensaje();
                break;
            default:
                break;
            }
        }while(opcion != 5);
        

        //Validamos si nos podemos conectar a la BDD
        Conexion conexion = new Conexion();
        
        //Intentamos conectarnos a la BDD
        try (Connection cnx = conexion.get_connection()){
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
