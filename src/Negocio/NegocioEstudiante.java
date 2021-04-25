/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Estudiante;
import Entidades.excepcion.Excepcion;
import ManejoDatos.EstudianteDatos;
import ManejoDatos.IEstudianteDatos;
import java.util.List;

/**
 *
 * @author diego
 */
public class NegocioEstudiante {
    
    IEstudianteDatos estudianteDatos;

    public NegocioEstudiante() {
        estudianteDatos = new EstudianteDatos ();
    }
    
    public boolean insertar(Estudiante estudiante) throws Excepcion, Exception{
        return estudianteDatos.insertar(estudiante);
    }
            
    public String agregar(Estudiante estudiante) throws Excepcion, Exception{
        return estudianteDatos.agregar(estudiante);
    }
    
    public String eliminar(Estudiante estudiante) throws Excepcion, Exception{
        return estudianteDatos.eliminar(estudiante);
    }
    
    public String Actualizar(Estudiante estudiante) throws Excepcion, Exception{
        return estudianteDatos.Actualizar(estudiante);
    }
    
    public Estudiante consultar(String nombreEstudiante) throws Excepcion{
        return estudianteDatos.consultar(nombreEstudiante);
    }
    
    public List<Estudiante> consultarTodosLosEstudiantes() throws Exception{
        return estudianteDatos.consultarTodosLosEstudiantes();
    }
    
    public boolean login(String login, String password) throws Excepcion  {
        Estudiante estudiante = estudianteDatos.login(login);
        
        if (estudiante.getUsuario().equals(login)) {
            if (estudiante.getClave().equals(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    
}
