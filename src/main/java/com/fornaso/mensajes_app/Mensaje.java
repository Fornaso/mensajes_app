/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Estructura básica que realiza todas las operaciones.   
 * La clase Mensajes contiene todos los atributos del proyecto de base de datos. 
 */
package com.fornaso.mensajes_app;

/**
 *
 * @author root
 */
public class Mensaje {
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    String fecha_mensaje;
    
    //Constructor por defecto
    public Mensaje(){   
    }
    
    //Contructor para enviar todos los datos a la base de datos cuando estemos
    //creando un mensaje
    public Mensaje(String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }
    
    
    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
    
    
}
