package tallerautomotriz;


import java.util.Date;
public class Usuario extends Persona{
    private float oferta;
    
    public Usuario(String apodo, String clave,String nombre, String correo, Date fechaNacimiento, String cedula) {
        super(apodo, clave,nombre, correo, fechaNacimiento, cedula);
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
