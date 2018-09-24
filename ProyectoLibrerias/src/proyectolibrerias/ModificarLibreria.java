/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolibrerias;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melina
 */
public class ModificarLibreria extends javax.swing.JFrame {
    ListaSimple listaLibs = ListaSimple.getLibrariesInstance();
    JPanel panel = new JPanel();
    /**
     * Creates new form ModificarLibreria
     */
    public ModificarLibreria() {
        initComponents();
        setLibraries();
        setSize(810,492);
        setTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cbLibreria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibrerias = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        lblTitulo.setText("Librerias disponibles");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(240, 30, 317, 48);

        cbLibreria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLibreriaActionPerformed(evt);
            }
        });
        getContentPane().add(cbLibreria);
        cbLibreria.setBounds(310, 310, 160, 27);

        tblLibrerias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Libreria", "Issn", "Nombre", "Precio", "Tema", "Disponibles", "Vendidas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLibrerias);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 720, 150);

        btnModificar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("");
        btnModificar.setName("btnBuscar"); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(220, 370, 137, 56);

        btnEliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.setName("btnBuscar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(420, 370, 137, 56);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.jpg"))); // NOI18N
        lblBackground.setText("jLabel1");
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, -10, 860, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setLibraries(){
        cbLibreria.removeAllItems();
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
    private void setTable(){
        DefaultTableModel model = new DefaultTableModel();
        tblLibrerias.setModel(model);
        model.addColumn("Nombre");
        model.addColumn("Pais");
        model.addColumn("Horario");
        model.addColumn("Telefono");
        model.addColumn("Ubicacion");
        tblLibrerias.getColumnModel().getColumn(0).setPreferredWidth(110);
        tblLibrerias.getColumnModel().getColumn(2).setPreferredWidth(40);
        tblLibrerias.getColumnModel().getColumn(3).setPreferredWidth(30);
        Libreria libreria;
        for (int index = 0; index < listaLibs.getSize(); index++){
            libreria = (Libreria)listaLibs.goToPos(index);
            model.addRow(new Object[]{libreria.getNombre(),libreria.getPais(),libreria.getHorario(),libreria.getTelefono(),libreria.getUbicacion()});
            
            }
    }
    private void cbLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLibreriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLibreriaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        Libreria lib = (Libreria)listaLibs.buscarPersonalizado(cbLibreria.getSelectedItem().toString(),-1);
        new DatosLibreria(lib).setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        boolean validar = (boolean)listaLibs.eliminarPersonalizado(cbLibreria.getSelectedItem().toString(), -1);
        if (validar){
            JOptionPane.showMessageDialog(panel, "La libreria se ha eliminado correctamente.", "Libreria eliminado", JOptionPane.INFORMATION_MESSAGE);
            setTable();
        }
        else{
            JOptionPane.showMessageDialog(panel, "No se pudo eliminar la libreria.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarLibreria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbLibreria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblLibrerias;
    // End of variables declaration//GEN-END:variables
}