package tallerautomotriz;

import java.util.Date;
import java.util.Scanner;

public class Administrador extends Persona {

    //private Vehiculo v1;
    private ListaUsuario lu;
    private StockVehiculos sv;
    private VentaVehiculo vv;

    public Administrador(String apodo, String clave,ListaUsuario lu, StockVehiculos sv, VentaVehiculo vv, String nombre, String correo, Date fechaNacimiento, String cedula) {
        super(apodo, clave,nombre, correo, fechaNacimiento, cedula);
        this.lu = lu;
        this.sv = sv;
        this.vv = vv;
    }

    public Administrador() {
    }

    public Administrador(String apodo, String clave, String nombre, String correo,  String cedula) {
        super(apodo, clave, nombre, correo, cedula);
    }

    
    
    public Administrador(String apodo, String clave,ListaUsuario lu, StockVehiculos sv, String nombre, String correo, Date fechaNacimiento, String cedula) {
        super(apodo, clave,nombre, correo, fechaNacimiento, cedula);
        this.lu = lu;
        this.sv = sv;
        this.vv = null;
    }
    public void gestionarCompra() {
        vv.menuVentas();
    }

    public void cambiarEstadoVehiculo(boolean a) {
        String modelo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el modelo");
        modelo = sc.nextLine();
        for (int i = 0; i < sv.mostrarTamañoStock(); i++) {
            if (modelo.equalsIgnoreCase(sv.stock.get(i).getModelo())) {
                sv.stock.get(i).setDisponibilidad(a);
                System.out.println("Estado de vehiculo cambiado");
            }
        }
    }
    public void realizarContraOferta() {

        lu.realizarOferta();
        for (int i = 0; i < lu.mostrarCantidad(); i++) {
            System.out.println("Contraofertar a " + lu.listaU.get(i).getNombre());
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
