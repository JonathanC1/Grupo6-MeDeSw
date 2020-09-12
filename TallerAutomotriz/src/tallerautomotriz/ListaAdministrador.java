package tallerautomotriz;
import java.util.ArrayList;
import java.util.List;

public class ListaAdministrador {
    public List <Administrador> listaA;

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
