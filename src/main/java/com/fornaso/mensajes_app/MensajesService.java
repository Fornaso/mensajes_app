/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Esta capa es la encargada de preguntarnos los datos para enviarlos a la capa
 * de mensajes
 *
 */
package com.fornaso.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class MensajesService {
    
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        
        //Se crea el mensaje usando el objeto registro
        //Ingreso del texto del mensaje
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("");
        //Ingreso del autor del mensaje
        System.out.println("Tu nombre: ");
        String autor = sc.nextLine();
        System.out.println("");
        //Se arma el mensaje en el objeto 'registro' de la clase Mensaje
        Mensaje registro = new Mensaje();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(autor);
        
        //Enviamos el objeto creado a la capa DAO
        //mediante el méodo de clase crearMensajeDB(Mensaje mensaje)
        MensajesDAO.crearMensajeDB(registro);
    }
    
    public static void listarMensaje(){
         
    }
    
    public static void borrarMensaje(){
        
    }
    
    public static void editarMensaje(){
        
    }
}
