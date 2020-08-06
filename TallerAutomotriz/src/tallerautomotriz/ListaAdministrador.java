/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;
import java.util.ArrayList;
import java.util.List;

public class ListaAdministrador {
    private List <Administrador> listaA;

    public ListaAdministrador() {
        listaA= new ArrayList<Administrador>();
    }
    
    public void registrarAdministrador(Administrador a){
        listaA.add(a);
    }
    
    public int mostrarCantidad(){
        return listaA.size();
    }
    
    
}
