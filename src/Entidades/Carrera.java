/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Carrera {
    
    //dos carreras: ing sistemas, ing del software
    
    //puede ser un boolean
    
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = "Ingenieria en sistemas"; //en veremos
        this.carrera = "Ingenieria del software";
    }
    
    
    
}
