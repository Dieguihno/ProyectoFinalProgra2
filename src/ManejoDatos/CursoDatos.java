/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoDatos;

import Entidades.Curso;
import Entidades.excepcion.Excepcion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class CursoDatos implements ICursoDatos {

    
    public static final String ARCHIVO_CURSOS = "/home/diego/Escritorio/cursos.txt"; 
    public static final String TOKEN = ";";

    
    public String agregar(Curso curso) throws Excepcion, Exception {

        String nombreCurso = null;
        String lineaCurso = mapeaCursoLinea(curso); 
        boolean grabaFicheroCurso = Utilidades.grabaArchivo(ARCHIVO_CURSOS, lineaCurso);
        if (grabaFicheroCurso) {
            nombreCurso = curso.getNombreCurso();
            return nombreCurso;
        }
        return nombreCurso;
    }

    private String mapeaCursoLinea(Curso curso) {
        StringBuilder builder = new StringBuilder();
        builder.append(curso.getNombreCurso()).append(TOKEN);
        builder.append(curso.getCupo()).append(TOKEN);
        builder.append(curso.isTipo()).append(TOKEN);
        builder.append(curso.getProfesor1()).append(TOKEN);
        builder.append(curso.getProfesor2()).append(TOKEN);
        builder.append(curso.isSistemas()).append(TOKEN);
        builder.append(curso.isSoftware()).append(TOKEN);
        builder.append(curso.getCosto()).append(TOKEN);

        return builder.toString();
    }

    
    @Override
    public String eliminar(Curso curso) throws Excepcion, Exception {
        boolean eliminar = Utilidades.eliminar(ARCHIVO_CURSOS, curso.getNombreCurso());
        if (eliminar) {
            return curso.getNombreCurso();
        }
        return "";

    }

    
    @Override
    public String Actualizar(Curso curso) throws Excepcion, Exception {
        String lineaCurso = mapeaCursoLinea(curso);
        boolean actualizar = Utilidades.actualizar(ARCHIVO_CURSOS, curso.getNombreCurso(), lineaCurso);
        if (actualizar) {
            return curso.getNombreCurso();
        }
        return "";
    }

    
    @Override
    public Curso consultar(String nombreCurso) throws Excepcion {
        try {
            String lineaCurso = Utilidades.buscarEnArchivo(ARCHIVO_CURSOS, nombreCurso);
            return mapeaLineaCurso(lineaCurso);
        } catch (Exception e) {
        }
        return null;

    }


    @Override
    public List<Curso> consultarTodosLosCursos() throws Exception {
        List<Curso> listaCursos = new ArrayList<>();
        List<String> listaLineas = Utilidades.arregloArchivo(ARCHIVO_CURSOS);
        for (String listaLinea : listaLineas) {
            Curso cursoTemporal = mapeaLineaCurso(listaLinea);
            listaCursos.add(cursoTemporal);
        }
        return listaCursos;
    }


    private Curso mapeaLineaCurso(String lineaCurso) {
        Curso curso = new Curso();
        try {
            String[] arrayCurso = lineaCurso.split(TOKEN);
            curso.setNombreCurso(arrayCurso[0]);
            curso.setCupo(Integer.parseInt(arrayCurso[1]));
            curso.setProfesor1(arrayCurso[2]);
            curso.setProfesor2(arrayCurso[3]);
            curso.setTipo(Boolean.parseBoolean(arrayCurso[4]));
            curso.setSistemas(Boolean.parseBoolean(arrayCurso[5]));
            curso.setSoftware(Boolean.parseBoolean(arrayCurso[6]));
            curso.setCosto(Double.parseDouble(arrayCurso[7]));

        } catch (Exception e) {

        }
        return curso;
    }
}
