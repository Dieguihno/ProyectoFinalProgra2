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
public class Laboratorio {
    
     int cupo = 15; 
   
    //profesores (si es lab son 2)
    //costo
    //limite 15 lab, 20 teoria
    //capacidad actual (segun la matricula) > regla de negocio
    
    private String nombreLaboratorio;
    private Profesor profesor1;
    private Profesor profesor2;
    private double costo;

    public Laboratorio(String nombreLaboratorio, Profesor profesor1, Profesor profesor2, double costo) {
        this.nombreLaboratorio = nombreLaboratorio;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.costo = costo;
    }
    
    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public String getNombreLaboratorio() {
        return nombreLaboratorio;
    }

    public void setNombreLaboratorio(String nombreLaboratorio) {
        this.nombreLaboratorio = nombreLaboratorio;
    }

    public Profesor getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public Profesor getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesor profesor2) {
        this.profesor2 = profesor2;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
    
    
}
