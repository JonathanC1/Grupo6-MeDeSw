/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

/**
 *
 * @author Roberson Constante
 */

import java.util.ArrayList;
import java.util.List;

public class ListaCompraVenta{
     List <VentaVehiculo>listaVenta;

    public ListaCompraVenta() {
         listaVenta = new ArrayList <VentaVehiculo>();
         
    }
    
     public void adicionarVenta(VentaVehiculo venta)
    {
    listaVenta.add(venta);
    
    }
    public int definirTamañoLista(){
    
    
    return listaVenta.size();
    
    }
    
//    public void mostrarLista(){
//    
//    VentaVehiculo aux = new VentaVehiculo();
//    for (Object obj: listaVenta){
//    
//    aux=(VentaVehiculo) obj;
//    System.out.println(aux.toString());
//    
//   }
  //  }
    
} 

