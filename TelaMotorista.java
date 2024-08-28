
package a3;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class TelaMotorista extends javax.swing.JFrame {

    private motorista motoristatela;
    
   
    public TelaMotorista() {
        initComponents();
        motoristatela = new motorista();
    }
    
public int getCodigo() {
        return motoristatela.getCodigo();
    }

    public void setCodigo(int codigo) {
        motoristatela.setCodigo(codigo);
    }
   

    public String getNome() {
        return motoristatela.getNome();
    }


    public void setNome(String nome) {
        motoristatela.setNome(nome);
    }


    public String getEmail() {
        return motoristatela.getEmail();
    }


    public void setEmail(String email) {
        motoristatela.setEmail(email);
    }


    public String getTelefone() {
        return motoristatela.getTelefone();
    }


    public void setTelefone(String telefone) {
        motoristatela.setTelefone(telefone);
    }


    public String getCPF() {
        return motoristatela.getCPF();
    }


    public void setCPF(String CPF) {
        motoristatela.setCPF(CPF);
    }


    public String getCNH() {
        return motoristatela.getCNH();
    }


    public void setCNH(String CNH) {
       motoristatela.setCNH(CNH);
    }
    
    public String getSenha(){
    return motoristatela.getSenha();
    }
    
    public void setSenha(String senha){
    motoristatela.setSenha(senha);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cpf = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        B1 = new javax.swing.JButton();
        nome = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        telefone = new javax.swing.JLabel();
        T3 = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        T4 = new javax.swing.JTextField();
        classe = new javax.swing.JLabel();
        cnh = new javax.swing.JComboBox<>();
        senha = new javax.swing.JLabel();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        T6 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastre o motorista");

        jPanel1.setBackground(new java.awt.Color(23, 23, 23));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3/Group.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(212, 212, 212));
        titulo.setText("Cadastro - Motorista");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        cpf.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        cpf.setForeground(new java.awt.Color(212, 212, 212));
        cpf.setText("CPF:");

        T1.setText("000.000.000-00");
        T1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                T1FocusGained(evt);
            }
        });

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

        nome.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(212, 212, 212));
        nome.setText("Nome:");

        telefone.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        telefone.setForeground(new java.awt.Color(212, 212, 212));
        telefone.setText("Telefone:");
        telefone.setToolTipText("");

        T3.setText("+55 (00) 00000 - 0000");
        T3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                T3FocusGained(evt);
            }
        });

        email.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(212, 212, 212));
        email.setText("E-mail:");

        T4.setText("nome@gmail.com");
        T4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                T4FocusGained(evt);
            }
        });

        classe.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        classe.setForeground(new java.awt.Color(212, 212, 212));
        classe.setText("Classe da CNH:");

        cnh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo A", "Tipo B", "Tipo C", "Tipo E" }));
        cnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnhActionPerformed(evt);
            }
        });

        senha.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(212, 212, 212));
        senha.setText("Senha:");

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
        B5.setText("jButton1");
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(Logo)
                                .addGap(18, 18, 18)
                                .addComponent(titulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(senha)
                                    .addComponent(classe)
                                    .addComponent(email)
                                    .addComponent(telefone)
                                    .addComponent(B1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpf)
                                    .addComponent(T1)
                                    .addComponent(nome)
                                    .addComponent(T2)
                                    .addComponent(T3)
                                    .addComponent(T4)
                                    .addComponent(cnh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(B2))
                                    .addComponent(T6))))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(titulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(classe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B3)
                    .addComponent(B4))
                .addGap(18, 18, 18)
                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void T1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_T1FocusGained
    if(T1.getText().equals("000.000.000-00")){
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
if(T4.getText().equals("nome@gmail.com")){
T4.setText("");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_T4FocusGained

    private void cnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnhActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
       MenuCadastrar menu = new MenuCadastrar();
this.setVisible(false);
        menu.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
String cnpj = T1.getText();

        JOptionPane.showMessageDialog(this, "CPF: " + T1.getText() +
        "\nNome: " + T2.getText() +
        "\nTelefone: " + T3.getText()+
        "\nEmail: " + T4.getText() +
        "\nCNH: " + cnh.getSelectedItem() +
        "\nSenha: " + Arrays.toString(T6.getPassword()), "Consulta", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
setCPF(T1.getText());
    setNome(T2.getText());
    setTelefone(T3.getText());
    setEmail(T4.getText());
    setCNH((String) cnh.getSelectedItem());
    setSenha(new String(T6.getPassword()));

    JOptionPane.showMessageDialog(this, "Motorista cadastrado com sucesso!");
        // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
String CPF = T1.getText();

T1.setText("");
T2.setText("");
T3.setText("");
T4.setText("");
cnh.setSelectedItem("");
T6.setText("");

    JOptionPane.showMessageDialog(this, "Motorista excluído com sucesso", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
setCPF(T1.getText());
    setNome(T2.getText());
    setTelefone(T3.getText());
    setEmail(T4.getText());
    setCNH((String) cnh.getSelectedItem());
    setSenha(new String(T6.getPassword()));

    JOptionPane.showMessageDialog(this, "Dados do motorista alterados com sucesso");
        // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaMotorista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JPasswordField T6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel classe;
    private javax.swing.JComboBox<String> cnh;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel telefone;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
