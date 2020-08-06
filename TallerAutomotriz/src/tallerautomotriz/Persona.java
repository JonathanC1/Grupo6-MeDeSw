package tallerautomotriz;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Persona {
    private String nombre;
    private String correo;
    private Date fechaNacimiento;
    private long cedula;
    private String apodo;
    private String clave;

    public Persona(String nombre, String correo, Date fechaNacimiento, long cedula, String apodo, String clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.apodo = apodo;
        this.clave = clave;
    }

    public Persona() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
        return "Persona{" + "nombre=" + nombre + ", correo=" + correo + ", fechaNacimiento=" + sdf.format(fechaNacimiento) + ", cedula=" + cedula + ", apodo=" + apodo + ", clave=" + clave + '}';
    }
    
    
}
    

