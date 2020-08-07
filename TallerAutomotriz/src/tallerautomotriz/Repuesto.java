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

    public Repuesto(int numeroP, String nombreP, String marcaP, double precioP, long cantidad) {
        this.numeroP = numeroP;
        this.nombreP = nombreP;
        this.marcaP = marcaP;
        this.precioP = precioP;
        this.cantidad = cantidad;
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
             System.out.println("BUSCAR REPUESTO POR NOMBRE: ");
           System.out.println("1. ACCESORIOS");
           System.out.println("2. LUBRICANTES");
           System.out.println("3.  MOTOR");
           System.out.println("4. LLANTAS");
           System.out.println("5. FRENOS");
           System.out.println("6. CARROCERIA"); 
            System.out.println("0. SALIR"); 
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           switch(opcion){
               case 1:
                   System.out.println("Escoja la clase de accesorio");
                    System.out.println("1.- accesorio interior");
                    System.out.println("2.  accesorio exterior");
                   int a = sn.nextInt();
                   this.nombreP = nombreP;
                   break;
               case 2:
                    System.out.println("Escoja la clase de aceite");
                    System.out.println("1.- aceite de motor");
                    System.out.println("2.- aceite de pipa");
                    int b = sn.nextInt();
                   this.nombreP = nombreP;
                   break;
               case 3:
                    System.out.println("Escoja la clase de frenos");
                    System.out.println("1.- frenos de disco");
                    System.out.println("2.- frenos de aire");
                    int d = sn.nextInt();
                   this.nombreP = nombreP;
                   break;

                case 0:
                   salir=true;
                   break;
                default:
                   System.out.println("SALIR");
           }   
    }   
    }

    @Override
    public String toString() {
        return "Repuestos{" + "numeroP=" + numeroP + ", nombreP=" + nombreP + ", marcaP=" + marcaP + ", precioP=" + precioP + ", cantidad=" + cantidad + '}';
    }
   
}