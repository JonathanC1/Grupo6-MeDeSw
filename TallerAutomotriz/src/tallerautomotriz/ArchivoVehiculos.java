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
import java.util.Iterator;

/**
 *
 * @author Roberson Constante
 */
public class ArchivoVehiculos {
    public void adicionarVehiculo(Vehiculo v){
        File archivo = new File ("ArchivoVehiculo.txt");
        String aux = v.getMarca()+","+ v.getModelo()+"," + v.getColor()+","+v.getTipoVehiculo()+","+v.getTipoMotor()+","
                +v.getTipoTransmision()+","+v.getChasis()+","+v.getMaterialInterior()+","+v.getPlaca()+","+v.getTipoLLanta()+","
                +v.getTipoAros()+","+String.valueOf(v.getCilindraje())+","+String.valueOf(v.getNumeroPuerta())
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
    public ArrayList<Vehiculo> obtenerVehiculo(){
        ArrayList<Vehiculo> listaP = new ArrayList();
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader("ArchivoVehiculo.txt"));
            while ((s = br.readLine()) != null) {
                String[] datos = s.split(",");
                Vehiculo r1 = new Vehiculo(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9],
                        datos[10], Integer.parseInt(datos[11]), Integer.parseInt(datos[12]), Float.parseFloat(datos[13]),Boolean.parseBoolean(datos[14]),
                        Integer.parseInt(datos[15]), Integer.parseInt(datos[16]));
                listaP.add(r1);
            }
            br.close();
        } catch (Exception a){
        }
        return listaP;
    }
        public ArrayList<Vehiculo> buscarVehiculo(String vehiculo) {
            ArrayList<Vehiculo> lista = new ArrayList<>();
            String s;
            boolean b = true;
            try {
                BufferedReader br = new BufferedReader(new FileReader("ArchivoVehiculo.txt"));
                while ((s = br.readLine()) != null) {
                    String[] datos = s.split(",");
                    if ((vehiculo.equalsIgnoreCase(datos[0]) || vehiculo.equalsIgnoreCase(datos[1]))&&Boolean.parseBoolean(datos[14])) {
                        Vehiculo v1 = new Vehiculo(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9],
                                datos[10], Integer.parseInt(datos[11]), Integer.parseInt(datos[12]), Float.parseFloat(datos[13]), Boolean.parseBoolean(datos[14]),
                                Integer.parseInt(datos[15]), Integer.parseInt(datos[16]));
                        lista.add(v1);
                    }
                }
                br.close();
            } catch (IOException e) {
            }
            return lista;
        }
        public ArrayList<Vehiculo> actualizarVehiculo(String chasis,String color,String tipoT,String tapiceria,String llantas,String aros) {
            ArrayList<Vehiculo> lista = new ArrayList<>();
            String auxl = "";
            lista = obtenerVehiculo();
            Vehiculo v = new Vehiculo();
            Iterator it = lista.iterator();
            try {
                FileWriter fw = new FileWriter("ArchivoVehiculo.txt");
                PrintWriter pw = new PrintWriter(fw);
                while (it.hasNext()) {
                    v = (Vehiculo) it.next();
                    if (v.getChasis()!=chasis) {
                        auxl = v.getMarca() + "," + v.getModelo() + "," + v.getColor() + "," + v.getTipoVehiculo() + "," + v.getTipoMotor() + ","
                                + v.getTipoTransmision() + "," + v.getChasis() + "," + v.getMaterialInterior() + "," + v.getPlaca() + "," + v.getTipoLLanta() + ","
                                + v.getTipoAros() + "," + String.valueOf(v.getCilindraje()) + "," + String.valueOf(v.getNumeroPuerta())
                                + "," + String.valueOf(v.getPrecio()) + "," + String.valueOf(v.isDisponibilidad()) + "," + String.valueOf(v.getAñoFabricacion()) + "," + String.valueOf(v.getAñoMatricula());
                        pw.println(auxl);
                    }
                    auxl = v.getMarca() + "," + v.getModelo() + "," + color + "," + v.getTipoVehiculo() + "," + v.getTipoMotor() + ","
                            + tipoT + "," + chasis+ "," +tapiceria+ "," + v.getPlaca() + "," + llantas+ ","
                            + aros + "," + String.valueOf(v.getCilindraje()) + "," + String.valueOf(v.getNumeroPuerta()) 
                            + "," + String.valueOf(v.getPrecio()) + "," + String.valueOf(v.isDisponibilidad()) + "," + String.valueOf(v.getAñoFabricacion()) + "," + String.valueOf(v.getAñoMatricula());
                    pw.println(auxl);
                }          
                pw.close();
            } catch (IOException e) {
            }
            return lista;
        }
        
}


