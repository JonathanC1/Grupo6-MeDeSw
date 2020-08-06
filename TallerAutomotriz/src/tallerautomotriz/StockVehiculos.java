package tallerautomotriz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class StockVehiculos {
    public List <Vehiculo> stock;
    private Map<String,String> hs;
    public StockVehiculos(){
        stock = new ArrayList<>();
        hs = new LinkedHashMap<>();
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
    public void ingresarVehiculo(String a, String b){
        hs.put(a, b);
    }
    public int mostrarTamañoStock(){
        return stock.size();
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
     hs.entrySet();
        for (Map.Entry<String,String> entry : hs.entrySet()) {
            System.out.println("modelo: "+entry.getKey()+ "  ->marca: " + entry.getValue());
        
     
        }
    }
}

