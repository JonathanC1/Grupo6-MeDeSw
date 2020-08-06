/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;


    import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaUsuario {
    public List<Usuario> listaU;

    public ListaUsuario() {
        listaU= new ArrayList<Usuario>();
    }
    
    public void registrarUsuario(Usuario a){
        listaU.add(a);
    }
    
    public int mostrarCantidad(){
        return listaU.size();
    }
    
    public void imprimir(){
        Usuario u1= new Usuario();
        Iterator it= listaU.iterator();
        while(it.hasNext()){
            u1= (Usuario) it.next();
            System.out.println(u1);
        }
    }
    
    public Usuario mostrarUsuario(){
        Usuario u1= new Usuario();
        Iterator it= listaU.iterator();
        while(it.hasNext()){
            u1= (Usuario) it.next();
        }
        return u1;
    }
    
    public void realizarOferta(){
        for (int i = 0; i < listaU.size(); i++) {
            System.out.println("El usuario "+listaU.get(i).getNombre()+" realizo la siguiente oferta: "+listaU.get(i).getOferta());   
        }
      
    }
}
    

