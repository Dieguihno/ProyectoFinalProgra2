/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoDatos;

import Entidades.Curso;
import Entidades.excepcion.Excepcion;
import java.util.List;

/**
 *
 * @author diego
 */
public interface ICursoDatos {
    
    String agregar(Curso curso) throws Excepcion, Exception;
    
    String eliminar(Curso curso) throws Excepcion, Exception;
    
    String Actualizar(Curso curso) throws Excepcion, Exception;
    
    Curso consultar(String nombreCurso) throws Excepcion;
    
    List<Curso> consultarTodosLosCursos() throws Exception;
    
}
