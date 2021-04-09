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
public class Curso {
    
    private String nombreCurso;
    private int cupo;
    private boolean tipo; 
    private Double costo;
    private String profesor1;
    private String profesor2;
    private boolean sistemas;
    private boolean software;

    public Curso() {
    }

    
    
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(String profesor1) {
        this.profesor1 = profesor1;
    }

    public String getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(String profesor2) {
        this.profesor2 = profesor2;
    }

    public boolean isSistemas() {
        return sistemas;
    }

    public void setSistemas(boolean sistemas) {
        this.sistemas = sistemas;
    }

    public boolean isSoftware() {
        return software;
    }

    public void setSoftware(boolean software) {
        this.software = software;
    }
    
    
    
    
}
