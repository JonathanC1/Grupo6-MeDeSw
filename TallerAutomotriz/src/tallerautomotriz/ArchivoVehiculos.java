/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Roberson Constante
 */
public class ArchivoVehiculos {
    public void adicionarArchivos(Vehiculo v){
        File archivo = new File ("ArchivoVehiculo.txt");
        String aux = v.getMarca()+","+ v.getModelo()+"," + v.getColor()+","+v.getTipoVehiculo()+","+v.getTipoMotor()+","
                +v.getTipoTransmision()+","+v.getChasis()+","+v.getMaterialInterior()+","+v.getPlaca()+","+v.getTipoLLanta()+","
                +v.getTipoAros()+","+String.valueOf(v.getCilindraje())+","+String.valueOf(v.getNumeroPuerta())+","+String.valueOf(v.getGradosPolarizado())
                +","+String.valueOf(v.getPrecio())+","+String.valueOf(v.isDisponibilidad())+","+String.valueOf(v.getAñoFabricacion())+","+String.valueOf(v.getAñoMatricula());
       try{
        FileWriter fw = new FileWriter(archivo,true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(aux);
        fw.close();
        pw.close();
       }catch (Exception e){
           
       }
    }
    public ArrayList<Vehiculo> obtenerArchivo(){
        ArrayList<Vehiculo> listaP = new ArrayList();
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Roberson Constante\\Desktop\\ProyectoPOO\\archivosPOO\\producto.txt"));
            while ((s = br.readLine()) != null) {
                String[] datos = s.split(",");
                Vehiculo r1 = new Vehiculo(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9],
                        datos[10], Integer.parseInt(datos[11]),Integer.parseInt(datos[12]), Integer.parseInt(datos[13]), Float.parseFloat(datos[14]),Boolean.parseBoolean(datos[15]),
                        Integer.parseInt(datos[16]), Integer.parseInt(datos[17]));
                listaP.add(r1);
            }
            br.close();
        } catch (Exception a){
        }
        return listaP;
    }

}


