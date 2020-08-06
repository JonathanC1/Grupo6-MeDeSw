/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

import java.util.Date;

/**
 *
 * @author Roberson Constante
 */
public class GestorTallerAutomotriz {

    public static void main(String[] args) {
        Date fabricacion = new Date(120,6,17);
        Date año = new Date(120,9,17);
    Vehiculo v1 = new Vehiculo("hyundai","sonata","rojo","sedan","16V","1s5de","automatico","cuero","PUJ0131","carreras","anchos",2000,4,75,25725,fabricacion,año);  
    Vehiculo v2 = new Vehiculo("hyundai","accent","azul","sedan","8V","1srt","manuel","seda","b35481","carreras","anchos",2082,2,17,25728,fabricacion,año);  
    StockVehiculos s1 = new StockVehiculos();
    s1.añadirVehiculo(v1);
    s1.añadirVehiculo(v2);
    v1.personalizar();
    System.out.println(v1.imprimir());
    s1.visualirListado();
    }
    
}
