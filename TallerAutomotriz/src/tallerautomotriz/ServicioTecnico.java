/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public ServicioTecnico() {
    }
    public void añadirTaller(Taller a){
        talleres.add(a);
    }
    public boolean disponibilidadTaller(boolean a){
        if (a== true)
            return true;
        return false;
    }
    public void menuGestion(){
//                 Console c = System.console();
//        
        Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
            
           System.out.println("1. Mostrar Talleres");
           System.out.println("2. Agendar Cita");
           System.out.println("3. localizar Vehiculo");
           System.out.println("4. Pedir Servicio Tecnico");
           System.out.println("5. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           // ServicioTecnico st=new ServicioTecnico();
           switch(opcion){
               
               case 1:
                   System.out.println("Mostrar Talleres");
                  
                 //  st.mostrarTalleres();
                   System.out.println("Presione una tecla para continuar . . . ");
             //       sn.nextLine();
               //      sn.nextLine();
                   break;
               case 2:
                   System.out.println("Agendar Cita");
         //          st.agendarCita();
                   System.out.println("Presione una tecla para continuar . . . ");
           //         sn.nextLine();
             //        sn.nextLine();
                   break;
                case 3:
                   System.out.println("localizar Vehiculo ");
                   break;
                case 4:
                   System.out.println("Pedir Servicio Tecnico");
                   break;
                case 5:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 5");
           }
        
    }
    
    }
//        public void mostrarTalleres()
//    {
//        listaT list=new listaTalleres();
//        list.mostrarLista();
//    }
    public void agendarCita()
    {
        
        System.out.println("DATOS DEL DAÑO");
     this.tipoDaño = "CHOQUE";
     this.localizacionVeh = "CALDERAON";
     this.cotizaciónDaño = 200;
     System.out.println(toString());
    System.out.println("CITA AGENDADA....");
    System.out.println("FECHA: 5/07/2020");
    System.out.println("TURNO: ");
    }
    public void pedirServicioTecnico()
    {

    }

    @Override
    public String toString() {
        return "ServicioTecnico{" + "tipoDa\u00f1o=" + tipoDaño + ", localizacionVeh=" + localizacionVeh + ", cotizaci\u00f3nDa\u00f1o=" + cotizaciónDaño + ", talleres=" + talleres + '}';
    }
}
