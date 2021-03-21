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
public class Curso extends TipoCurso{
    
   /*
    en esta clase se traen las clases Teoria y laboratorio
    ya que tienen metodos diferentes 
    se hacen dos constructores segun el tipo de curso (teoria o lab)
    */
    
    private String nombreCurso;
    private Carrera carrera;
    private TipoCurso tipoCurso;

    public Curso(String nombreCurso, Carrera carrera, TipoCurso tipoCurso, boolean lab, Laboratorio laboratorio) {
        super(lab, laboratorio);
        this.nombreCurso = nombreCurso;
        this.carrera = carrera;
        this.tipoCurso = tipoCurso;
    }

    public Curso(String nombreCurso, Carrera carrera, TipoCurso tipoCurso, boolean teorico, Teoria teoria) {
        super(teorico, teoria);
        this.nombreCurso = nombreCurso;
        this.carrera = carrera;
        this.tipoCurso = tipoCurso;
    }
    
    

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
    
    
    
    
    
}
