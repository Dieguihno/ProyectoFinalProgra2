/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Curso;
import Entidades.excepcion.Excepcion;
import ManejoDatos.CursoDatos;
import ManejoDatos.ICursoDatos;
import java.util.List;

/**
 *
 * @author diego
 */
public class NegocioCurso {

    
    ICursoDatos cursoDatos;
    
    public NegocioCurso(){
        cursoDatos = new CursoDatos();
    }

    public String agregar(Curso curso)throws Excepcion, Exception{
        return cursoDatos.agregar(curso);
    }

    public String eliminar(Curso curso) throws Excepcion, Exception{
        return cursoDatos.eliminar(curso);
    }

    public String Actualizar(Curso curso) throws Excepcion, Exception{
        return cursoDatos.Actualizar(curso);
    }

    public Curso consultar(String nombreCurso) throws Excepcion, Exception{
        return cursoDatos.consultar(nombreCurso);
    }

    public List<Curso> consultarTodosLosCursos() throws Excepcion, Exception{
        return cursoDatos.consultarTodosLosCursos();
    }
    
}
