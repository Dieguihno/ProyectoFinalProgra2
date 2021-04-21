/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoDatos;

import Entidades.Estudiante;
import Entidades.excepcion.Excepcion;
import java.util.List;

/**
 *
 * @author diego
 */
public interface IEstudianteDatos {
    
    String agregar(Estudiante estudiante) throws Excepcion, Exception;
    
    String eliminar(Estudiante estudiante) throws Excepcion, Exception;
    
    String Actualizar(Estudiante estudiante) throws Excepcion, Exception;
    
    Estudiante consultar(String nombreEstudiante) throws Excepcion;
    
    List<Estudiante> consultarTodosLosEstudiantes() throws Exception;
    
}
