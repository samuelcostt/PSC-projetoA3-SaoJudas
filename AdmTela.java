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


public class AdmTela extends javax.swing.JFrame {

    private Administrador admin;

    
    
   
    public AdmTela() {
        initComponents();
        admin = new Administrador();
    }

    public void setCPF(String CPF) {
        admin.setCPF(CPF);
    }

    public String getCPF() {
        return admin.getCPF();
    }

    public void setNome(String Nome) {
        admin.setNome(Nome);
    }

    public String getNome() {
        return admin.getNome();
    }

    public void setTelefone(String Telefone) {
        admin.setTelefone(Telefone);
    }

    public String getTelefone() {
        return admin.getTelefone();
    }

    public void setEmail(String Email) {
        admin.setEmail(Email);
    }

    public String getEmail() {
        return admin.getEmail();
    }

    public void setSenha(String Senha) {
        admin.setSenha(Senha);
    }

    public String getSenha() {
        return admin.getSenha();
    }
    
    

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        jColorChooser1 = new javax.swing.JColorChooser();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        T4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        B1 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        T5 = new javax.swing.JPasswordField();

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(212, 212, 212));
        jLabel5.setText("Nome:");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadatre o usuário administrador");

        jPanel1.setBackground(new java.awt.Color(23, 23, 23));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3/Group.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(212, 212, 212));
        jLabel2.setText("Cadastro - Administrador");

        jSeparator1.setBackground(new java.awt.Color(23, 23, 23));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(212, 212, 212));
        jLabel3.setText("CPF:");

        T1.setText("000.000.000-00");
        T1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                T1FocusGained(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(212, 212, 212));
        jLabel4.setText("Nome:");

        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });

        T3.setText("+55 (00) 00000 - 0000");
        T3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                T3FocusGained(evt);
            }
        });
        T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(212, 212, 212));
        jLabel6.setText("Telefone:");

        T4.setText("nome@gmail.com");
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

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(212, 212, 212));
        jLabel7.setText("E-mail:");

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(212, 212, 212));
        jLabel8.setText("Senha:");

        B1.setBackground(new java.awt.Color(23, 23, 23));
        B1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 86, 20));
        B1.setText("Consultar");
        B1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
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
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(B2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(T1)
                            .addComponent(T2)
                            .addComponent(T3, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(B2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4)
                    .addComponent(B3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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

    private void T1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_T1FocusGained
      if (T1.getText().equals("000.000.000-00")){
      T1.setText("");
      }
    }//GEN-LAST:event_T1FocusGained

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T3ActionPerformed

    private void T3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_T3FocusGained
        if (T3.getText().equals("+55 (00) 00000 - 0000")){
      T3.setText("");
      }
    }//GEN-LAST:event_T3FocusGained

    private void T4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_T4FocusGained
        if (T4.getText().equals("nome@gmail.com")){
      T4.setText("");
      }
    }//GEN-LAST:event_T4FocusGained

    private void T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T4ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
setCPF(T1.getText());
setNome(T2.getText());
setTelefone(T3.getText());
setEmail(T4.getText());
setSenha(T5.getText());

JOptionPane.showMessageDialog(this, "Dados do administrador alterados ");
        // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
String cpf = T1.getText();
    
    
    String nome = T2.getText();
    String telefone = T3.getText();
    String email = T4.getText();
    char[] senhaChars = T5.getPassword();
     String senha = new String(senhaChars);
    
   
    JOptionPane.showMessageDialog(this, "CPF: " + cpf +
            "\nNome: " + nome +
            "\nTelefone: " + telefone +
            "\nEmail: " + email +
            "\nSenha: " + senha, "Consulta", JOptionPane.INFORMATION_MESSAGE);

        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed

   String CPF = T1.getText();
    String nome = T2.getText();
    String telefone = T3.getText();
    String email = T4.getText();
    String senha = new String(T5.getPassword());

    // Simular cadastro e exibir mensagem de sucesso
    JOptionPane.showMessageDialog(this, "Administrador cadastrado com sucesso!\n" +
            "CPF: " + CPF + "\nNome: " + nome + "\nTelefone: " + telefone +
            "\nEmail: " + email + "\nSenha: " + senha, "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
String CPF = T1.getText();

T1.setText("");
T2.setText("");
T3.setText("");
T4.setText("");
T5.setText("");


JOptionPane.showMessageDialog(this, "Administrador excluído com sucesso", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdmTela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JPasswordField T5;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables

    private void JOptionPaneDialog(AdmTela aThis, String dados_do_administrador_alterados_com_suce) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}