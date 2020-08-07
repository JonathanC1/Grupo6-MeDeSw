/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;
import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Repuesto {
    private int  numeroP;
   private String nombreP;
   private String marcaP;
   private double precioP;
   private long cantidad;
   private ListaCompraVenta listaC;

    public Repuesto(int numeroP, String nombreP, String marcaP, double precioP, long cantidad) {
        this.numeroP = numeroP;
        this.nombreP = nombreP;
        this.marcaP = marcaP;
        this.precioP = precioP;
        this.cantidad = cantidad;
        listaC = new ListaCompraVenta();
    }

    Repuesto() {
        
    }

    public int getNumeroP() {
        return numeroP;
    }

    public void setNumeroP(int numeroP) {
        this.numeroP = numeroP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getMarcaP() {
        return marcaP;
    }

    public void setMarcaP(String marcaP) {
        this.marcaP = marcaP;
    }

    public double getPrecioP() {
        return precioP;
    }

    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }
    public void menuRepuestos()
    {
    Console c = System.console();
      InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader (isr);    
        Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion,compra; 
       String opcion2;        
       while(!salir){
           System.out.println("MENU VENTA DE REPUESTOS");
           System.out.println("ELIJA EL REPUESTO POR NOMBRE: ");
           System.out.println("1. ACCESORIOS");
           System.out.println("2. LUBRICANTES");
           System.out.println("3. LLANTAS");
           System.out.println("4. FRENOS");
           System.out.println("0. SALIR"); 
           System.out.println("Escribe una de las opciones");
           int d = sn.nextInt();
           if (d == 1) {
               this.nombreP = "ACCESORIOS";
           } else if (d == 2) {
               this.nombreP = "LUBRICANTES";
           } else if (d == 3) {
               this.nombreP = "LLANTAS";
           } else if (d == 4) {
               this.nombreP = "FRENOS";
           } else if(d == 0){
              opcion2 = "salir";
           }else{
           this.nombreP = nombreP;
           }
           }   
       
    }
    @Override
    public String toString() {
        return "Repuestos{" + "numeroP=" + numeroP + ", nombreP=" + nombreP + ", marcaP=" + marcaP + ", precioP=" + precioP + ", cantidad=" + cantidad + '}';
    }
   
}