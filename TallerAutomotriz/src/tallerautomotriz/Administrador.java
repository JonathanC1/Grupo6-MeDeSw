
package tallerautomotriz;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Administrador extends Persona {

    //private Vehiculo v1;
    
    private ListaUsuario lu;
    private StockVehiculos sv;


    public Administrador(ListaUsuario lu, String nombre, String correo, Date fechaNacimiento, long cedula, String apodo, String clave) {
        super(nombre, correo, fechaNacimiento, cedula, apodo, clave);
        this.lu = lu;
    }

    public Administrador(ListaUsuario lu, StockVehiculos sv, String nombre, String correo, Date fechaNacimiento, long cedula, String apodo, String clave) {
        super(nombre, correo, fechaNacimiento, cedula, apodo, clave);
        this.lu = lu;
        this.sv = sv;
    }
    

    public void registrarVehiculo() {
        Date fabricacion = new Date(120, 6, 17);
        Date año = new Date(120, 9, 17);
        Vehiculo v2 = new Vehiculo("hyundai", "accent", "azul", "sedan", "8V", "1srt", "manuel", "seda", "b35481", "carreras", "anchos", 2082, 2, 17, 25728, fabricacion, año);
        StockVehiculos s1 = new StockVehiculos();
        s1.añadirVehiculo(v2);

    }

    public void gestionarCompra() {

    }

    public void cambiarEstadoVehiculo(boolean a) {
        String modelo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el modelo");
        modelo= sc.nextLine();
        for (int i = 0; i < sv.mostrarTamañoStock(); i++) {
            if(modelo.equalsIgnoreCase(sv.stock.get(i).getModelo())){
                sv.stock.get(i).setDisponibilidad(a);
                System.out.println("Estado de vehiculo cambiado");
            }
        }
        

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
    

