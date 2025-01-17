/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controle;

import conexao.conexao;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class frmVestuario extends javax.swing.JDialog {
    
    conexao con_brecho;
    
    public frmVestuario() {
        
        con_brecho = new conexao();
        con_brecho.conecta();
        
        setModalityType(ModalityType.APPLICATION_MODAL);
        initComponents();
        ImageIcon icon = new ImageIcon("src/img/loopo.png");
        setIconImage(icon.getImage());
        setTitle("Gerenciamento do Vestuário");
        
        con_brecho.executaSQL("select * from vestuario order by id_vestuario");
        preencherTabela();
        posicionarRegistro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        entrar12 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        tpesquisar = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tidvest = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tidtipo = new javax.swing.JTextField();
        anterior = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tdescricao = new javax.swing.JTextArea();
        tpreco = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tcor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ttamanho = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        primeiro1 = new javax.swing.JButton();
        salvarVestuario = new javax.swing.JButton();
        alterarVestuario = new javax.swing.JButton();
        excluirVestuario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        novo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(760, 592));

        entrar12.setBackground(new java.awt.Color(81, 4, 4));
        entrar12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entrar12.setForeground(new java.awt.Color(255, 255, 255));
        entrar12.setText("Voltar");
        entrar12.setToolTipText("");
        entrar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar12ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(81, 4, 4));
        jLabel11.setText("Gerenciar Vestuário");

        tabela.setAutoCreateRowSorter(true);
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ID do Tipo", "Descrição", "Preço", "Cor", "Tamanho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabela);

        tpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpesquisarActionPerformed(evt);
            }
        });

        pesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pesquisar.setForeground(new java.awt.Color(255, 255, 255));
        pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-2906 (1).png"))); // NOI18N
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(81, 4, 4));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(81, 4, 4));
        jLabel12.setText("Descrição:");

        tidvest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidvestActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(81, 4, 4));
        jLabel13.setText("ID do Tipo:");

        tidtipo.setToolTipText("");
        tidtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidtipoActionPerformed(evt);
            }
        });

        anterior.setBackground(new java.awt.Color(81, 4, 4));
        anterior.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        anterior.setForeground(new java.awt.Color(255, 255, 255));
        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        proximo.setBackground(new java.awt.Color(81, 4, 4));
        proximo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        proximo.setForeground(new java.awt.Color(255, 255, 255));
        proximo.setText("Próximo");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        ultimo.setBackground(new java.awt.Color(81, 4, 4));
        ultimo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ultimo.setForeground(new java.awt.Color(255, 247, 238));
        ultimo.setText("Último");
        ultimo.setToolTipText("");
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(81, 4, 4));
        jLabel14.setText("ID:");

        tdescricao.setColumns(20);
        tdescricao.setRows(5);
        jScrollPane4.setViewportView(tdescricao);

        tpreco.setToolTipText("");
        tpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(81, 4, 4));
        jLabel15.setText("Preço:");

        tcor.setToolTipText("");
        tcor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcorActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(81, 4, 4));
        jLabel16.setText("Cor:");

        ttamanho.setToolTipText("");
        ttamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttamanhoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(81, 4, 4));
        jLabel17.setText("Tamanho:");

        primeiro1.setBackground(new java.awt.Color(81, 4, 4));
        primeiro1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        primeiro1.setForeground(new java.awt.Color(255, 255, 255));
        primeiro1.setText("Primeiro");
        primeiro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tidvest, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tidtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(134, 134, 134)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proximo)
                                .addGap(62, 62, 62)
                                .addComponent(ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(primeiro1)
                                .addGap(62, 62, 62)
                                .addComponent(anterior)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(tidtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(tidvest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anterior)
                            .addComponent(primeiro1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proximo)
                            .addComponent(ultimo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        salvarVestuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salvarVestuario.setForeground(new java.awt.Color(255, 255, 255));
        salvarVestuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save-file-5327 (1).png"))); // NOI18N
        salvarVestuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarVestuarioActionPerformed(evt);
            }
        });

        alterarVestuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alterarVestuario.setForeground(new java.awt.Color(255, 255, 255));
        alterarVestuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/notes-and-pencil-black-outline-22356.png"))); // NOI18N
        alterarVestuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarVestuarioActionPerformed(evt);
            }
        });

        excluirVestuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        excluirVestuario.setForeground(new java.awt.Color(255, 255, 255));
        excluirVestuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-10402 (1).png"))); // NOI18N
        excluirVestuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirVestuarioActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Pesquisar pela Descrição");

        novo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        novo1.setForeground(new java.awt.Color(255, 255, 255));
        novo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-soma-32.png"))); // NOI18N
        novo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(460, 460, 460)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(tpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pesquisar))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salvarVestuario)
                        .addGap(18, 18, 18)
                        .addComponent(alterarVestuario)
                        .addGap(18, 18, 18)
                        .addComponent(excluirVestuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entrar12)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pesquisar)
                    .addComponent(tpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(entrar12)
                    .addComponent(alterarVestuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluirVestuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvarVestuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar12ActionPerformed
       this.dispose();
    }//GEN-LAST:event_entrar12ActionPerformed

    private void tpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpesquisarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
                                      try
                                        {
                                            String pesquisa = "select * from vestuario where descricao like '" + tpesquisar.getText() + "%'";
                                            con_brecho.executaSQL(pesquisa);
                                        
                                            if(con_brecho.resultset.first())
                                            {
                                                preencherTabela();
                                            }
                                            else
                                            {
                                                JOptionPane.showMessageDialog(null, "\n Não existe dados com este parâmetro!!", "Mensagm do Programa", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        }
                                        catch(SQLException errosql)
                                        {
                                            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!!: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                                        }  
    }//GEN-LAST:event_pesquisarActionPerformed

    private void salvarVestuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarVestuarioActionPerformed
                                        String tipo = tidtipo.getText();
                                        String descricao = tdescricao.getText();
                                        String preco = tpreco.getText();
                                        String cor = tcor.getText();
                                        String tamanho = ttamanho.getText();
   
                                        try
                                        {
                                            String insert_sql = "insert into vestuario (id_tipo, descricao, preco, cor, tamanho) values ('" + tipo + "','" + descricao + "', '" + preco + "', '" + cor + "', '" +  tamanho + "')";
                                            con_brecho.statement.executeUpdate(insert_sql);
                                            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                                            
                                            con_brecho.executaSQL("select * from vestuario order by id_vestuario");
                                            preencherTabela();
                                        }
                                        catch(SQLException errosql)
                                        {
                                            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                                        }
    }//GEN-LAST:event_salvarVestuarioActionPerformed

    private void alterarVestuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarVestuarioActionPerformed
                String tipo = tidtipo.getText();
                String descricao = tdescricao.getText();
                String preco = tpreco.getText();
                String cor = tcor.getText();
                String tamanho = ttamanho.getText();
                String sql;
                
                String msg="";
                try {
                    if(tidvest.getText().equals("")){
                        sql="insert into vestuario (id_tipo, descricao, preco, cor, tamanho) values ('"+tipo+"','"+descricao+"','"+preco+"','"+cor+"','"+tamanho+"')";
                        msg="Gravação de um novo registro";
                    } else {
                        sql = "update vestuario set id_tipo='" + tipo + "', descricao='" + descricao + "', preco='" + preco + "', cor='" + cor + "', tamanho='" + tamanho + "' where id_vestuario=" + tidvest.getText();
                        msg="Alteração de registro";
                    }
                    con_brecho.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso.","Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
 
                    con_brecho.executaSQL("select * from vestuario order by id_vestuario");
                    preencherTabela(); 
                }
                catch(SQLException errosql) {
                    JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                }
    }//GEN-LAST:event_alterarVestuarioActionPerformed

    private void excluirVestuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirVestuarioActionPerformed
                                         String sql;

                                        try
                                        {
                                            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION, 3);
                                            
                                            if(resposta == 0)
                                            {
                                                sql = "delete from vestuario where id_vestuario = " + tidvest.getText();
                                                
                                                int excluir = con_brecho.statement.executeUpdate(sql);
                                                if (excluir == 1)
                                                {
                                                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                                                    con_brecho.executaSQL("select * from vestuario order by id_vestuario");
                                                    con_brecho.resultset.first();
                                                    preencherTabela();
                                                    posicionarRegistro();
                                                }
                                                else 
                                                {
                                                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                                                }
                                            }
                                        }
                                        catch(SQLException excecao)
                                        {
                                            JOptionPane.showMessageDialog(null, "Erro na exclusão: " + excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                                        }
    }//GEN-LAST:event_excluirVestuarioActionPerformed

    private void novo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo1ActionPerformed
    
    tpreco.setText("");
    tcor.setText("");
    ttamanho.setText("");
    tdescricao.setText("");
    tdescricao.requestFocus(); 
    }//GEN-LAST:event_novo1ActionPerformed

    private void primeiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiro1ActionPerformed
        try
        {
            con_brecho.resultset.first();
            mostrar_Dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro.");
        }
    }//GEN-LAST:event_primeiro1ActionPerformed

    private void ttamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttamanhoActionPerformed

    private void tcorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcorActionPerformed

    private void tprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecoActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
        try
        {
            con_brecho.resultset.last();
            mostrar_Dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o último registro.");
        }
    }//GEN-LAST:event_ultimoActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        try
        {
            con_brecho.resultset.next();
            mostrar_Dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o próximo registro.");
        }
    }//GEN-LAST:event_proximoActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        try
        {
            con_brecho.resultset.previous();
            mostrar_Dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro.");
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void tidtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidtipoActionPerformed

    private void tidvestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidvestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidvestActionPerformed
 
 public void preencherTabela()
    {
       tabela.getColumnModel().getColumn(0).setPreferredWidth(8);
       tabela.getColumnModel().getColumn(1).setPreferredWidth(8);
       tabela.getColumnModel().getColumn(2).setPreferredWidth(185);
       tabela.getColumnModel().getColumn(3).setPreferredWidth(14);
       tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
       tabela.getColumnModel().getColumn(5).setPreferredWidth(50);
       
       DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
       modelo.setNumRows(0);
       
       try
       {
           con_brecho.resultset.beforeFirst();
           while(con_brecho.resultset.next())
           {
               modelo.addRow(new Object[]
               {
                  con_brecho.resultset.getString("id_vestuario"),con_brecho.resultset.getString("id_tipo"),con_brecho.resultset.getString("descricao"),con_brecho.resultset.getString("preco"),con_brecho.resultset.getString("cor"),con_brecho.resultset.getString("tamanho")
               });
           }
       }
       catch(SQLException erro)
       {
           JOptionPane.showMessageDialog(null, "\nErro ao listar dados da tabela!! :\n" + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
       }
    }

    public void mostrar_Dados()
    {
        try
        {
            tidvest.setText(con_brecho.resultset.getString("id_vestuario"));
            tidtipo.setText(con_brecho.resultset.getString("id_tipo"));
            tdescricao.setText(con_brecho.resultset.getString("descricao"));
            tpreco.setText(con_brecho.resultset.getString("preco"));
            tcor.setText(con_brecho.resultset.getString("cor"));
            ttamanho.setText(con_brecho.resultset.getString("tamanho"));

        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não localizou dados: " + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistro()
    {
        try
        {
            con_brecho.resultset.first(); //posiciona o primeiro registro da tabela
            mostrar_Dados(); //chama o método que irá buscar o dado da tabela
        } 
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possivel posicionar no primeiro registro: " + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarVestuario;
    private javax.swing.JButton anterior;
    private javax.swing.JButton entrar12;
    private javax.swing.JButton excluirVestuario;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton novo1;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton primeiro1;
    private javax.swing.JButton proximo;
    private javax.swing.JButton salvarVestuario;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tcor;
    private javax.swing.JTextArea tdescricao;
    private javax.swing.JTextField tidtipo;
    private javax.swing.JTextField tidvest;
    private javax.swing.JTextField tpesquisar;
    private javax.swing.JTextField tpreco;
    private javax.swing.JTextField ttamanho;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
