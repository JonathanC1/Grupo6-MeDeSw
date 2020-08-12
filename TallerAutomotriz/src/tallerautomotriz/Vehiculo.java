/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Vehiculo {

    private String marca, modelo, color, tipoVehiculo, tipoMotor, tipoTransmision, chasis, materialInterior, placa, tipoLLanta, tipoAros;
    private int cilindraje, numeroPuerta, gradosPolarizado;
    private Date añoFabricacion, añoMatricula;
    private float precio;
    private boolean disponibilidad;

    public Vehiculo(String marca, String modelo, String color, String tipoVehiculo, String tipoMotor, String tipoTransmision, String chasis, String materialInterior, String placa, String tipoLLanta, String tipoAros, int cilindraje, int numeroPuerta, int gradosPolarizado, float precio, boolean disponibilidad, Date añoFabricacion, Date añoMatricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoMotor = tipoMotor;
        this.tipoTransmision = tipoTransmision;
        this.chasis = chasis;
        this.materialInterior = materialInterior;
        this.placa = placa;
        this.tipoLLanta = tipoLLanta;
        this.tipoAros = tipoAros;
        this.cilindraje = cilindraje;
        this.numeroPuerta = numeroPuerta;
        this.gradosPolarizado = gradosPolarizado;
        this.añoFabricacion = añoFabricacion;
        this.añoMatricula = añoMatricula;
        this.disponibilidad = disponibilidad;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmisión) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getMaterialInterior() {
        return materialInterior;
    }

    public void setMaterialInterior(String materialInterior) {
        this.materialInterior = materialInterior;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoLLanta() {
        return tipoLLanta;
    }

    public void setTipoLLanta(String tipoLLanta) {
        this.tipoLLanta = tipoLLanta;
    }

    public String getTipoAros() {
        return tipoAros;
    }

    public void setTipoAros(String tipoAros) {
        this.tipoAros = tipoAros;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public int getGradosPolarizado() {
        return gradosPolarizado;
    }

    public void setGradosPolarizado(int gradosPolarizado) {
        this.gradosPolarizado = gradosPolarizado;
    }

    public Date getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Date añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Date getAñoMatricula() {
        return añoMatricula;
    }

    public void setAñoMatricula(Date añoMatricula) {
        this.añoMatricula = añoMatricula;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void personalizar() {
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("**************Bienvenido a Personalización***************");
        do {
            System.out.println("Elija la caracteristica del vehiculo que desea editar");
            System.out.println("1.-Color del vehiculo");
            System.out.println("2.-Tipo de transmision");
            System.out.println("3.-Material Interior");
            System.out.println("4.-Tipos de llantas");
            System.out.println("5.-Tipos de Aro");
            System.out.println("0.-Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Elija el color que desea para su vehiculo");
                    System.out.println("1.-Azul");
                    System.out.println("2.-Negro");
                    System.out.println("3.-Plateado");
                    System.out.println("4.-Rojo");
                    System.out.println("0.-Salir");
                    int a = sc.nextInt();
                    if (a == 1) {
                        this.color = "azul";
                        this.precio+=10;
                    } else if (a == 2) {
                        this.color = "negro";
                        this.precio+=15;
                    } else if (a == 3) {
                        this.color = "plateado";
                        this.precio+=20;
                    } else if (a == 4) {
                        this.color = "Rojo";
                        this.precio+=25;
                    } else {
                        this.color = color;
                    }
                    break;
                case 2:
                    System.out.println("Elija el tipo de transmisión");
                    System.out.println("1.-Manual");
                    System.out.println("2.-Automatica");
                    System.out.println("0.-Salir");
                    int b = sc.nextInt();
                    if (b == 1) {
                        this.tipoTransmision = "Manual";
                        this.precio+=10;
                    } else if (b == 2) {
                        this.tipoTransmision = "Negro";
                        this.precio+=15;
                    } else {
                        this.tipoTransmision = tipoTransmision;
                    }
                    break;
                case 3:
                    System.out.println("Tipo de Material interior");
                    System.out.println("1.-Cuero");
                    System.out.println("2.-Tela ");
                    System.out.println("3.-fibras");
                    System.out.println("0.-Salir");
                    int e = sc.nextInt();
                    if (e == 1) {
                        this.materialInterior = "Cuero";
                        this.precio+=10;
                    } else if (e == 2) {
                        this.materialInterior = "Tela";
                        this.precio+=15;
                    } else if (e == 3) {
                        this.materialInterior = "fibras";
                        this.precio+=20;
                    } else {
                        this.materialInterior = materialInterior;
                        this.precio+=25;
                    }
                    break;
                case 4:
                    System.out.println("Tipo de Llantas");
                    System.out.println("1.-llantas de carrera");
                    System.out.println("2.-llantas de Todoterreno");
                    System.out.println("3.-llantas estandar");
                    System.out.println("0.-Salir");
                    int c = sc.nextInt();
                    if (c == 1) {
                        this.tipoLLanta = "llantas de carrera";
                        this.precio+=10;
                    } else if (c == 2) {
                        this.tipoLLanta = "llantas de Todoterreno";
                        this.precio+=15;
                    } else if (c == 3) {
                        this.tipoLLanta = "llantas estandar";
                        this.precio+=20;
                    } else {
                        this.tipoLLanta = tipoLLanta;
                    }
                    break;
                case 5:
                    System.out.println("Tipo de Aros");
                    System.out.println("1.-Aros niquelados");
                    System.out.println("2.-Aros estandar");
                    System.out.println("3.-Aros alecion");
                    System.out.println("4.-Aros aluminio");
                    System.out.println("0.-Salir");
                    int d = sc.nextInt();
                    if (d == 1) {
                        this.tipoAros = "niquelados";
                        this.precio+=10;
                    } else if (d == 2) {
                        this.tipoAros = "estandar";
                        this.precio+=15;
                    } else if (d == 3) {
                        this.tipoAros = "alecion";
                        this.precio+=20;
                    } else if (d == 4) {
                        this.tipoAros = "aluminio";
                        this.precio+=25;
                    } else {
                        this.tipoAros = tipoAros;
                    }
                    break;
                case 0: 
                     System.out.println("cambios guardados exitosamente1"
                             + "");
                    break;
                default:
                    System.out.println("EL dato es incorrecto");
                    break;
            }
            System.out.println("Desea cambiar otra opcion si (1) y no (0)");
            opc = sc.nextInt();
        } while (opc != 0);
    }

    public void crearListaAutos(StockVehiculos a) {
        StockVehiculos aux = a;
        aux.ingresarVehiculo(this.modelo, this.marca);
    }

    public String imprimir() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color
                + ", tipoVehiculo=" + tipoVehiculo + ", tipoMotor=" + tipoMotor + ", tipoTransmision=" + tipoTransmision + ", chasis=" + chasis + ", materialInterior=" + materialInterior
                + ", placa=" + placa + ", tipoLLanta=" + tipoLLanta + ", tipoAros=" + tipoAros + ", cilindraje=" + cilindraje + ", numeroPuerta=" + numeroPuerta + ", gradosPolarizado=" + gradosPolarizado
                + ", a\u00f1oFabricacion=" + sdf.format(añoFabricacion) + ", a\u00f1oMatricula=" + sdf.format(añoMatricula) + '}';
    }

}
