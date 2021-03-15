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
public class Estudiante extends Persona {
    
   private double promedioPonderado;
   private Carrera carrera;

    public Estudiante(double promedioPonderado, Carrera carrera, String nombre, String apellido, String identificacion, String correo) {
        super(nombre, apellido, identificacion, correo);
        this.promedioPonderado = promedioPonderado;
        this.carrera = carrera;
    }
   
   
    public double getPromedioPonderado() {
        return promedioPonderado;
    }

    public void setPromedioPonderado(double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
   
   
    

    
}
