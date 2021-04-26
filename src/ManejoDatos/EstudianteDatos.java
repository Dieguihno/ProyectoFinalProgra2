/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoDatos;

import Entidades.Estudiante;
import Entidades.excepcion.Excepcion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class EstudianteDatos implements IEstudianteDatos {
    
    
    public static final String ARCHIVO_ESTUDIANTE = "/home/diego/Escritorio/Estudiante.txt"; 
    public static final String TOKEN = ";";

    
    
    @Override
    public boolean insertar(Estudiante estudiante) throws Excepcion, Exception {
        String linea = EstudianteLinea(estudiante);
        return Utilidades.grabaArchivo(Utilidades.ARCHIVO_ESTUDIANTE, linea);
    }
    
    private String EstudianteLinea(Estudiante estudiante) { 
        return estudiante.getNombre() + Utilidades.TOKEN + estudiante.getApellido() + Utilidades.TOKEN +
                estudiante.getCarrera() + Utilidades.TOKEN + estudiante.getCorreo() + Utilidades.TOKEN +
                estudiante.getUsuario() + Utilidades.TOKEN + estudiante.getClave();

    }
    
    @Override
    public String agregar(Estudiante estudiante) throws Excepcion, Exception {

        String nombreEstudiante = null;
        String lineaEstudiante = mapeaEstudianteLinea(estudiante); 
        boolean grabaFicheroEstudiante = Utilidades.grabaArchivo(ARCHIVO_ESTUDIANTE, lineaEstudiante);
        if (grabaFicheroEstudiante) {
            nombreEstudiante = estudiante.getNombre();
            return nombreEstudiante;
        }
        return nombreEstudiante;
    }

    private String mapeaEstudianteLinea(Estudiante estudiante) {
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

    
    @Override
    public String eliminar(Estudiante estudiante) throws Excepcion, Exception {
        boolean eliminar = Utilidades.eliminar(ARCHIVO_ESTUDIANTE, estudiante.getNombre());
        if (eliminar) {
            return estudiante.getNombre();
        }
        return "";

    }

    
    @Override
    public String Actualizar(Estudiante estudiante) throws Excepcion, Exception {
        String lineaEstudiante = mapeaEstudianteLinea(estudiante);
        boolean actualizar = Utilidades.actualizar(ARCHIVO_ESTUDIANTE, estudiante.getNombre(), lineaEstudiante);
        if (actualizar) {
            return estudiante.getNombre();
        }
        return "";
    }

    
    @Override
    public Estudiante consultar(String nombreEstudiante) throws Excepcion {
        try {
            String lineaEstudiante = Utilidades.buscarEnArchivo(ARCHIVO_ESTUDIANTE, nombreEstudiante);
            return mapeaLineaEstudiante(lineaEstudiante);
        } catch (Exception e) {
        }
        return null;

    }


    @Override
    public List<Estudiante> consultarTodosLosEstudiantes() throws Excepcion, Exception {
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        List<String> listaLineas = Utilidades.arregloArchivo(ARCHIVO_ESTUDIANTE);
        for (String listaLinea : listaLineas) {
            Estudiante EstudianteTemporal = mapeaLineaEstudiante(listaLinea);
            listaEstudiantes.add(EstudianteTemporal);
        }
        return listaEstudiantes;
    }


    private Estudiante mapeaLineaEstudiante(String lineaEstudiante) {
        Estudiante estudiante = new Estudiante();
        try {
            String[] arrayEstudiante = lineaEstudiante.split(TOKEN);
            estudiante.setNombre(arrayEstudiante[0]);
            estudiante.setApellido(arrayEstudiante[1]);
            estudiante.setCorreo(arrayEstudiante[2]);
            estudiante.setCarrera(arrayEstudiante[3]);
            estudiante.setPromedio(Double.parseDouble(arrayEstudiante[4]));
            estudiante.setUsuario(arrayEstudiante[5]);
            estudiante.setClave(arrayEstudiante[6]);

        } catch (Exception e) {

        }
        return estudiante;
    }
    
    public Estudiante login(String login) throws Excepcion {
        String linea = Utilidades.buscarEnArchivo(Utilidades.ARCHIVO_ESTUDIANTE, login);
        return mapeaLineaEstudiante(linea);
    }
    
}
