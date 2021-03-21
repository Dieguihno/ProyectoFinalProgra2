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
public class TipoCurso {

    
    private Teoria teoria;
    private Laboratorio laboratorio;

    public TipoCurso(boolean lab, Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public TipoCurso(boolean teorico, Teoria teoria) {
        this.teoria = teoria;
    }
    
    public Teoria getTeoria() {
        return teoria;
    }

    public void setTeoria(Teoria teoria) {
        this.teoria = teoria;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

}
