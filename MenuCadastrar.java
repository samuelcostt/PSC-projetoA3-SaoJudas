
package a3;


public class MenuCadastrar extends javax.swing.JFrame {

    
    public MenuCadastrar() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton4 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        B1 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JToggleButton();
        B3 = new javax.swing.JToggleButton();
        B4 = new javax.swing.JToggleButton();
        B5 = new javax.swing.JToggleButton();
        B6 = new javax.swing.JToggleButton();

        jToggleButton4.setText("jToggleButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastre");

        jPanel1.setBackground(new java.awt.Color(23, 23, 23));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(23, 23, 23));
        jPanel1.setToolTipText("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3/Group.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(212, 212, 212));
        jLabel2.setText("Menu de cadastro");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(212, 212, 212));
        jLabel3.setText("Qual o tipo de usuário que será cadastrado?");

        B1.setBackground(new java.awt.Color(255, 86, 20));
        B1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B1.setForeground(new java.awt.Color(212, 212, 212));
        B1.setText("Usuário administrador");
        B1.setBorderPainted(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(255, 86, 20));
        B2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B2.setForeground(new java.awt.Color(212, 212, 212));
        B2.setText("Cliente");
        B2.setBorderPainted(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(255, 86, 20));
        B3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B3.setForeground(new java.awt.Color(212, 212, 212));
        B3.setText("Veículo");
        B3.setBorderPainted(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(255, 86, 20));
        B4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B4.setForeground(new java.awt.Color(212, 212, 212));
        B4.setText("Motorista");
        B4.setBorderPainted(false);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(255, 86, 20));
        B5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B5.setForeground(new java.awt.Color(212, 212, 212));
        B5.setText("Frete");
        B5.setBorderPainted(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(0, 0, 0));
        B6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 86, 20));
        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3/butoon.png"))); // NOI18N
        B6.setBorderPainted(false);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B3)
                .addGap(12, 12, 12)
                .addComponent(B4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
TelaFrete fretetela = new TelaFrete();
this.setVisible(false);
fretetela.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
Cadastro cliente = new Cadastro();
this.setVisible(false);
cliente.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
    AdmTela admtela = new AdmTela();
    this.setVisible(false);
    admtela.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
Login telalogin = new Login();
this.setVisible(false);
telalogin.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
TelaMotorista motorista = new TelaMotorista();
this.setVisible(false);
motorista.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
VeiculoTela veiculo = new VeiculoTela();
this.setVisible(false);
veiculo.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(MenuCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton B2;
    private javax.swing.JToggleButton B3;
    private javax.swing.JToggleButton B4;
    private javax.swing.JToggleButton B5;
    private javax.swing.JToggleButton B6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
