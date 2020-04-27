
package hotel;

import DAOHotel.Contad;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.Conta;


public class conta extends javax.swing.JFrame {
     Contad contad = new Contad ();
    
    public conta() {
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
        tf_servico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_preco = new javax.swing.JTextField();
        tf_cod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setText("Conta Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 94, 190, 40));

        tf_servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_servicoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 140, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel2.setText("Serviço");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 144, 80, 20));

        jLabel3.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel3.setText("Preço");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 204, 60, 20));

        jLabel4.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel4.setText("Código");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 60, -1));

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 334, 80, -1));

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 334, -1, -1));

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton3.setText("Concluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 334, 71, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\minlo\\Documents\\gold.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 515, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\minlo\\Documents\\gold.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 515, 30));
        jPanel1.add(tf_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 140, -1));
        jPanel1.add(tf_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 140, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\minlo\\Documents\\gold.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 515, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_servicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_servicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_servicoActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tf_servico.setText("");
        tf_preco.setText("");
        tf_cod.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Conta c = new Conta();
        c.setServ(tf_servico.getText());
        c.setPreco(tf_preco.getText());
        c.setCod(tf_cod.getText());

        if(tf_servico.getText().equals("")|| tf_preco.getText().equals("")|| tf_cod.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você deixou campos em branco");
        }
        else {
            Contad DAOHotel = new Contad ();
            DAOHotel.adiciona (c);
            JOptionPane.showMessageDialog(null, "Serviço " + tf_servico.getText()+ " cadastrado com sucesso");

            contad.addRow(c);
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
            java.util.logging.Logger.getLogger(conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conta().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_cod;
    private javax.swing.JTextField tf_preco;
    private javax.swing.JTextField tf_servico;
    // End of variables declaration//GEN-END:variables
}
