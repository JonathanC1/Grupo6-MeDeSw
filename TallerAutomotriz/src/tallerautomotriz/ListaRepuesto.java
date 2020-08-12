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
public class ListaRepuesto {
    List<Repuesto> listaA;
    public ListaRepuesto() {

        listaA = new ArrayList<Repuesto>();
    }

    public void adicionarRepuesto(Repuesto a) {
        listaA.add(a);
    }
    public void mostrarRepuestos() {
        Repuesto aux = new Repuesto();
        for (Object obj : listaA) {

            aux = (Repuesto) obj;
            System.out.println(aux.toString());
        }
    }
    public void MenuVenta(){
        int opc = 0;
        Repuesto aux = new Repuesto();
        Scanner sc = new Scanner(System.in);
        System.out.println("**************Bienvenido al Menu de Venta***************");
        do {
            System.out.println("Elija lo que desea realizar");
            System.out.println("1.-Visualizar lista de repuesto");
            System.out.println("2.-Buscar repuesto");
            System.out.println("3.-Comprar Repuesto");
            System.out.println("0.-Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    mostrarRepuestos();
                    break;
                case 2:
                    System.out.println("Ingrese el repuesto que busca");
                    String a = sc.nextLine();
                    buscarRepuesto(a);
                    break;
                case 3:
                    aux.menuVRepuestos();
                    break;
                case 0: 
                     System.out.println("Gracias por ingresar");
                    break;
                default:
                    System.out.println("EL dato es incorrecto");
                    break;
            }
            System.out.println("Desea cambiar otra opcion si (1) y no (0)");
            opc = sc.nextInt();
        } while (opc != 0);    
    }
    public Repuesto buscarRepuesto(String a) {
        Repuesto aux = new Repuesto();
        Repuesto laux = new Repuesto();
        Iterator it = listaA.iterator();
        while(it.hasNext()){
            aux =  (Repuesto) it.next();
            if(a.equalsIgnoreCase(aux.getNombreP()));
                laux = aux;
        }
        return laux;
        }
}
