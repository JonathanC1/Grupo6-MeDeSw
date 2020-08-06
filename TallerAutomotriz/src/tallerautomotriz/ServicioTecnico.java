/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roberson Constante
 */
public class ServicioTecnico {
    private String tipoDaño,localizacionVeh;
    private float cotizaciónDaño;
    private List<Taller> talleres;

    public ServicioTecnico(String tipoDaño, String localizacion, float cotizaciónDaño) {
        this.tipoDaño = tipoDaño;
        this.localizacionVeh = localizacion;
        this.cotizaciónDaño = cotizaciónDaño;
        talleres = new ArrayList<>();
    }
    public void añadirTaller(Taller a){
        talleres.add(a);
    }
    public boolean disponibilidadTaller(boolean a){
        if (a== true)
            return true;
        return false;
    }
    
    
    
    
}
