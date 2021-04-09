/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.excepcion;

/**
 *
 * @author diego
 */
public class Excepcion extends Exception{ //esta clase va a aplicar para todos los  negocios
    
    public Excepcion(String mensaje) {
        super(mensaje);
    }
    
}
