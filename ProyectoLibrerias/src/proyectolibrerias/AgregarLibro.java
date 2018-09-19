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
public class AgregarLibro extends javax.swing.JFrame {

    /**
     * Creates new form AgregarLibro
     */
    public AgregarLibro() {
        initComponents();
        cbTema.removeAllItems();
        cbTema.addItem("FICCION");
        cbTema.addItem("INGENIERIA");
        cbTema.addItem("ADMINISTRACION");
        cbTema.addItem("CIENCIASNATURALES");
        cbTema.addItem("ARTES");
        cbTema.addItem("HISTORIA");
        cbTema.addItem("MATEMATICA");
        cbTema.addItem("LITERATURA");
        setLibraries();
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

        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        lblDatos = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCantDisponible = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCantDisponible1 = new javax.swing.JLabel();
        cbTema = new javax.swing.JComboBox<>();
        spCantidad = new javax.swing.JSpinner();
        spPrecio = new javax.swing.JSpinner();
        btnAceptar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblLibreria = new javax.swing.JLabel();
        cbLibreria = new javax.swing.JComboBox<>();
        lblAgregarLibroBackground = new javax.swing.JLabel();

        jTextField4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().setLayout(null);

        lblDatos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        lblDatos.setText("Datos del libro");
        getContentPane().add(lblDatos);
        lblDatos.setBounds(270, 20, 228, 48);

        lblNombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(41, 89, 75, 27);

        lblPrecio.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblPrecio.setText("Precio:");
        getContentPane().add(lblPrecio);
        lblPrecio.setBounds(40, 160, 56, 27);

        lblCantDisponible.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblCantDisponible.setText("Cantidad:");
        getContentPane().add(lblCantDisponible);
        lblCantDisponible.setBounds(390, 150, 79, 27);

        lblDescripcion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblDescripcion.setText("Descripción:");
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(40, 280, 102, 27);

        txtNombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(140, 90, 360, 29);

        lblCantDisponible1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblCantDisponible1.setText("Tema:");
        getContentPane().add(lblCantDisponible1);
        lblCantDisponible1.setBounds(40, 217, 51, 30);

        cbTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTemaActionPerformed(evt);
            }
        });
        getContentPane().add(cbTema);
        cbTema.setBounds(140, 220, 160, 27);
        getContentPane().add(spCantidad);
        spCantidad.setBounds(520, 150, 70, 22);

        spPrecio.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        getContentPane().add(spPrecio);
        spPrecio.setBounds(140, 160, 70, 24);

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
        btnAceptar.setBounds(340, 490, 99, 58);

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 310, 700, 160);

        lblLibreria.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        lblLibreria.setText("Libreria:");
        getContentPane().add(lblLibreria);
        lblLibreria.setBounds(390, 210, 80, 30);

        cbLibreria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLibreriaActionPerformed(evt);
            }
        });
        getContentPane().add(cbLibreria);
        cbLibreria.setBounds(510, 210, 160, 27);

        lblAgregarLibroBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.jpg"))); // NOI18N
        lblAgregarLibroBackground.setText("jLabel1");
        getContentPane().add(lblAgregarLibroBackground);
        lblAgregarLibroBackground.setBounds(0, 0, 840, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Funcion para agregar al JComboBox las opciones de las librerias disponibles
    private void setLibraries(){
        cbLibreria.removeAllItems();
        JPanel panel = new JPanel();
        ListaSimple listaLibs = ListaSimple.getLibrariesInstance();
        if (listaLibs.getSize() == 0){
            JOptionPane.showMessageDialog(panel, "Actualmente no hay librerías disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int indice = 0;
            while (indice < listaLibs.getSize()){
                Libreria temporal = (Libreria)listaLibs.goToPos(indice);
                cbLibreria.addItem(temporal.getNombre());
                indice++;
            }
        }
    }
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void cbTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTemaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        JPanel panel = new JPanel();
        if (txtNombre.getText().isEmpty()|spPrecio.getValue().equals(0)|txtDescripcion.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Por favor llene los espacios en blanco");
        }
        else{
            int precio = Integer.parseInt(spPrecio.getValue().toString());
            int cantidad = Integer.parseInt(spCantidad.getValue().toString());
            Libro nuevoLibro = new Libro(txtNombre.getText(),precio,cantidad,cbTema.getSelectedItem().toString());
            nuevoLibro.setDescripcion(txtDescripcion.getText());
            ListaSimple listaLibs =  ListaSimple.getLibrariesInstance();
            String nombreLib = cbLibreria.getSelectedItem().toString();
            System.out.println("Nombre libreria: " + nombreLib);
            int indice = 0;
            while (indice < listaLibs.getSize()){
                Libreria temporal = (Libreria)listaLibs.goToPos(indice);
                System.out.println("Nombre temporal: " + temporal.getNombre());
                if (temporal.getNombre().equals(nombreLib)){
                    temporal.getListaLibros().append(nuevoLibro);
                    break;
                }
                indice++;
            }
            txtNombre.setText("");
            spPrecio.setValue(0);
            spCantidad.setValue(0);
            txtDescripcion.setText("");
            cbTema.setSelectedIndex(0);
            cbLibreria.setSelectedIndex(0);
            JOptionPane.showMessageDialog(panel, "El libro ha sido agregado correctamente.", "Libro agregado", JOptionPane.INFORMATION_MESSAGE);
        }    
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnAceptarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarAncestorAdded

    private void cbLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLibreriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLibreriaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cbLibreria;
    private javax.swing.JComboBox<String> cbTema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblAgregarLibroBackground;
    private javax.swing.JLabel lblCantDisponible;
    private javax.swing.JLabel lblCantDisponible1;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblLibreria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JSpinner spPrecio;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
