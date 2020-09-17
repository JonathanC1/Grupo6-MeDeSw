/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import tallerautomotriz.ArchivoAdmin;
import tallerautomotriz.ArchivoUsuario;
import tallerautomotriz.Usuario;

/**
 *
 * @author Roberson Constante
 */
public class frmInicio extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    ArchivoUsuario arcUsuario = new ArchivoUsuario();
    ArchivoAdmin arcAdmin = new ArchivoAdmin();

    public frmInicio() {
        initComponents();
        pnlLogin.setVisible(false);
        pnlCrearCuenta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnlNombreTaller = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlCrearCuenta = new javax.swing.JPanel();
        lblNombre3 = new javax.swing.JLabel();
        lblCedula3 = new javax.swing.JLabel();
        lblFechaNacimiento3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNuevoApodo = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblCorreo3 = new javax.swing.JLabel();
        lblNuevoApodo3 = new javax.swing.JLabel();
        lblNuevoPassword3 = new javax.swing.JLabel();
        txtNuevoPassword = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        lblMensajeErrorApodo = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        lblApodo = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtApodo = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblMensajeError = new javax.swing.JLabel();
        lblTipoIngreso = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Taller Automotriz");

        javax.swing.GroupLayout pnlNombreTallerLayout = new javax.swing.GroupLayout(pnlNombreTaller);
        pnlNombreTaller.setLayout(pnlNombreTallerLayout);
        pnlNombreTallerLayout.setHorizontalGroup(
            pnlNombreTallerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNombreTallerLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        pnlNombreTallerLayout.setVerticalGroup(
            pnlNombreTallerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNombreTallerLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jPanel2.add(pnlNombreTaller, "card4");

        pnlCrearCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Cuenta"));

        lblNombre3.setText("Nombre");

        lblCedula3.setText("Cédula");

        lblFechaNacimiento3.setText("Fecha de nacimiento (dd/mm/yyyy)");

        lblCorreo3.setText("Correo electrónico");

        lblNuevoApodo3.setText("Apodo");

        lblNuevoPassword3.setText("Password");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblMensajeErrorApodo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlCrearCuentaLayout = new javax.swing.GroupLayout(pnlCrearCuenta);
        pnlCrearCuenta.setLayout(pnlCrearCuentaLayout);
        pnlCrearCuentaLayout.setHorizontalGroup(
            pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCrearCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMensajeErrorApodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCrearCuentaLayout.createSequentialGroup()
                        .addGroup(pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaNacimiento3)
                            .addComponent(lblNombre3)
                            .addComponent(lblCorreo3)
                            .addComponent(lblNuevoApodo3)
                            .addComponent(lblNuevoPassword3)
                            .addComponent(lblCedula3))
                        .addGap(53, 53, 53)
                        .addGroup(pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtNuevoApodo)
                            .addComponent(txtNuevoPassword)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(106, 106, 106))
            .addGroup(pnlCrearCuentaLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCrearCuentaLayout.setVerticalGroup(
            pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCrearCuentaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCrearCuentaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblFechaNacimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo3))
                .addGap(38, 38, 38)
                .addGroup(pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoApodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoApodo3))
                .addGap(18, 18, 18)
                .addGroup(pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoPassword3)
                    .addComponent(txtNuevoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensajeErrorApodo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel2.add(pnlCrearCuenta, "card3");

        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lblApodo.setText("Apodo");

        lblPassword.setText("Password");

        lblMensajeError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApodo)
                                    .addComponent(lblPassword)))
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(lblTipoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword)
                            .addComponent(txtApodo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btnIngresar))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblMensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblTipoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApodo))
                .addGap(26, 26, 26)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnIngresar)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jPanel2.add(pnlLogin, "card2");

        jMenu1.setText("Inicio");

        jMenu2.setText("Administrador");

        jMenuItem2.setText("Iniciar Sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenu1.add(jMenu2);

        jMenu3.setText("Usuario");

        jMenuItem3.setText("Iniciar Sesión");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Crear Cuenta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        limpiarLogin();
        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Administrador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Font", 0, 16)));
        pnlLogin.setVisible(true);
        lblTipoIngreso.setText("Administrador");
        pnlCrearCuenta.setVisible(false);
        pnlNombreTaller.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        limpiarLogin();
        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Font", 0, 16)));
        pnlLogin.setVisible(true);
        lblTipoIngreso.setText("Usuario");
        pnlCrearCuenta.setVisible(false);
        pnlNombreTaller.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        pnlCrearCuenta.setVisible(true);
        pnlLogin.setVisible(false);
        pnlNombreTaller.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        char[] contrasena = txtPassword.getPassword();
        if(lblTipoIngreso.getText().equalsIgnoreCase("administrador")){
           if (arcAdmin.verificarClave(txtApodo.getText(), String.valueOf(contrasena, 0, contrasena.length))) {
            new frmPrincipalAdministrador().setVisible(true);
            this.dispose();
        }else {
            lblMensajeError.setText("Apodo o Contraseña no valida");
            txtApodo.setText("");
            txtPassword.setText("");
        } 
            
        }else{
          if (arcUsuario.verificarClave(txtApodo.getText(), String.valueOf(contrasena, 0, contrasena.length))) {
            new frmPrincipal().setVisible(true);
            this.dispose();
        } else {
            lblMensajeError.setText("Apodo o Contraseña no valida");
            txtApodo.setText("");
            txtPassword.setText("");
        }   
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String fechaNac = txtFechaNacimiento.getText();
       
        Date auxFechaNac = null;
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            auxFechaNac = formatter1.parse(fechaNac);
        } catch (ParseException ex) {
            lblMensajeErrorApodo.setText("valor inválido en fecha de nacimiento");
        }

        usuario.setFechaNacimiento(auxFechaNac);
        
         if (fechaNac.equals("") || txtApodo.getText().equals("") || txtApodo.getText().equals("")) {
            lblMensajeErrorApodo.setText("Todos los campos son obligatorios");
        }

        usuario.setNombre(txtNombre.getText());
        usuario.setCedula(txtCedula.getText());
        usuario.setCorreo(txtCorreo.getText());
        usuario.setApodo(txtNuevoApodo.getText());
        usuario.setClave(txtNuevoPassword.getText());

        if (arcUsuario.validarUsuario(txtNuevoApodo.getText())) {
            arcUsuario.adicionarUsuario(usuario);
            new frmPrincipal().setVisible(true);
            lblMensajeErrorApodo.setText("");
            this.dispose();
        } else {
            lblMensajeErrorApodo.setText("Apodo ya existe");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void limpiarLogin() {
        txtApodo.setText("");
        txtPassword.setText("");
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApodo;
    private javax.swing.JLabel lblCedula3;
    private javax.swing.JLabel lblCorreo3;
    private javax.swing.JLabel lblFechaNacimiento3;
    private javax.swing.JLabel lblMensajeError;
    private javax.swing.JLabel lblMensajeErrorApodo;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNuevoApodo3;
    private javax.swing.JLabel lblNuevoPassword3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTipoIngreso;
    private javax.swing.JPanel pnlCrearCuenta;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlNombreTaller;
    private javax.swing.JTextField txtApodo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNuevoApodo;
    private javax.swing.JTextField txtNuevoPassword;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
