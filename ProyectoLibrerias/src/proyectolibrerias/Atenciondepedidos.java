/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolibrerias;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Atenciondepedidos extends javax.swing.JFrame {

    ColaPedidos cola = ColaPedidos.getColaInstance();
    ListaSimple usuarios = ListaSimple.getClientsInstance();
    
    public Atenciondepedidos() {
        initComponents();
        jTextArea1.setText(cola.toString());
        
        Cliente usuario = (Cliente)usuarios.goToPos(0);
        
        lbsnombre.setText(usuario.nombre);
        lbscedula.setText(usuario.cedula);
        lbscorreo.setText(usuario.correo);
        lbsdireccion.setText(usuario.direccion);
        lbstelefono.setText(usuario.telefono);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbstelefono = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbscedula = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbsdireccion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbsnombre = new javax.swing.JLabel();
        lbscorreo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel1.setText("Cliente: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        lbstelefono.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        getContentPane().add(lbstelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 710, 200));

        jButton1.setText("Enviar pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 140, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel3.setText("Cédula: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        lbscedula.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        getContentPane().add(lbscedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel5.setText("Teléfono: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        lbsdireccion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        getContentPane().add(lbsdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 310, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel7.setText("Dirección: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel8.setText("Correo: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        lbsnombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        getContentPane().add(lbsnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        lbscorreo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        getContentPane().add(lbscorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Cliente usuario = (Cliente)usuarios.goToPos(0);
          
          final String username = "libreriavirtualtec@gmail.com";    //correo creado para la libreria
		final String password = "tareaprogramada1";          
                final String to = usuario.correo;                   

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(to));
			message.setSubject("Pedidos Pendientes");             //sujeto del correo
			message.setText("Ya han sido enviados sus pedidos.\n Gracias por su compra.");  //mensaje del correo

			Transport.send(message);

			JOptionPane.showMessageDialog(this,"Se han enviado los pedidos pendientes");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Atenciondepedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atenciondepedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atenciondepedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atenciondepedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atenciondepedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbscedula;
    private javax.swing.JLabel lbscorreo;
    private javax.swing.JLabel lbsdireccion;
    private javax.swing.JLabel lbsnombre;
    private javax.swing.JLabel lbstelefono;
    // End of variables declaration//GEN-END:variables
}
