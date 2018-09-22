package proyectolibrerias;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class DetalleLibros extends javax.swing.JFrame {

    /**
     * Creates new form DetalleLibro
     */
    public DetalleLibros() {
        initComponents();
        cbLenguaje.removeAllItems();
    }
    public DetalleLibros(Object pIssn,Object pNombre,Object pTema,String pcantidaddisponible,String pcantidadvendida,String pprecio, String pdescripcion){
        initComponents();
        TxtIssn.setText(pIssn.toString());
        txtTema.setText(pTema.toString());
        txtNombre.setText(pNombre.toString());
        txtCantDis.setText(pcantidaddisponible);
        txtcantVen.setText(pcantidadvendida);
        txtPrecio.setText(pprecio);
        txtDescripcion.setText(pdescripcion);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Traducido = new javax.swing.JTextArea();
        cbLenguaje = new javax.swing.JComboBox<>();
        TxtIssn = new javax.swing.JLabel();
        txtTema = new javax.swing.JLabel();
        txtCantDis = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtcantVen = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Descipcion = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        LbsFondo = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.jpg"))); // NOI18N

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Traducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 90, 30));

        Traducido.setColumns(20);
        Traducido.setRows(5);
        jScrollPane2.setViewportView(Traducido);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 710, 100));

        cbLenguaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "en", "fr", "pt", "de", "zh", "it" }));
        cbLenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLenguajeActionPerformed(evt);
            }
        });
        getContentPane().add(cbLenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 100, 30));
        getContentPane().add(TxtIssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 152, 14));
        getContentPane().add(txtTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 71, 152, 20));
        getContentPane().add(txtCantDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 132, 118, 15));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 22, 72, 14));
        getContentPane().add(txtcantVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 169, 14));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 215, 18));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel1.setText("Issn: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel2.setText("Tema: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        Descipcion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        Descipcion.setText("Nombre: ");
        getContentPane().add(Descipcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jButton2.setText("Mostrar idiomas disponibles");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 170, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel3.setText("Cantidad Vendida: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel4.setText("Cantidad Vendida: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel5.setText("Precio: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel6.setText("Descripcion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel7.setText("Traducción:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 710, -1));

        LbsFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.jpg"))); // NOI18N
        LbsFondo.setText("jLabel1");
        LbsFondo.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(LbsFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbLenguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLenguajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLenguajeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Translate translate = TranslateOptions.newBuilder().setApiKey("AIzaSyB_gzIVU6MICiakzx6Sv1-FrZZahlgelIk").build().getService();

    // Texto para traducir
    String text = txtDescripcion.getText();

    // Translates some text into Russian
    Translation translation =
        translate.translate(
            text,
            TranslateOption.sourceLanguage("es"),
            TranslateOption.targetLanguage(cbLenguaje.getSelectedItem().toString()));
    Traducido.setText(translation.getTranslatedText());
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*Idiomas abrir = new Idiomas();
        abrir.setVisible(true);
        */
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DetalleLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descipcion;
    private javax.swing.JLabel LbsFondo;
    private javax.swing.JTextArea Traducido;
    private javax.swing.JLabel TxtIssn;
    private javax.swing.JComboBox<String> cbLenguaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel txtCantDis;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtTema;
    private javax.swing.JLabel txtcantVen;
    // End of variables declaration//GEN-END:variables
}
