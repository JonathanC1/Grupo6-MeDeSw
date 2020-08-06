/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class GestorTallerAutomotriz {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Date fechaN;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        fechaN = sdf.parse("08-06-2000");

        int opc;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("***** CONSESIONARIA *********");
            System.out.println("1. Usuario");
            System.out.println("2. Administrador");
            System.out.println("0. Salir");
            System.out.println("Su opcion es: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Bienvenido");
                    System.out.println("1. Usuario Nuevo");
                    System.out.println("2. Usuario Registrado");
                    int opc1;
                    System.out.println("Su opcion es: ");
                    opc1 = sc.nextInt();
                    switch (opc1) {
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                            break;
                    }
                    break;
                case 2:

                    break;
                case 0:
                    System.out.println("Gracias, hasta pronto!!!");
                    break;

            }

        } while (opc != 0);
        Usuario u1 = new Usuario("Byron", "b.r-avalos", fechaN, 1752101475, "br", "123456789");
        Usuario u2 = new Usuario("Pepe", "pepeMD", fechaN, 1752101475, "pTP", "123456789");
        ListaUsuario l1 = new ListaUsuario();
        l1.registrarUsuario(u1);
        l1.registrarUsuario(u2);
        Administrador a1 = new Administrador(l1, "admin1", "admin1", fechaN, 1752101475, "pTP", "123456789");
        ListaAdministrador la = new ListaAdministrador();
        la.registrarAdministrador(a1);

        u1.setRealizarOferta(100);
        a1.realizarContraOferta();
        System.out.println("LA OFERTA ES: " + u1.getOferta());
Date fabricacion = new Date(120,6,17);
        Date año = new Date(120,9,17);
    Vehiculo v1 = new Vehiculo("hyundai","sonata","rojo","sedan","16V","1s5de","automatico","cuero","PUJ0131","carreras","anchos",2000,4,75,25725,fabricacion,año);  
    Vehiculo v2 = new Vehiculo("hyundai","accent","azul","sedan","8V","1srt","manuel","seda","b35481","carreras","anchos",2082,2,17,25728,fabricacion,año);  
    StockVehiculos s1 = new StockVehiculos();
    s1.añadirVehiculo(v1);
    s1.añadirVehiculo(v2);
    v1.personalizar();
    System.out.println(v1.imprimir());
    s1.visualirListado();
    }
    
}
