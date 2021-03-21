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
    
    /*
    en esta clase se definen las carreras, solamente hay 2
    */

    //dos carreras: ing sistemas, ing del software
    //revisar esto
    
    private String informatica;
    private String sistemas;

    public Carrera() {
        this.informatica = " Ingenieria del software ";
        this.sistemas = " Ingenieria en sistemas ";
    }
    
    
    public String getInformatica() {
        return informatica;
    }

    public void setInformatica(String informatica) {
        this.informatica = " Ingenieria en informatica ";
    }

    public String getSistemas() {
        return sistemas;
    }

    public void setSistemas(String sistemas) {
        this.sistemas = " Ingenieria en sistemas ";
    }
    

     

}
