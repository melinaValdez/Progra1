/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolibrerias;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Melina
 */
public class AgregarLibreria extends javax.swing.JFrame {

    /**
     * Creates new form AgregarLibreria
     */
    public AgregarLibreria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre1 = new javax.swing.JLabel();
        lblDatosLibreria = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUbicacion = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        lblNombre1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblNombre1.setText("Nombre:");

        setSize(new java.awt.Dimension(815, 607));
        getContentPane().setLayout(null);

        lblDatosLibreria.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        lblDatosLibreria.setText("Datos de la librería");
        getContentPane().add(lblDatosLibreria);
        lblDatosLibreria.setBounds(220, 30, 292, 48);

        lblNombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(20, 110, 75, 27);

        lblPais.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblPais.setText("País:");
        getContentPane().add(lblPais);
        lblPais.setBounds(410, 110, 37, 27);

        lblTelefono.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblTelefono.setText("Teléfono:");
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(380, 220, 77, 27);

        lblHorario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblHorario.setText("Horario:");
        getContentPane().add(lblHorario);
        lblHorario.setBounds(20, 220, 68, 27);

        lblUbicacion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblUbicacion.setText("Ubicación detallada:");
        getContentPane().add(lblUbicacion);
        lblUbicacion.setBounds(20, 300, 167, 27);

        txtNombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtNombre.setToolTipText("");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(110, 110, 236, 27);

        txtPais.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtPais.setToolTipText("");
        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });
        getContentPane().add(txtPais);
        txtPais.setBounds(470, 110, 236, 26);

        txtTelefono.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtTelefono.setToolTipText("");
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(110, 220, 236, 26);

        txtHorario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtHorario.setToolTipText("");
        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtHorario);
        txtHorario.setBounds(470, 220, 236, 26);

        txtUbicacion.setColumns(20);
        txtUbicacion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtUbicacion.setRows(5);
        jScrollPane1.setViewportView(txtUbicacion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 310, 466, 110);

        btnAceptar.setText("Aceptar");
        btnAceptar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnAceptarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(320, 460, 99, 58);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pantalla Principal background.jpg"))); // NOI18N
        lblBackground.setText("jLabel1");
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, -10, 830, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void btnAceptarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnAceptarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarAncestorAdded

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        JPanel panel = new JPanel();
        if (txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(panel, "Por favor, indique el nombre de la librería.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Libreria nuevaLibreria = new Libreria(txtNombre.getText(),txtPais.getText(),txtTelefono.getText(),txtHorario.getText());
            ListaLibrerias listaLibs = ListaLibrerias.getInstance();
            boolean insertar = listaLibs.insert(nuevaLibreria);
            if(insertar){
                JOptionPane.showMessageDialog(panel, "La libreria se insertó correctamente.", "Lista agregada", JOptionPane.INFORMATION_MESSAGE);
                txtNombre.setText("");
                txtPais.setText("");
                txtHorario.setText("");
                txtTelefono.setText("");
                txtUbicacion.setText("");
            }
            else{
                JOptionPane.showMessageDialog(panel, "Ya existe una librería con este nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLibreria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDatosLibreria;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextArea txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
