/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;


import java.util.Date;
public class Usuario extends Persona{
    private float oferta;
    
    public Usuario(String nombre, String correo, Date fechaNacimiento, long cedula, String apodo, String clave) {
        super(nombre, correo, fechaNacimiento, cedula, apodo, clave);
    }

    Usuario() {
        
    }
    
    public void buscarVehiculo(){
        
    }
    

    public float getOferta() {
        return oferta;
    }

    public void setRealizarOferta(float oferta) {
        this.oferta = oferta;
    }
    
}


