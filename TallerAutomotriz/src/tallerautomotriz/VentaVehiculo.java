/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

/**
 *
 * @author Roberson Constante
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Console;
import java.util.Scanner;

public class VentaVehiculo {

    private String nombreComprador;
    private long nombreCuenta;
    private String formaPago;
    private float precioVenta;
    private String fechaEntrega;
    private String fechaFactura;

    public VentaVehiculo(String nombreComprador, long nombreCuenta, String formaPago, float precioVenta, String fechaEntrega, String fechaFactura) {
        this.nombreComprador = nombreComprador;
        this.nombreCuenta = nombreCuenta;
        this.formaPago = formaPago;
        this.precioVenta = precioVenta;
        this.fechaEntrega = fechaEntrega;
        this.fechaFactura = fechaFactura;
    }

    VentaVehiculo() {
    }

    public void menuVentas() {
        Console c = System.console();
        VentaVehiculo v = new VentaVehiculo();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1.- Registrar Venta");
            System.out.println("2.- Registrar Formulario");
            System.out.println("3.- acordar Terminos");
            System.out.println("4.- Registrar venta Respuestos");
            System.out.println("0.- Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println(" Registrar Venta");
                    v.registrarVenta();
                    System.out.println("Presione una tecla para continuar . . . ");
                    sn.nextLine();
                    sn.nextLine();
                    break;
                case 2:
                    System.out.println("Registrar Formulario");
                    v.registrarFormulario();
                    System.out.println("Presione una tecla para continuar . . . ");
                    sn.nextLine();
                    sn.nextLine();
                    break;
                case 3:
                    System.out.println("Registrar venta Respuestos ");
                    break;
                case 4:
                    System.out.println("Pedir Servicio Tecnico");
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }

        }

    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public long getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(long nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public void registrarVenta() {
        Date fechaEntrega = new Date("2020/08/01");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String fechaFormateada = sdf.format(fechaEntrega);

        this.nombreComprador = "jose jimenez";
        this.nombreCuenta = 265489465;
        this.formaPago = "efectivo";
        this.precioVenta = 300;
        this.fechaEntrega = fechaFormateada;
        this.fechaFactura = fechaFormateada;
        System.out.println(toString());
    }

    public void registrarFormulario() {
        Formulario form = new Formulario("os Chillos", "asdas@gmail.com", 99856, "PAQUETE KIA PER");

        System.out.println(form.toString());
    }

    @Override
    public String toString() {
        return "Venta{" + "nombreComprador=" + nombreComprador + ", nombreCuenta=" + nombreCuenta + ", formaPago=" + formaPago + ", precioVenta=" + precioVenta + ", fechaEntrega=" + fechaEntrega + ", fechaFactura=" + fechaFactura + '}';
    }
}
