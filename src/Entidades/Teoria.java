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
public class Teoria {

    int cupo = 20;

    //profesores (si es lab son 2)
    //costo
    //limite 15 lab, 20 teoria
    //capacidad actual (segun la matricula) > regla de negocio
    
    private String nombreTeoria;
    private Profesor profesor1;
    private double costo;
    private int cuposRestantes;

    public Teoria(String nombreTeoria, Profesor profesor1, double costo, int cuposRestantes) {
        this.nombreTeoria = nombreTeoria;
        this.profesor1 = profesor1;
        this.costo = costo;
        this.cuposRestantes = cuposRestantes;
    }
    
    

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public String getNombreTeoria() {
        return nombreTeoria;
    }

    public void setNombreTeoria(String nombreTeoria) {
        this.nombreTeoria = nombreTeoria;
    }

    public Profesor getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCuposRestantes() {
        return cuposRestantes;
    }

    public void setCuposRestantes(int cuposRestantes) {
        this.cuposRestantes = cuposRestantes;
    }
    
    

}
