/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package a3;


import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author juhol
 */
public class TelaFrete extends javax.swing.JFrame {

    private Frete fretetela;
   
    public TelaFrete() {
        initComponents();
        fretetela = new Frete();
    }

    public String getMaterial(){
    return fretetela.getMaterial();
    }
    
   public void setMaterial(String material){
   fretetela.setMaterial(material);
   }
   
   public String getFragilidade(){
   return fretetela.getFragilidade();
   }

   public void setFragilidade(String fragilidade){
   fretetela.setFragilidade(fragilidade);
   }
   
  public int getQuantidade(){
  return fretetela.getQuantidade();
  }
    
  public void setQuantidade(int quantidade){
  fretetela.setQuantidade(quantidade);
  }
  
  public float getPeso(){
  return fretetela.getPeso();
  }
  
  public void setPeso(float peso){
  fretetela.setPeso(peso);
  }
  
  public double getTamanho(){
  return fretetela.getTamanho();
  }
  
  public void setTamanho(double tamanho){
  fretetela.setTamanho(tamanho);
  }
  
  public double getOrcamento(){
  return fretetela.getOrcamento();
  }
  
  public void setOrcamento(double orcamento){
  fretetela.setOrcamento(orcamento);
  }
  
    public String getDataEstimada() {
    return fretetela.getDataEstimada();
      
    }

    public void setDataEstimada(String dataEstimada) {
    fretetela.setDataEstimada(dataEstimada);
    }
  
  public int getCodigo(){
  return fretetela.getCodigo();
  }
  
  public void setCodigo(int codigo){
  fretetela.setCodigo(codigo);
  }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel78 = new javax.swing.JLabel();
        B2 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        T1 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        B1 = new javax.swing.JButton();
        T4 = new javax.swing.JTextField();
        box1 = new javax.swing.JComboBox<>();
        jLabel80 = new javax.swing.JLabel();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        B3 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastre o frete");

        jScrollPane1.setBackground(new java.awt.Color(23, 23, 23));
        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportBorder(new javax.swing.border.MatteBorder(null));

        jPanel1.setBackground(new java.awt.Color(23, 23, 23));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3/Group.png"))); // NOI18N

        titulo.setBackground(new java.awt.Color(212, 212, 212));
        titulo.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(212, 212, 212));
        titulo.setText("Frete");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel78.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(212, 212, 212));
        jLabel78.setText("Orçamento:");

        B2.setBackground(new java.awt.Color(255, 86, 20));
        B2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B2.setForeground(new java.awt.Color(212, 212, 212));
        B2.setText("Cadastrar frete");
        B2.setBorderPainted(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2B2ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(212, 212, 212));
        jLabel79.setText("Data estimada de entrega:");
        jLabel79.setToolTipText("");

        jLabel81.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(212, 212, 212));
        jLabel81.setText("Código do frete");

        T2.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        T1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N

        T3.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        B1.setBackground(new java.awt.Color(23, 23, 23));
        B1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 86, 20));
        B1.setText("Consultar");
        B1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.setContentAreaFilled(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1B1ActionPerformed(evt);
            }
        });

        T4.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Média", "Alta" }));

        jLabel80.setText("jLabel15");

        T5.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        T6.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        T6.setText("___/____/_______");
        T6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                T6T6FocusGained(evt);
            }
        });

        T7.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jLabel73.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(212, 212, 212));
        jLabel73.setText("Material:");

        jLabel74.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(212, 212, 212));
        jLabel74.setText("Fragilidade:");

        jLabel75.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(212, 212, 212));
        jLabel75.setText("Quantidade");

        jLabel76.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(212, 212, 212));
        jLabel76.setText("Peso:");

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

        jLabel77.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(212, 212, 212));
        jLabel77.setText("Tamanho:");

        B4.setBackground(new java.awt.Color(23, 23, 23));
        B4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 86, 20));
        B4.setText("Alterar");
        B4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(0, 0, 0));
        B5.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
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
                        .addGap(18, 18, 18)
                        .addComponent(logo)
                        .addGap(89, 89, 89)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(B1)
                                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(B2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel78)
                                            .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel79)
                                            .addComponent(jLabel77)
                                            .addComponent(jLabel76)
                                            .addComponent(jLabel75)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel74)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel80))
                                            .addComponent(jLabel73)
                                            .addComponent(T2)
                                            .addComponent(T3)
                                            .addComponent(T4)
                                            .addComponent(T5)
                                            .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(titulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(B2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4)
                    .addComponent(B3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B2B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2B2ActionPerformed
       if (T1.getText().isEmpty() || T2.getText().isEmpty() || T3.getText().isEmpty() ||
        T4.getText().isEmpty() || T5.getText().isEmpty() || T6.getText().isEmpty() || 
        T7.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int codigo = Integer.parseInt(T1.getText());
        String material = T2.getText();
        String fragilidade = box1.getSelectedItem().toString();
        int quantidade = Integer.parseInt(T3.getText());
        float peso = Float.parseFloat(T4.getText());
        double tamanho = Double.parseDouble(T5.getText());
        double orcamento = Double.parseDouble(T7.getText()); // Corrigido para T7
        String dataEstimada = T6.getText(); // Corrigido para T6

        // Configurar os atributos do objeto Frete
        fretetela.setCodigo(codigo);
        fretetela.setMaterial(material);
        fretetela.setFragilidade(fragilidade);
        fretetela.setQuantidade(quantidade);
        fretetela.setPeso(peso);
        fretetela.setTamanho(tamanho);
        fretetela.setOrcamento(orcamento);
        fretetela.setDataEstimada(dataEstimada);

        // Simular cadastro e exibir mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Frete cadastrado com sucesso!\n" +
                "Código: " + codigo + "\nMaterial: " + material + "\nFragilidade: " + fragilidade +
                "\nQuantidade: " + quantidade + "\nPeso: " + peso + "\nTamanho: " + tamanho +
                "\nOrçamento: " + orcamento + "\nData Estimada: " + dataEstimada, "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos válidos nos campos de Código, Quantidade, Peso, Tamanho e Orçamento.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_B2B2ActionPerformed

    private void B1B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1B1ActionPerformed
        String codigo = T1.getText();
    String material = T2.getText();
    String fragilidade = (String) box1.getSelectedItem();
    String quantidade = T3.getText();
    String peso = T4.getText();
    String tamanho = T5.getText();
    String dataEstimada = T6.getText(); // Corrigido para T6
    String orcamento = T7.getText(); // Corrigido para T7

    // Simular consulta e exibir dados preenchidos nos campos
    JOptionPane.showMessageDialog(this, "Código do frete: " + codigo +
            "\nMaterial: " + material +
            "\nFragilidade: " + fragilidade +
            "\nQuantidade: " + quantidade +
            "\nPeso: " + peso +
            "\nTamanho: " + tamanho +
            "\nData estimada: " + dataEstimada +
            "\nOrçamento: " + orcamento, "Consulta", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_B1B1ActionPerformed

    private void T6T6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_T6T6FocusGained
        if(T6.getText().equals("___/____/_______")){
            T6.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_T6T6FocusGained

    private void B4B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4B4ActionPerformed
String material = T2.getText();
    String fragilidade = (String) box1.getSelectedItem();
    
    int quantidade = 0;
    try {
        quantidade = Integer.parseInt(T3.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Quantidade inválida.");
        return;
    }

    float peso = 0.0f;
    try {
        peso = Float.parseFloat(T4.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Peso inválido.");
        return;
    }

    double tamanho = 0.0;
    try {
        tamanho = Double.parseDouble(T5.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Tamanho inválido.");
        return;
    }

    double orcamento = 0.0;
    try {
        orcamento = Double.parseDouble(T7.getText()); // Corrigido para T7
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Orçamento inválido.");
        return;
    }

    String dataEstimada = T6.getText().trim();
        System.out.println("Data entrada: [" + dataEstimada + "]"); // Log para verificar a entrada da data

        int codigo = 0;
        try {
            codigo = Integer.parseInt(T1.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código inválido. Por favor, insira um número inteiro.");
            return;
        }

   
    
    setMaterial(material);
    setFragilidade(fragilidade);
    setQuantidade(quantidade);
    setPeso(peso);
    setTamanho(tamanho);
    setOrcamento(orcamento);
    setDataEstimada(dataEstimada);
    setCodigo(codigo);
JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso.");

        // TODO add your handling code here:
    }//GEN-LAST:event_B4B4ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
if (T1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, insira o código do frete a ser excluído.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int codigo = Integer.parseInt(T1.getText());

        // Limpar todos os campos
        T1.setText("");
        T2.setText("");
        box1.setSelectedItem(null);
        T3.setText("");
        T4.setText("");
        T5.setText("");
        T6.setText("");
        T7.setText("");

        // Exibe uma mensagem de confirmação
        JOptionPane.showMessageDialog(this, "Frete excluído com sucesso", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Código do frete inválido. Por favor, insira um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaFrete().setVisible(true);
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
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void JOptionPaneDialog(TelaFrete aThis, String frete_cadastrado_com_sucesso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

  
}
