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
public class Carrera {

    //dos carreras: ing sistemas, ing del software
    //puede ser un boolean
    private boolean sistemas;
    private boolean software;

    public boolean isSistemas() {
        return sistemas;
    }

    public void setSistemas(boolean sistemas) {
        //this.sistemas = sistemas;

        if (sistemas) {
            this.sistemas = true;
            this.software = false;
        } else {

        }
    }

    public boolean isSoftware() {
        return software;
    }

    public void setSoftware(boolean software) {
        // this.software = software;

        if (software) {
            this.sistemas = false;
            this.software = true;

        } else {

        }
    }

}
