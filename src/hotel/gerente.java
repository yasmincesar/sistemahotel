
package hotel;

import DAOHotel.CadastroGerentes;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.CadastroGe;

public class gerente extends javax.swing.JFrame {
    CadastroGerentes cadastroGerentes = new CadastroGerentes();

    
    public gerente() {
        initComponents();
        
        Dimension tamTela = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamJan  =getSize();
        setLocation(new Point((tamTela.width - tamJan.width)/2, 
        (tamTela.height - tamJan.height)/2));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nomger = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_endger = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tf_telger = new javax.swing.JFormattedTextField();
        tf_idger = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setText("Gerente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 140, 40));

        jLabel2.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 70, 20));
        jPanel1.add(tf_nomger, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 110, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel3.setText("Endereço:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 70, -1));
        jPanel1.add(tf_endger, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 110, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel4.setText("Senha:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 40, 20));

        jLabel5.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel5.setText("Telefone:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 80, -1));

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 80, -1));

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 70, -1));

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton3.setText("Concluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 70, -1));

        try {
            tf_telger.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(tf_telger, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 110, -1));
        jPanel1.add(tf_idger, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 120, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\minlo\\Documents\\gold.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 515, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\minlo\\Documents\\gold.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 515, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         tf_nomger.setText("");
         tf_endger.setText("");
         tf_idger.setText("");
         tf_telger.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cance = JOptionPane.showConfirmDialog(null, "Você deseja cancelar?");
    int cance1 = Integer.bitCount (cance);
    
    if(cance1==0){
        new menu().setVisible(true);
        this.dispose();
    }
    if(cance1==1){
        
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         CadastroGe c = new CadastroGe();
      c.setNomeg(tf_nomger.getText());
      c.setEndereco(tf_endger.getText());
      c.setID(tf_idger.getText());
      c.setTelefone(tf_telger.getText());
      
      if(tf_nomger.getText().equals("")|| tf_endger.getText().equals("")|| tf_idger.getText().equals("")|| tf_telger.getText().equals("")) {
              JOptionPane.showMessageDialog(null, "Você deixou campos em branco");
      }
      else {
          CadastroGerentes DAOHotel = new CadastroGerentes ();
          DAOHotel.adiciona (c);
          JOptionPane.showMessageDialog(null, "Gerente" + tf_nomger.getText()+ "cadastrado com sucesso");
          
          cadastroGerentes.addRow(c);
      }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_endger;
    private javax.swing.JPasswordField tf_idger;
    private javax.swing.JTextField tf_nomger;
    private javax.swing.JFormattedTextField tf_telger;
    // End of variables declaration//GEN-END:variables
}
