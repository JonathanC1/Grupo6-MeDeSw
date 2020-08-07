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
import java.util.Iterator;
import java.util.List;

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

//    public void Compra(int codigo) {
//        for (int i = 0; i < listaA.size(); i++) {
//            if (listaA.get(i).getNumeroP() == codigo) {
//                System.out.println("COMPRA EXITOSA PRODUCTO COMPRADO...");
//                System.out.println(listaA.get(i).toString());
//            }
//  
    
}
