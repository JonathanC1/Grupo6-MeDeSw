
package tallerautomotriz;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Administrador extends Persona {

    //private Vehiculo v1;
    private Usuario u1;
    private ListaUsuario lu;

    public Administrador(String nombre, String correo, Date fechaNacimiento, long cedula, String apodo, String clave) {
        super(nombre, correo, fechaNacimiento, cedula, apodo, clave);
    }

    public Administrador(Usuario u1, String nombre, String correo, Date fechaNacimiento, long cedula, String apodo, String clave) {
        super(nombre, correo, fechaNacimiento, cedula, apodo, clave);
        this.u1 = u1;
    }

    public Administrador(ListaUsuario lu, String nombre, String correo, Date fechaNacimiento, long cedula, String apodo, String clave) {
        super(nombre, correo, fechaNacimiento, cedula, apodo, clave);
        this.lu = lu;
    }

    public void registrarVehiculo() {

    }

    public void gestionarCompra() {

    }

    public void cambiarEstadoVehiculo(boolean a) {

    }

    public void registrarRepuesto() {

    }

    public void gestionarServicioTecnico() {

    }

    public void realizarContraOferta() {

        lu.realizarOferta();

        for (int i = 0; i < lu.mostrarCantidad(); i++) {
            System.out.println("Contraofertar a "+lu.listaU.get(i).getNombre());
            System.out.println("1. Aceptar \n2. Contraoferta");
            int opc;
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();
            if (opc == 1) {
                System.out.println("Acepto el valor");
            }
            if (opc == 2) {
                float oferta;
                System.out.println("Ingrese la contraoferta");
                oferta = sc.nextFloat();
                lu.listaU.get(i).setRealizarOferta(oferta);
                System.out.println("Se realizo la oferta " + lu.listaU.get(i).getOferta());
            }
        }

    }

}
    

