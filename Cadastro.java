/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package a3;

import javax.swing.JOptionPane;
/**
 *
 * @author juhol
 */
public class Cadastro extends javax.swing.JFrame {

    private cliente Cliente;
    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        Cliente = new cliente();
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        Cliente.setNomeEmpresa(nomeEmpresa);
    }

    public String getNomeEmpresa() {
        return Cliente.getNomeEmpresa();
    }

    public void setCNPJ(String CNPJ) {
        Cliente.setCNPJ(CNPJ);
    }

    public String getCNPJ() {
        return Cliente.getCNPJ();
    }

    public void setEmail(String email) {
        Cliente.setEmail(email);
    }

    public String getEmail() {
        return Cliente.getEmail();
    }

    public void setTelefone(String telefone) {
        Cliente.setTelefone(telefone);
    }

    public String getTelefone() {
        return Cliente.getTelefone();
    }

    public void setEndereco(String endereco) {
        Cliente.setEndereco(endereco);
    }

    public String getEndereco() {
        return Cliente.getEndereco();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        T1 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();

        jTextField2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(212, 212, 212));

        jTextField3.setText("jTextField3");

        jTextField5.setText("jTextField5");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastre-se");

        jPanel1.setBackground(new java.awt.Color(23, 23, 23));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setForeground(new java.awt.Color(212, 212, 212));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3/Group.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(212, 212, 212));
        jLabel2.setText("Cadastro - Cliente");

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(212, 212, 212));
        jLabel3.setText("Nome da empresa:");

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(212, 212, 212));
        jLabel4.setText("CNPJ:");

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(212, 212, 212));
        jLabel5.setText("Telefone: ");

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(212, 212, 212));
        jLabel6.setText("E-mail:");

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(212, 212, 212));
        jLabel7.setText("Endereço:");

        T2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        T2.setMaximumSize(new java.awt.Dimension(214, 214));

        T1.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        T1.setText("00.000.000/0000-00");
        T1.setMaximumSize(new java.awt.Dimension(214, 214));
        T1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                T1FocusGained(evt);
            }
        });
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });

        T3.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        T3.setText("+55 (00) 00000 - 0000");
        T3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                T3FocusGained(evt);
            }
        });

        T4.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        T4.setText("empresa@domínio.com.br");
        T4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                T4FocusGained(evt);
            }
        });
        T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T4ActionPerformed(evt);
            }
        });

        T5.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        T5.setText("R.________________________ N º___ CEP:______-_____");
        T5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                T5FocusGained(evt);
            }
        });

        B2.setBackground(new java.awt.Color(255, 86, 20));
        B2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B2.setForeground(new java.awt.Color(212, 212, 212));
        B2.setText("Cadastrar");
        B2.setBorderPainted(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(23, 23, 23));
        B1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 86, 20));
        B1.setText("Consultar");
        B1.setToolTipText("");
        B1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(23, 23, 23));
        B3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 86, 20));
        B3.setText("Excluir");
        B3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(23, 23, 23));
        B4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 86, 20));
        B4.setText("Alterar");
        B4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(0, 0, 0));
        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3/butoon.png"))); // NOI18N
        B5.setBorderPainted(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(115, 115, 115)
                                    .addComponent(B2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T3)
                                    .addComponent(T5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                    .addComponent(T4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B1)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(B2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B3)
                    .addComponent(B4))
                .addGap(18, 18, 18)
                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
  T1.setText("");
    T2.setText("");
    T3.setText("");
    T4.setText("");
    T5.setText("");

        JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso", "Exclusão", JOptionPane.INFORMATION_MESSAGE);      
        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
String CNPJ = T1.getText();

        JOptionPane.showMessageDialog(this, "CNPJ: " + T1.getText() +
            "\nNome Empresa: " + T2.getText() +
            "\nTelefone: " + T3.getText() +
            "\nEmail: " + T4.getText() +
            "\nEndereço: " + T5.getText(), "Consulta", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void T1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_T1FocusGained
if(T1.getText().equals("00.000.000/0000-00")){
T1.setText("");
}

        // TODO add your handling code here:
    }//GEN-LAST:event_T1FocusGained

    private void T3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_T3FocusGained
if(T3.getText().equals("+55 (00) 00000 - 0000")){
T3.setText("");
}

        // TODO add your handling code here:
    }//GEN-LAST:event_T3FocusGained

    private void T4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_T4FocusGained
if(T4.getText().equals("empresa@dominio.com.br")){
    T4.setText("");
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_T4FocusGained

    private void T5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_T5FocusGained
if(T5.getText().equals("R.________________________ N º___ CEP:______-_____")){
T5.setText("");

}

        // TODO add your handling code here:
    }//GEN-LAST:event_T5FocusGained

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
 String nomeEmpresa = T1.getText();
    String CNPJ = T2.getText();
    String telefone = T3.getText();
    String email = T4.getText();
    String endereco = T5.getText();
    
    setNomeEmpresa(nomeEmpresa);
    setCNPJ(CNPJ);
    setTelefone(telefone);
    setEmail(email);
    setEndereco(endereco);

    JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);      
        
// TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
 setNomeEmpresa(T1.getText());
        setCNPJ(T2.getText());
        setTelefone(T3.getText());
        setEmail(T4.getText());
        setEndereco(T5.getText());

        JOptionPane.showMessageDialog(this, "Dados do cliente alterados ");
        // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T4ActionPerformed
if(T4.getText().equals("empresa@dominio.com.br")){
T4.setText("");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_T4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
      MenuCadastrar menu = new MenuCadastrar();
this.setVisible(false);
        menu.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
