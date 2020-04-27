package hotel;

import DAOHotel.CadastroFuncionario;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.CadFu;


public class func extends javax.swing.JFrame {
     CadastroFuncionario cadastroFuncionario = new CadastroFuncionario ();
    public func() {
        initComponents();
        Dimension tamTela = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamJan  =getSize();
        setLocation(new Point((tamTela.width - tamJan.width)/2, 
        (tamTela.height - tamJan.height)/2));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nomfu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tf_telfu = new javax.swing.JFormattedTextField();
        tf_cpffu = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setText("Funcionários");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 190, 40));

        jLabel2.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 80, 20));

        tf_nomfu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomfuActionPerformed(evt);
            }
        });
        jPanel1.add(tf_nomfu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 140, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel3.setText("Telefone:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 60, 20));

        jLabel4.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel4.setText("CPF:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 60, -1));

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 80, -1));

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton3.setText("Concluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 71, -1));

        try {
            tf_telfu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tf_telfu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telfuActionPerformed(evt);
            }
        });
        jPanel1.add(tf_telfu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 140, -1));

        try {
            tf_cpffu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(tf_cpffu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\minlo\\Documents\\gold.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 515, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\minlo\\Documents\\gold.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 515, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nomfuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomfuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomfuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tf_nomfu.setText("");
         tf_telfu.setText("");
         tf_cpffu.setText("");
        
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
           CadFu c = new CadFu();
      c.setNome(tf_nomfu.getText());
      c.setTelefone(tf_telfu.getText());
      c.setCPF(tf_cpffu.getText());
  
      
      if(tf_nomfu.getText().equals("")|| tf_telfu.getText().equals("")|| tf_cpffu.getText().equals("")) {
              JOptionPane.showMessageDialog(null, "Você deixou campos em branco");
      }
      else {
          CadastroFuncionario DAOHotel = new CadastroFuncionario ();
          DAOHotel.adiciona (c);
          JOptionPane.showMessageDialog(null, "Funcionário " + tf_nomfu.getText()+ "cadastrado com sucesso");
          
          cadastroFuncionario.addRow(c);
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_telfuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telfuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telfuActionPerformed

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
            java.util.logging.Logger.getLogger(func.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(func.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(func.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(func.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new func().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JFormattedTextField tf_cpffu;
    private javax.swing.JTextField tf_nomfu;
    private javax.swing.JFormattedTextField tf_telfu;
    // End of variables declaration//GEN-END:variables
}
