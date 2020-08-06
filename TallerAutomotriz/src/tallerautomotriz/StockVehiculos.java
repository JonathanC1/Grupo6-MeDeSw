package tallerautomotriz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class StockVehiculos {
    private List <Vehiculo> stock;
    public StockVehiculos(){
        stock = new ArrayList<>();
    }
    public void añadirVehiculo(Vehiculo a){
        stock.add(a);
    }
     public void eliminarVehiculo(Vehiculo a){
        stock.remove(a);
    }
    public void VehiculoEnStock(Vehiculo a){
        stock.size();
    }
    public void detalleVehiculo(){
        Vehiculo aux = new Vehiculo();
        Iterator it = stock.iterator();
        while(it.hasNext()){
            aux = (Vehiculo) it.next();
            System.out.println(aux.imprimir());
        }
    }
        public void visualirListado(){
        Vehiculo aux = new Vehiculo();
        Iterator it = stock.iterator();
        while(it.hasNext()){
            aux = (Vehiculo) it.next();
            System.out.println(aux.getModelo()+" "+aux.getMarca());
        }
    }
}
