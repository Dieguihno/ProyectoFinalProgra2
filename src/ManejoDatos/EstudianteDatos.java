/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoDatos;

import Entidades.Curso;
import Entidades.Estudiante;
import Entidades.excepcion.Excepcion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class EstudianteDatos implements IEstudianteDatos {
    
    //todos los override de las utilidades, instanciados en la interface y el negocio
    public static final String ARCHIVO_CURSOS = "/home/diego/Escritorio/archivos.txt"; //quitar esta ruta y ponerla en cada archivo de clase porque son txt distintos
    public static final String TOKEN = ";";

    //ya tengo los metodos para grabar en un txt
    //luego que los tengo instanciarlos en las reglas de negocio y la interface
    @Override
    public String agregar(Estudiante estudiante) throws Excepcion, Exception {

        String nombreEstudiante = null;
        String lineaEstudiante = mapeaCursoLinea(estudiante); //nos vamos a hacer mapeaCursoLinea
        boolean grabaFicheroCurso = Utilidades.grabaArchivo(ARCHIVO_CURSOS, lineaEstudiante);
        if (grabaFicheroCurso) {
            nombreEstudiante = estudiante.getNombre();
            return nombreEstudiante;
        }
        return nombreEstudiante;
    }

    private String mapeaCursoLinea(Estudiante estudiante) {
        StringBuilder builder = new StringBuilder();
        builder.append(estudiante.getNombre()).append(TOKEN);
        builder.append(estudiante.getApellido()).append(TOKEN);
        builder.append(estudiante.getCorreo()).append(TOKEN);
        builder.append(estudiante.getCarrera()).append(TOKEN);
        builder.append(estudiante.getPromedio()).append(TOKEN);
        builder.append(estudiante.getUsuario()).append(TOKEN);
        builder.append(estudiante.getClave()).append(TOKEN);
        
        return builder.toString();
    }

    //metodo para eliminar
    @Override
    public String eliminar(Estudiante estudiante) throws Excepcion, Exception {
        boolean eliminar = Utilidades.eliminar(ARCHIVO_CURSOS, estudiante.getNombre());
        if (eliminar) {
            return estudiante.getNombre();
        }
        return "";

    }

    //metodo para actualizar
    @Override
    public String Actualizar(Estudiante estudiante) throws Excepcion, Exception {
        String lineaEstudiante = mapeaCursoLinea(estudiante);
        boolean actualizar = Utilidades.actualizar(ARCHIVO_CURSOS, estudiante.getNombre(), lineaEstudiante);
        if (actualizar) {
            return estudiante.getNombre();
        }
        return "";
    }

    //metodo de consulta
    @Override
    public Estudiante consultar(String nombreEstudiante) throws Excepcion {
        try {
            String lineaEstudiante = Utilidades.buscarEnArchivo(ARCHIVO_CURSOS, nombreEstudiante);
            return mapeaLineaCurso(lineaEstudiante);
        } catch (Exception e) {
        }
        return null;

    }

//para meter los datos en las tablas
    @Override
    public List<Estudiante> consultarTodosLosEstudiantes() throws Exception {
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        List<String> listaLineas = Utilidades.arregloArchivo(ARCHIVO_CURSOS);
        for (String listaLinea : listaLineas) {
            Estudiante cursoTemporal = mapeaLineaCurso(listaLinea);
            listaEstudiantes.add(cursoTemporal);
        }
        return listaEstudiantes;
    }

//otro metodo importante para el array
    private Estudiante mapeaLineaCurso(String lineaEstudiante) {
        Estudiante estudiante = new Estudiante();
        try {
            String[] arrayCurso = lineaEstudiante.split(TOKEN);
            estudiante.setNombre(arrayCurso[0]);
            estudiante.setApellido(arrayCurso[1]);
            estudiante.setCorreo(arrayCurso[2]);
            estudiante.setCarrera(arrayCurso[3]);
            estudiante.setPromedio(Double.parseDouble(arrayCurso[4]));
            estudiante.setUsuario(arrayCurso[5]);
            estudiante.setClave(arrayCurso[6]);

        } catch (Exception e) {

        }
        return estudiante;
    }
    
}
