/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolibrerias;
/**
 *
 * @author Melina
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        setSize(815, 607);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenido = new javax.swing.JLabel();
        lblAdministrador = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnAgregarLibro = new javax.swing.JButton();
        btnAgregarLibreria = new javax.swing.JButton();
        btnModificarLibro = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("PantallaPrincipal"); // NOI18N
        setSize(new java.awt.Dimension(450, 550));
        getContentPane().setLayout(null);

        lblBienvenido.setFont(new java.awt.Font("Sitka Small", 0, 48)); // NOI18N
        lblBienvenido.setText("Bienvenido");
        lblBienvenido.setName("LblBienvenido"); // NOI18N
        getContentPane().add(lblBienvenido);
        lblBienvenido.setBounds(260, 20, 269, 61);

        lblAdministrador.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblAdministrador.setText("Opciones del administrador");
        getContentPane().add(lblAdministrador);
        lblAdministrador.setBounds(44, 92, 211, 25);
        lblAdministrador.getAccessibleContext().setAccessibleName("LblAdministradores");

        lblCliente.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblCliente.setText("Opciones del cliente");
        getContentPane().add(lblCliente);
        lblCliente.setBounds(536, 92, 155, 25);

        btnBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar Libros");
        btnBuscar.setName("btnBuscar"); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(550, 130, 137, 56);

        btnAgregarLibro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAgregarLibro.setText("Agregar libro");
        btnAgregarLibro.setToolTipText("");
        btnAgregarLibro.setName("btnBuscar"); // NOI18N
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarLibro);
        btnAgregarLibro.setBounds(70, 130, 137, 56);

        btnAgregarLibreria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAgregarLibreria.setText("Agregar librería");
        btnAgregarLibreria.setToolTipText("");
        btnAgregarLibreria.setName("btnBuscar"); // NOI18N
        btnAgregarLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibreriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarLibreria);
        btnAgregarLibreria.setBounds(70, 230, 137, 56);

        btnModificarLibro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnModificarLibro.setText("Modificar libro");
        btnModificarLibro.setToolTipText("");
        btnModificarLibro.setName("btnBuscar"); // NOI18N
        btnModificarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarLibro);
        btnModificarLibro.setBounds(70, 330, 137, 56);

        btnRegistrarse.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setName("btnBuscar"); // NOI18N
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse);
        btnRegistrarse.setBounds(550, 230, 137, 56);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-10, -20, 810, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        BuscarLibros buscarLibros = new BuscarLibros();
        buscarLibros.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
        // TODO add your handling code here:
        new DatosLibro().setVisible(true);
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void btnAgregarLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibreriaActionPerformed
        // TODO add your handling code here:
        new AgregarLibreria().setVisible(true);
    }//GEN-LAST:event_btnAgregarLibreriaActionPerformed

    private void btnModificarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLibroActionPerformed
        // TODO add your handling code here:
        new ModificarLibro().setVisible(true);
    }//GEN-LAST:event_btnModificarLibroActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
        new Registro().setVisible(true);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLibreria;
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificarLibro;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblCliente;
    // End of variables declaration//GEN-END:variables
}
