/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServicioTecnico {

    private String tipoDaño, localizacionVeh;
    private float cotizaciónDaño;
    private List<Taller> talleres;

    public ServicioTecnico(String tipoDaño, String localizacion, float cotizaciónDaño) {
        this.tipoDaño = tipoDaño;
        this.localizacionVeh = localizacion;
        this.cotizaciónDaño = cotizaciónDaño;
        talleres = new ArrayList<>();
    }

    public ServicioTecnico() {
    }


    public void pedirServicioTecnico() {

    }
}
