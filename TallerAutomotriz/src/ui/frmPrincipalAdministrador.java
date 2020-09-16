/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import tallerautomotriz.ArchivoRepuestos;
import tallerautomotriz.ArchivoVehiculos;
import tallerautomotriz.Repuesto;
import tallerautomotriz.Vehiculo;

/**
 *
 * @author Roberson Constante
 */
public class frmPrincipalAdministrador extends javax.swing.JFrame {

    ArchivoVehiculos arcVehiculo = new ArchivoVehiculos();
    ArchivoRepuestos arcRepuestos = new ArchivoRepuestos();
    ArrayList<Vehiculo> lista = new ArrayList<>();
    ArrayList<Repuesto> listaR = new ArrayList<>();
    Vehiculo v1 = new Vehiculo();
    Repuesto r1 = new Repuesto();
    /**
     * Creates new form frmPrincipalAdministrador
     */
    public frmPrincipalAdministrador() {
        initComponents();
        jpnlRegistroVehiculos.setVisible(false);
        jpnlRegistroRepuestos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlRegistroRepuesto = new javax.swing.JPanel();
        jpnlRegistro8 = new javax.swing.JPanel();
        lblNombreRepuesto8 = new javax.swing.JLabel();
        lblMarcaRepuesto8 = new javax.swing.JLabel();
        lblPrecioRepuesto8 = new javax.swing.JLabel();
        lblCantidadRepuesto8 = new javax.swing.JLabel();
        txtRepuestoNombre8 = new javax.swing.JTextField();
        txtRepuestoMarca8 = new javax.swing.JTextField();
        txtRepuestoPrecio8 = new javax.swing.JTextField();
        txtRepuestoCantidad8 = new javax.swing.JTextField();
        btnRepuestoAgregar8 = new javax.swing.JButton();
        btnRepuestoEliminar8 = new javax.swing.JButton();
        btnRepuestoModificar8 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtblListaRepuestos8 = new javax.swing.JTable();
        jpnlRegistroVehiculos = new javax.swing.JPanel();
        pnlRegistroVehiculo = new javax.swing.JPanel();
        lblVentaMarca = new javax.swing.JLabel();
        lblVentaModelo = new javax.swing.JLabel();
        lblVentaTipoMotor = new javax.swing.JLabel();
        lblVentaCilindraje = new javax.swing.JLabel();
        lblVentaPuertas = new javax.swing.JLabel();
        lblVentaAnioFabricacion = new javax.swing.JLabel();
        lblVentaPlaca = new javax.swing.JLabel();
        lblVentaChasis = new javax.swing.JLabel();
        txtRegistroMarca = new javax.swing.JTextField();
        txtRegistroModelo = new javax.swing.JTextField();
        txtRegistroPlaca = new javax.swing.JTextField();
        txtRegistroMotor = new javax.swing.JTextField();
        txtRegistroChasis = new javax.swing.JTextField();
        txtRegistroCilindraje = new javax.swing.JTextField();
        txtRegistroPuertas = new javax.swing.JTextField();
        txtRegistroFabricacion = new javax.swing.JTextField();
        lblVentaColor = new javax.swing.JLabel();
        lblVentaTransmision = new javax.swing.JLabel();
        lblVentaTapiceria = new javax.swing.JLabel();
        lblVentaLlantas = new javax.swing.JLabel();
        lblVentaAros = new javax.swing.JLabel();
        lblVentaPrecio = new javax.swing.JLabel();
        txtRegistroColor = new javax.swing.JTextField();
        txtRegistroTransmision = new javax.swing.JTextField();
        txtRegistroTapiceria = new javax.swing.JTextField();
        txtRegistroLlantas = new javax.swing.JTextField();
        txtRegistroAros = new javax.swing.JTextField();
        txtRegistroPrecio = new javax.swing.JTextField();
        lblRegistroMatricula = new javax.swing.JLabel();
        txtRegistroMatricula = new javax.swing.JTextField();
        lblVentaPrecio1 = new javax.swing.JLabel();
        txtRegistroTipoV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaVehiculos = new javax.swing.JTable();
        btnAgregarVehiculo = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        btnModificarVehiculo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlRegistro8.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Repuestos"));

        lblNombreRepuesto8.setText("Nombre:");

        lblMarcaRepuesto8.setText("Marca:");

        lblPrecioRepuesto8.setText("Precio:");

        lblCantidadRepuesto8.setText("Cantidad:");

        txtRepuestoNombre8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepuestoNombre8txtRepuestoNombreActionPerformed(evt);
            }
        });

        txtRepuestoPrecio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepuestoPrecio8txtRepuestoPrecioActionPerformed(evt);
            }
        });

        btnRepuestoAgregar8.setText("Agregar");

        btnRepuestoEliminar8.setText("Eliminar");

        btnRepuestoModificar8.setText("Modificar");

        jtblListaRepuestos8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jtblListaRepuestos8);

        javax.swing.GroupLayout jpnlRegistro8Layout = new javax.swing.GroupLayout(jpnlRegistro8);
        jpnlRegistro8.setLayout(jpnlRegistro8Layout);
        jpnlRegistro8Layout.setHorizontalGroup(
            jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlRegistro8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlRegistro8Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnlRegistro8Layout.createSequentialGroup()
                        .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlRegistro8Layout.createSequentialGroup()
                                .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCantidadRepuesto8, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(lblPrecioRepuesto8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRepuestoPrecio8, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txtRepuestoCantidad8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpnlRegistro8Layout.createSequentialGroup()
                                .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnlRegistro8Layout.createSequentialGroup()
                                        .addComponent(lblMarcaRepuesto8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(jpnlRegistro8Layout.createSequentialGroup()
                                        .addComponent(lblNombreRepuesto8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(38, 38, 38)))
                                .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRepuestoNombre8, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txtRepuestoMarca8))
                                .addGap(27, 27, 27)))
                        .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRepuestoModificar8)
                            .addComponent(btnRepuestoAgregar8)
                            .addComponent(btnRepuestoEliminar8))
                        .addGap(521, 521, 521))))
        );
        jpnlRegistro8Layout.setVerticalGroup(
            jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlRegistro8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreRepuesto8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRepuestoNombre8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRepuestoAgregar8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlRegistro8Layout.createSequentialGroup()
                        .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarcaRepuesto8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepuestoMarca8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlRegistro8Layout.createSequentialGroup()
                        .addComponent(btnRepuestoEliminar8)
                        .addGap(18, 18, 18)))
                .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioRepuesto8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepuestoPrecio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRepuestoModificar8))
                .addGap(17, 17, 17)
                .addGroup(jpnlRegistro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadRepuesto8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepuestoCantidad8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnlRegistroRepuestoLayout = new javax.swing.GroupLayout(jpnlRegistroRepuesto);
        jpnlRegistroRepuesto.setLayout(jpnlRegistroRepuestoLayout);
        jpnlRegistroRepuestoLayout.setHorizontalGroup(
            jpnlRegistroRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(jpnlRegistroRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnlRegistroRepuestoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpnlRegistro8, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpnlRegistroRepuestoLayout.setVerticalGroup(
            jpnlRegistroRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jpnlRegistroRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnlRegistroRepuestoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpnlRegistro8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlRegistroVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculo"));

        lblVentaMarca.setText("Marca");

        lblVentaModelo.setText("Modelo");

        lblVentaTipoMotor.setText("Tipo de motor");

        lblVentaCilindraje.setText("Cilindraje");

        lblVentaPuertas.setText("Número de Puertas ");

        lblVentaAnioFabricacion.setText("Año de Fabricación");

        lblVentaPlaca.setText("Placa");

        lblVentaChasis.setText("Chasis");

        txtRegistroMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroMarcaActionPerformed(evt);
            }
        });

        lblVentaColor.setText("Color");

        lblVentaTransmision.setText("Tipo de transmisión");

        lblVentaTapiceria.setText("Tapicería");

        lblVentaLlantas.setText("Tipo de LLantas");

        lblVentaAros.setText("Tipo de Aros");

        lblVentaPrecio.setText("Precio");

        lblRegistroMatricula.setText("Año de Matriculación");

        lblVentaPrecio1.setText("Tipo de Vehiculo");

        javax.swing.GroupLayout pnlRegistroVehiculoLayout = new javax.swing.GroupLayout(pnlRegistroVehiculo);
        pnlRegistroVehiculo.setLayout(pnlRegistroVehiculoLayout);
        pnlRegistroVehiculoLayout.setHorizontalGroup(
            pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaPlaca)
                    .addComponent(lblVentaTipoMotor)
                    .addComponent(lblVentaChasis)
                    .addComponent(lblVentaCilindraje)
                    .addComponent(lblVentaPuertas)
                    .addComponent(lblVentaAnioFabricacion)
                    .addComponent(lblVentaAros)
                    .addComponent(lblVentaColor)
                    .addComponent(lblVentaTransmision)
                    .addComponent(lblVentaTapiceria)
                    .addComponent(lblRegistroMatricula)
                    .addComponent(lblVentaLlantas)
                    .addComponent(lblVentaPrecio)
                    .addComponent(lblVentaPrecio1)
                    .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblVentaMarca)
                        .addComponent(lblVentaModelo)))
                .addGap(126, 126, 126)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroVehiculoLayout.createSequentialGroup()
                        .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegistroTipoV, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegistroPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlRegistroVehiculoLayout.createSequentialGroup()
                        .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtRegistroMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(txtRegistroModelo)
                                .addComponent(txtRegistroPlaca)
                                .addComponent(txtRegistroMotor)
                                .addComponent(txtRegistroChasis)
                                .addComponent(txtRegistroCilindraje)
                                .addComponent(txtRegistroPuertas)
                                .addComponent(txtRegistroFabricacion)
                                .addComponent(txtRegistroColor)
                                .addComponent(txtRegistroTransmision)
                                .addComponent(txtRegistroTapiceria)
                                .addComponent(txtRegistroLlantas)
                                .addComponent(txtRegistroAros))
                            .addComponent(txtRegistroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        pnlRegistroVehiculoLayout.setVerticalGroup(
            pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroVehiculoLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRegistroVehiculoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtRegistroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaModelo)
                    .addComponent(txtRegistroModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaPlaca)
                    .addComponent(txtRegistroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaTipoMotor)
                    .addComponent(txtRegistroMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaChasis)
                    .addComponent(txtRegistroChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVentaCilindraje)
                    .addComponent(txtRegistroCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaPuertas)
                    .addComponent(txtRegistroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaAnioFabricacion)
                    .addComponent(txtRegistroFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaColor)
                    .addComponent(txtRegistroColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaTransmision)
                    .addComponent(txtRegistroTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaTapiceria)
                    .addComponent(txtRegistroTapiceria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaLlantas)
                    .addComponent(txtRegistroLlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaAros)
                    .addComponent(txtRegistroAros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistroMatricula)
                    .addComponent(txtRegistroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVentaPrecio1)
                    .addComponent(txtRegistroTipoV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistroPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVentaPrecio)))
        );

        tblListaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblListaVehiculos);

        btnAgregarVehiculo.setText("Agregar");
        btnAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVehiculoActionPerformed(evt);
            }
        });

        btnEliminarVehiculo.setText("Eliminar");

        btnModificarVehiculo.setText("Modificar");

        javax.swing.GroupLayout jpnlRegistroVehiculosLayout = new javax.swing.GroupLayout(jpnlRegistroVehiculos);
        jpnlRegistroVehiculos.setLayout(jpnlRegistroVehiculosLayout);
        jpnlRegistroVehiculosLayout.setHorizontalGroup(
            jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlRegistroVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnAgregarVehiculo)
                        .addGap(79, 79, 79)
                        .addComponent(btnEliminarVehiculo)
                        .addGap(56, 56, 56)
                        .addComponent(btnModificarVehiculo))
                    .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jpnlRegistroVehiculosLayout.setVerticalGroup(
            jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                .addGroup(jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarVehiculo)
                            .addComponent(btnEliminarVehiculo)
                            .addComponent(btnModificarVehiculo))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jMenu1.setText("Catálogos");

        jMenuItem1.setText("Vehículos");
        jMenuItem1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuItem1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Repuestos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(422, Short.MAX_VALUE)
                .addComponent(jpnlRegistroVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(362, 362, 362)
                    .addComponent(jpnlRegistroRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlRegistroVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(269, 269, 269)
                    .addComponent(jpnlRegistroRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(270, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        jpnlRegistroVehiculos.setVisible(true);
        jpnlRegistroRepuestos.setVisible(false);
        mostrarDatos();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuItem1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1AncestorAdded

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jpnlRegistroVehiculos.setVisible(false);
        jpnlRegistroRepuestos.setVisible(true);
        mostrarDatosRepuestos();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVehiculoActionPerformed
        v1.setMarca(txtRegistroMarca.getText());
        v1.setModelo(txtRegistroModelo.getText());
        v1.setPlaca(txtRegistroPlaca.getText());
        v1.setTipoMotor(txtRegistroMotor.getText());
        v1.setChasis(txtRegistroChasis.getText());
        v1.setCilindraje(Integer.parseInt(txtRegistroCilindraje.getText()));
        v1.setNumeroPuerta(Integer.parseInt(txtRegistroPuertas.getText()));
        v1.setAñoFabricacion(Integer.parseInt(txtRegistroFabricacion.getText()));
        v1.setColor(txtRegistroColor.getText());
        v1.setTipoTransmision(txtRegistroTransmision.getText());
        v1.setMaterialInterior(txtRegistroTapiceria.getText());
        v1.setTipoLLanta(txtRegistroLlantas.getText());
        v1.setTipoAros(txtRegistroAros.getText());
        v1.setPrecio(Float.parseFloat(txtRegistroPrecio.getText()));
        v1.setAñoMatricula(Integer.parseInt(txtRegistroMatricula.getText()));
        v1.setTipoVehiculo(txtRegistroTipoV.getText());
        v1.setDisponibilidad(true);
        arcVehiculo.adicionarVehiculo(v1);
    }//GEN-LAST:event_btnAgregarVehiculoActionPerformed

    private void txtRegistroMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroMarcaActionPerformed
        
    }//GEN-LAST:event_txtRegistroMarcaActionPerformed

    private void txtRepuestoNombre8txtRepuestoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepuestoNombre8txtRepuestoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepuestoNombre8txtRepuestoNombreActionPerformed

    private void txtRepuestoPrecio8txtRepuestoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepuestoPrecio8txtRepuestoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepuestoPrecio8txtRepuestoPrecioActionPerformed
   public void mostrarDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CHASIS");
        modelo.addColumn("MODELO");
        modelo.addColumn("MARCA");
        modelo.addColumn("PRECIO");
        tblListaVehiculos.setModel(modelo);
        String [] datos = new String [4];
        lista = arcVehiculo.obtenerVehiculo();
        Iterator it = lista.iterator();
        while(it.hasNext()){
            v1 = (Vehiculo) it.next();
            datos[0] = v1.getChasis();
            datos[1] = v1.getModelo();
            datos[2] = v1.getMarca();
            datos[3] = String.valueOf(v1.getPrecio());
            modelo.addRow(datos);
        }
    }
      public void mostrarDatosRepuestos(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NOMBRE");
        modelo.addColumn("MARCA");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO");
        jtblListaRepuestos.setModel(modelo);
        String [] datos = new String [4];
        listaR = arcRepuestos.obtenerRepuesto();
        Iterator it = listaR.iterator();
        while(it.hasNext()){
            r1 = (Repuesto) it.next();
            datos[0] = r1.getNombreP();
            datos[1] = r1.getMarcaP();
            datos[2] = String.valueOf(r1.getCantidad());
            datos[3] = String.valueOf(r1.getPrecioP());
            modelo.addRow(datos);
        }
    }
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnModificarVehiculo;
    private javax.swing.JButton btnRepuestoAgregar;
    private javax.swing.JButton btnRepuestoAgregar1;
    private javax.swing.JButton btnRepuestoAgregar2;
    private javax.swing.JButton btnRepuestoAgregar3;
    private javax.swing.JButton btnRepuestoAgregar4;
    private javax.swing.JButton btnRepuestoAgregar5;
    private javax.swing.JButton btnRepuestoAgregar6;
    private javax.swing.JButton btnRepuestoAgregar8;
    private javax.swing.JButton btnRepuestoEliminar;
    private javax.swing.JButton btnRepuestoEliminar1;
    private javax.swing.JButton btnRepuestoEliminar2;
    private javax.swing.JButton btnRepuestoEliminar3;
    private javax.swing.JButton btnRepuestoEliminar4;
    private javax.swing.JButton btnRepuestoEliminar5;
    private javax.swing.JButton btnRepuestoEliminar6;
    private javax.swing.JButton btnRepuestoEliminar8;
    private javax.swing.JButton btnRepuestoModificar;
    private javax.swing.JButton btnRepuestoModificar1;
    private javax.swing.JButton btnRepuestoModificar2;
    private javax.swing.JButton btnRepuestoModificar3;
    private javax.swing.JButton btnRepuestoModificar4;
    private javax.swing.JButton btnRepuestoModificar5;
    private javax.swing.JButton btnRepuestoModificar6;
    private javax.swing.JButton btnRepuestoModificar8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel jpnlRegistro;
    private javax.swing.JPanel jpnlRegistro1;
    private javax.swing.JPanel jpnlRegistro2;
    private javax.swing.JPanel jpnlRegistro3;
    private javax.swing.JPanel jpnlRegistro4;
    private javax.swing.JPanel jpnlRegistro5;
    private javax.swing.JPanel jpnlRegistro6;
    private javax.swing.JPanel jpnlRegistro8;
    private javax.swing.JPanel jpnlRegistroRepuesto;
    private javax.swing.JPanel jpnlRegistroRepuestos;
    private javax.swing.JPanel jpnlRegistroRepuestos1;
    private javax.swing.JPanel jpnlRegistroRepuestos2;
    private javax.swing.JPanel jpnlRegistroRepuestos3;
    private javax.swing.JPanel jpnlRegistroVehiculos;
    private javax.swing.JTable jtblListaRepuestos;
    private javax.swing.JTable jtblListaRepuestos1;
    private javax.swing.JTable jtblListaRepuestos2;
    private javax.swing.JTable jtblListaRepuestos3;
    private javax.swing.JTable jtblListaRepuestos4;
    private javax.swing.JTable jtblListaRepuestos5;
    private javax.swing.JTable jtblListaRepuestos6;
    private javax.swing.JTable jtblListaRepuestos8;
    private javax.swing.JLabel lblCantidadRepuesto;
    private javax.swing.JLabel lblCantidadRepuesto1;
    private javax.swing.JLabel lblCantidadRepuesto2;
    private javax.swing.JLabel lblCantidadRepuesto3;
    private javax.swing.JLabel lblCantidadRepuesto4;
    private javax.swing.JLabel lblCantidadRepuesto5;
    private javax.swing.JLabel lblCantidadRepuesto6;
    private javax.swing.JLabel lblCantidadRepuesto8;
    private javax.swing.JLabel lblMarcaRepuesto;
    private javax.swing.JLabel lblMarcaRepuesto1;
    private javax.swing.JLabel lblMarcaRepuesto2;
    private javax.swing.JLabel lblMarcaRepuesto3;
    private javax.swing.JLabel lblMarcaRepuesto4;
    private javax.swing.JLabel lblMarcaRepuesto5;
    private javax.swing.JLabel lblMarcaRepuesto6;
    private javax.swing.JLabel lblMarcaRepuesto8;
    private javax.swing.JLabel lblNombreRepuesto;
    private javax.swing.JLabel lblNombreRepuesto1;
    private javax.swing.JLabel lblNombreRepuesto2;
    private javax.swing.JLabel lblNombreRepuesto3;
    private javax.swing.JLabel lblNombreRepuesto4;
    private javax.swing.JLabel lblNombreRepuesto5;
    private javax.swing.JLabel lblNombreRepuesto6;
    private javax.swing.JLabel lblNombreRepuesto8;
    private javax.swing.JLabel lblPrecioRepuesto;
    private javax.swing.JLabel lblPrecioRepuesto1;
    private javax.swing.JLabel lblPrecioRepuesto2;
    private javax.swing.JLabel lblPrecioRepuesto3;
    private javax.swing.JLabel lblPrecioRepuesto4;
    private javax.swing.JLabel lblPrecioRepuesto5;
    private javax.swing.JLabel lblPrecioRepuesto6;
    private javax.swing.JLabel lblPrecioRepuesto8;
    private javax.swing.JLabel lblRegistroMatricula;
    private javax.swing.JLabel lblVentaAnioFabricacion;
    private javax.swing.JLabel lblVentaAros;
    private javax.swing.JLabel lblVentaChasis;
    private javax.swing.JLabel lblVentaCilindraje;
    private javax.swing.JLabel lblVentaColor;
    private javax.swing.JLabel lblVentaLlantas;
    private javax.swing.JLabel lblVentaMarca;
    private javax.swing.JLabel lblVentaModelo;
    private javax.swing.JLabel lblVentaPlaca;
    private javax.swing.JLabel lblVentaPrecio;
    private javax.swing.JLabel lblVentaPrecio1;
    private javax.swing.JLabel lblVentaPuertas;
    private javax.swing.JLabel lblVentaTapiceria;
    private javax.swing.JLabel lblVentaTipoMotor;
    private javax.swing.JLabel lblVentaTransmision;
    private javax.swing.JPanel pnlRegistroVehiculo;
    private javax.swing.JTable tblListaVehiculos;
    private javax.swing.JTextField txtRegistroAros;
    private javax.swing.JTextField txtRegistroChasis;
    private javax.swing.JTextField txtRegistroCilindraje;
    private javax.swing.JTextField txtRegistroColor;
    private javax.swing.JTextField txtRegistroFabricacion;
    private javax.swing.JTextField txtRegistroLlantas;
    private javax.swing.JTextField txtRegistroMarca;
    private javax.swing.JTextField txtRegistroMatricula;
    private javax.swing.JTextField txtRegistroModelo;
    private javax.swing.JTextField txtRegistroMotor;
    private javax.swing.JTextField txtRegistroPlaca;
    private javax.swing.JTextField txtRegistroPrecio;
    private javax.swing.JTextField txtRegistroPuertas;
    private javax.swing.JTextField txtRegistroTapiceria;
    private javax.swing.JTextField txtRegistroTipoV;
    private javax.swing.JTextField txtRegistroTransmision;
    private javax.swing.JTextField txtRepuestoCantidad;
    private javax.swing.JTextField txtRepuestoCantidad1;
    private javax.swing.JTextField txtRepuestoCantidad2;
    private javax.swing.JTextField txtRepuestoCantidad3;
    private javax.swing.JTextField txtRepuestoCantidad4;
    private javax.swing.JTextField txtRepuestoCantidad5;
    private javax.swing.JTextField txtRepuestoCantidad6;
    private javax.swing.JTextField txtRepuestoCantidad8;
    private javax.swing.JTextField txtRepuestoMarca;
    private javax.swing.JTextField txtRepuestoMarca1;
    private javax.swing.JTextField txtRepuestoMarca2;
    private javax.swing.JTextField txtRepuestoMarca3;
    private javax.swing.JTextField txtRepuestoMarca4;
    private javax.swing.JTextField txtRepuestoMarca5;
    private javax.swing.JTextField txtRepuestoMarca6;
    private javax.swing.JTextField txtRepuestoMarca8;
    private javax.swing.JTextField txtRepuestoNombre;
    private javax.swing.JTextField txtRepuestoNombre1;
    private javax.swing.JTextField txtRepuestoNombre2;
    private javax.swing.JTextField txtRepuestoNombre3;
    private javax.swing.JTextField txtRepuestoNombre4;
    private javax.swing.JTextField txtRepuestoNombre5;
    private javax.swing.JTextField txtRepuestoNombre6;
    private javax.swing.JTextField txtRepuestoNombre8;
    private javax.swing.JTextField txtRepuestoPrecio;
    private javax.swing.JTextField txtRepuestoPrecio1;
    private javax.swing.JTextField txtRepuestoPrecio2;
    private javax.swing.JTextField txtRepuestoPrecio3;
    private javax.swing.JTextField txtRepuestoPrecio4;
    private javax.swing.JTextField txtRepuestoPrecio5;
    private javax.swing.JTextField txtRepuestoPrecio6;
    private javax.swing.JTextField txtRepuestoPrecio8;
    // End of variables declaration//GEN-END:variables
}
