package tallerautomotriz;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestorTallerAutomotriz {

    public static void main(String[] args) throws ParseException, IOException {
        // TODO code application logic here
        Date fechaN;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        fechaN = sdf.parse("08-06-2000");
        Usuario u1 = new Usuario("Byron", "b.r-avalos", fechaN, 1752101475, "bravalos", "123456789");
        Usuario u2 = new Usuario("Pepe", "pepeMD", fechaN, 1752101475, "pTP", "123456789");
        ListaUsuario l1 = new ListaUsuario();
        l1.registrarUsuario(u1);
        Date fabricacion = new Date(120, 6, 17);
        Date año = new Date(120, 9, 17);
        Vehiculo v1 = new Vehiculo("hyundai", "sonata", "rojo", "sedan", "16V", "1s5de", "automatico", "cuero", "PUJ0131", "carreras", "anchos", 2000, 4, 75, 25725, true, fabricacion, año);
        Vehiculo v2 = new Vehiculo("hyundai", "accent", "azul", "sedan", "8V", "1srt", "manuel", "seda", "b35481", "normal", "anchos", 2082, 2, 17, 50058, true, fabricacion, año);
        Vehiculo v3 = new Vehiculo("Mazda", "3", "verde", "camioneta", "7V", "deed15", "automatico", "seda", "PBR8154", "estandar", "anchos", 2700, 2, 75, 29725, true, fabricacion, año);
        Vehiculo v4 = new Vehiculo("Mazda", "Gt 50", "rojo", "convertible", "16V", "f85s61", "manual", "cuero", "PZX12", "carreras", "anchos", 2500, 4, 75, 17725, true, fabricacion, año);
        StockVehiculos s1 = new StockVehiculos();
        s1.añadirVehiculo(v1);
        s1.añadirVehiculo(v2);
        s1.añadirVehiculo(v3);
        s1.añadirVehiculo(v4);
        Administrador a1 = new Administrador(l1, s1, "admin1", "admin1", fechaN, 1752101475, "admin1", "123456789");
        ListaAdministrador la = new ListaAdministrador();
        la.registrarAdministrador(a1);
        v1.crearListaAutos(s1);
        v2.crearListaAutos(s1);
        v3.crearListaAutos(s1);
        v4.crearListaAutos(s1);
        Repuesto rep=new Repuesto();
        Repuesto r1 = new Repuesto(92826,"discos","daewon",25.5,8);
        Repuesto r2 = new Repuesto(92326,"frenos","shimano",10.5,4);
        Repuesto r3 = new Repuesto(92626,"focos","japones",30.5,3);
        Repuesto r4 = new Repuesto(97626,"arranque","sushusi",45,18);
        Repuesto r5 = new Repuesto(98726,"zapatas","fremaz",11.5,10);
        ListaRepuesto listaR = new ListaRepuesto();
        listaR.adicionarRepuesto(r1);
        listaR.adicionarRepuesto(r2);
        listaR.adicionarRepuesto(r3);
        listaR.adicionarRepuesto(r4);
        listaR.adicionarRepuesto(r5);
        VentaVehiculo ve=new VentaVehiculo();
        ServicioTecnico st=new ServicioTecnico();
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
                    System.out.println("********************************Bienvenido*****************************");
                    System.out.println("1. Usuario Nuevo");
                    System.out.println("2. Usuario Registrado");
                    System.out.println("0. Salir");
                    int opc1;
                    System.out.println("Su opcion es: ");
                    opc1 = sc.nextInt();
                    switch (opc1) {
                        case 1:
                            System.out.println("Ingresar los datos");
                            l1.registrarUsuario(u1);
                            l1.registrarUsuario(u2);
                            System.out.println("Usuario Registrado Exitosamente");
                            System.out.println(" Presione Enter para continuar ...");
                            System.in.read();
                            break;
                        case 2:
                            String usuario,
                             clave;
                            sc.nextLine();
                            System.out.println("Ingrese el nombre de usuario");
                            usuario = sc.nextLine();
                            System.out.println("Ingrese la clave");
                            clave = sc.nextLine();
                            for (int i = 0; i < l1.mostrarCantidad(); i++) {
                                if (usuario.equals(l1.listaU.get(i).getNombre()) && clave.equals(l1.listaU.get(i).getClave())) {
                                    System.out.println("Inicio Exitoso");
                                    int menu;
                                    do {
                                        System.out.println("\n1. Comprar un vehiculo");
                                        System.out.println("2. Vende un vehiculo");
                                        System.out.println("3. Servicio Tecnico");
                                        System.out.println("4. Repuesto");
                                        System.out.println("0. Salir");
                                        System.out.println("Su opcion es: ");
                                        menu = sc.nextInt();
                                        switch (menu) {
                                            case 1:
                                                int opcv;
                                                do {
                                                    System.out.println("\nVamos a comprar un vehiculo");
                                                    System.out.println("1. Visualizar Listado");
                                                    System.out.println("2. Personalizar Vehiculo");
                                                    System.out.println("3. Buscar Vehiculo");
                                                    System.out.println("0. Salir");
                                                    System.out.println("Su opcion es: ");
                                                    opcv = sc.nextInt();
                                                    switch (opcv) {
                                                        case 1:
                                                            s1.visualirListado();
                                                            System.out.println(" Presione Enter para continuar ...");
                                                            System.in.read();
                                                            break;
                                                        case 2:
                                                            sc.nextLine();
                                                            String modeloM;
                                                            Vehiculo vM;
                                                            System.out.println("Ingrese el modelo que desea personalizar");
                                                            modeloM = sc.nextLine();
                                                            System.out.println(modeloM);
                                                            vM = s1.buscarVehiculo(modeloM);
                                                            if (modeloM.equalsIgnoreCase(vM.getModelo())) {
                                                                vM.personalizar();
                                                                System.out.println("personalizar");
                                                            }

                                                            break;
                                                        case 3:
                                                            sc.nextLine();
                                                            String modelo;
                                                            System.out.println("Ingrese el modelo que desea buscar");
                                                            modelo = sc.nextLine();
                                                            System.out.println(s1.buscarVehiculo(modelo).imprimir());
                                                            System.out.println(" Presione Enter para continuar ...");
                                                            System.in.read();
                                                            break;
                                                        case 0:
                                                            System.out.println("Adios!!!");
                                                            break;
                                                        default:
                                                            System.out.println("Opcion no valida");
                                                            break;

                                                    }
                                                } while (opcv != 0);

                                                break;
                                            case 2:
                                                ve.menuVentas();
                                                break;
                                            case 3:
                                                st.menuGestion();
                                                break;
                                            case 4:
                                                listaR.MenuVenta();
                                                break;
                                            case 0:
                                                System.out.println("Adios!!!");
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                                break;
                                        }
                                    } while (menu != 0);

                                }
                            }
                            System.out.println(" Presione Enter para continuar ...");
                            System.in.read();
                            break;
                        case 0:
                            System.out.println("Adios!!!");
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                            break;
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Bienvenido Administrador");
                    String administrador;
                    String claveA;
                    System.out.println("Ingrese el apodo: ");
                    administrador = sc.nextLine();
                    System.out.println("Ingrese el clave: ");
                    claveA = sc.nextLine();
                    for (int i = 0; i < la.mostrarCantidad(); i++) {
                        if (administrador.equals(la.listaA.get(i).getApodo()) && claveA.equals(la.listaA.get(i).getClave())) {
                            int opcA;
                            do {
                                System.out.println("Ingreso Exitoso..");
                                System.out.println("1. Añadir un vehiculo");
                                System.out.println("2. Gestionar Compra");
                                System.out.println("3. Cambiar estado del vehiculo");
                                System.out.println("4. Añadir Respuestos");
                                System.out.println("5. Gestionar Taller");
                                System.out.println("6. Realizar contraoferta");
                                System.out.println("0. Salir");
                                System.out.println("Su opcion es");
                                opcA = sc.nextInt();
                                switch (opcA) {
                                    case 1:
                                        Vehiculo v5 = new Vehiculo("VehiculoAñadidoPorAdministrador", "accent", "azul", "sedan", "8V", "1srt", "manuel", "seda", "b35481", "carreras", "anchos", 2082, 2, 17, 25728, true, fabricacion, año);
                                        s1.añadirVehiculo(v5);
                                        System.out.println("Vehiculo añadido");
                                        break;
                                    case 2:
                                        la.listaA.get(i).gestionarCompra();
                                        break;
                                    case 3:
                                        boolean a;
                                        System.out.println("Ingrese el verdadero o falso");
                                        a = sc.nextBoolean();
                                        la.listaA.get(i).cambiarEstadoVehiculo(a);
                                        break;
                                    case 4:
                                        

                                        break;
                                    case 5:
                                        boolean d;
                                        System.out.println("Ingrese true o false para cambiar la disponibilidad");
                                        d=sc.hasNextBoolean();
                                        st.disponibilidadTaller(d);
                                        break;
                                    case 6:
                                        la.listaA.get(i).realizarContraOferta();
                                        break;
                                    case 0:
                                        System.out.println("Gracias, hasta pronto!!!");
                                        break;
                                    default:
                                        System.out.println("Opcion no valida");
                                        break;

                                }
                            } while (opcA != 0);

                        }
                    }

                    break;
                case 0:
                    System.out.println("Gracias, hasta pronto!!!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }

        } while (opc != 0);

    }

}
