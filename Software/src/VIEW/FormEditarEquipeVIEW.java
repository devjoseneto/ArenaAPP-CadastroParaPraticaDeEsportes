/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

/**
 *
 * @author netoi
 */
public class FormEditarEquipeVIEW extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public FormEditarEquipeVIEW() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTopo = new javax.swing.JPanel();
        btnEditarEquipePerfil = new javax.swing.JButton();
        btnEditarPesquisar = new javax.swing.JButton();
        btnEditarEquipeEquipe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEditarPerfil4 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        btnEditarPerfil1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btnEditarPerfil5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        checkMasc1 = new javax.swing.JCheckBox();
        checkMasc2 = new javax.swing.JCheckBox();
        checkMasc3 = new javax.swing.JCheckBox();
        checkMasc4 = new javax.swing.JCheckBox();
        checkMasc5 = new javax.swing.JCheckBox();
        checkMasc6 = new javax.swing.JCheckBox();
        checkMasc = new javax.swing.JCheckBox();
        lblCidade2 = new javax.swing.JLabel();
        cbEsporte = new javax.swing.JComboBox<>();
        lblCidade1 = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        txtIdAdm = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEditarPerfil3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        btnEditarPerfil2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnAddFoto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTopo.setLayout(null);

        btnEditarEquipePerfil.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEditarEquipePerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarEquipePerfil.setText("Perfil");
        btnEditarEquipePerfil.setBorderPainted(false);
        btnEditarEquipePerfil.setContentAreaFilled(false);
        btnEditarEquipePerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarEquipePerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEquipePerfilActionPerformed(evt);
            }
        });
        menuTopo.add(btnEditarEquipePerfil);
        btnEditarEquipePerfil.setBounds(832, 10, 90, 30);

        btnEditarPesquisar.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEditarPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPesquisar.setText("Pesquisar");
        btnEditarPesquisar.setBorderPainted(false);
        btnEditarPesquisar.setContentAreaFilled(false);
        btnEditarPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPesquisarActionPerformed(evt);
            }
        });
        menuTopo.add(btnEditarPesquisar);
        btnEditarPesquisar.setBounds(540, 10, 130, 30);

        btnEditarEquipeEquipe.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEditarEquipeEquipe.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarEquipeEquipe.setText("Equipe");
        btnEditarEquipeEquipe.setBorderPainted(false);
        btnEditarEquipeEquipe.setContentAreaFilled(false);
        btnEditarEquipeEquipe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarEquipeEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEquipeEquipeActionPerformed(evt);
            }
        });
        menuTopo.add(btnEditarEquipeEquipe);
        btnEditarEquipeEquipe.setBounds(680, 10, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-menu-topo.png"))); // NOI18N
        menuTopo.add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 50);

        getContentPane().add(menuTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        btnEditarPerfil4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnEditarPerfil4.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil4.setText("Salvar");
        btnEditarPerfil4.setBorderPainted(false);
        btnEditarPerfil4.setContentAreaFilled(false);
        btnEditarPerfil4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfil4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfil4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarPerfil4);
        btnEditarPerfil4.setBounds(50, 210, 120, 20);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao120x30.png"))); // NOI18N
        jPanel3.add(jLabel24);
        jLabel24.setBounds(50, 200, 120, 40);

        btnEditarPerfil1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnEditarPerfil1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil1.setText("Add Whatsapp");
        btnEditarPerfil1.setBorderPainted(false);
        btnEditarPerfil1.setContentAreaFilled(false);
        btnEditarPerfil1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfil1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarPerfil1);
        btnEditarPerfil1.setBounds(310, 210, 120, 20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao120x30.png"))); // NOI18N
        jPanel3.add(jLabel21);
        jLabel21.setBounds(310, 200, 120, 40);

        btnEditarPerfil5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnEditarPerfil5.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil5.setText("Add Instagram");
        btnEditarPerfil5.setBorderPainted(false);
        btnEditarPerfil5.setContentAreaFilled(false);
        btnEditarPerfil5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfil5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfil5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarPerfil5);
        btnEditarPerfil5.setBounds(180, 210, 120, 20);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao120x30.png"))); // NOI18N
        jPanel3.add(jLabel25);
        jLabel25.setBounds(180, 200, 120, 40);

        checkMasc1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkMasc1.setForeground(new java.awt.Color(116, 116, 116));
        checkMasc1.setText("Seg");
        checkMasc1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkMasc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMasc1ActionPerformed(evt);
            }
        });
        jPanel3.add(checkMasc1);
        checkMasc1.setBounds(80, 90, 50, 20);

        checkMasc2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkMasc2.setForeground(new java.awt.Color(116, 116, 116));
        checkMasc2.setText("Ter");
        checkMasc2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkMasc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMasc2ActionPerformed(evt);
            }
        });
        jPanel3.add(checkMasc2);
        checkMasc2.setBounds(130, 90, 50, 20);

        checkMasc3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkMasc3.setForeground(new java.awt.Color(116, 116, 116));
        checkMasc3.setText("Qua");
        checkMasc3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkMasc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMasc3ActionPerformed(evt);
            }
        });
        jPanel3.add(checkMasc3);
        checkMasc3.setBounds(180, 90, 50, 20);

        checkMasc4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkMasc4.setForeground(new java.awt.Color(116, 116, 116));
        checkMasc4.setText("Qui");
        checkMasc4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkMasc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMasc4ActionPerformed(evt);
            }
        });
        jPanel3.add(checkMasc4);
        checkMasc4.setBounds(20, 110, 60, 20);

        checkMasc5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkMasc5.setForeground(new java.awt.Color(116, 116, 116));
        checkMasc5.setText("Sex");
        checkMasc5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkMasc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMasc5ActionPerformed(evt);
            }
        });
        jPanel3.add(checkMasc5);
        checkMasc5.setBounds(80, 110, 50, 20);

        checkMasc6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkMasc6.setForeground(new java.awt.Color(116, 116, 116));
        checkMasc6.setText("Sab");
        checkMasc6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkMasc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMasc6ActionPerformed(evt);
            }
        });
        jPanel3.add(checkMasc6);
        checkMasc6.setBounds(130, 110, 70, 20);

        checkMasc.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkMasc.setForeground(new java.awt.Color(116, 116, 116));
        checkMasc.setText("Dom");
        checkMasc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMascActionPerformed(evt);
            }
        });
        jPanel3.add(checkMasc);
        checkMasc.setBounds(20, 90, 60, 20);

        lblCidade2.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblCidade2.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade2.setText("Esporte");
        jPanel3.add(lblCidade2);
        lblCidade2.setBounds(260, 70, 50, 20);

        cbEsporte.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        cbEsporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futebol", "Futsal", "FutVolei", "Volei", "Basquete" }));
        cbEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEsporteActionPerformed(evt);
            }
        });
        jPanel3.add(cbEsporte);
        cbEsporte.setBounds(260, 90, 150, 30);

        lblCidade1.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblCidade1.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade1.setText("Cidade");
        jPanel3.add(lblCidade1);
        lblCidade1.setBounds(260, 10, 50, 20);

        cbCidade.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guanambi-BA", "Caetité-BA", "Igaporã-BA" }));
        cbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidadeActionPerformed(evt);
            }
        });
        jPanel3.add(cbCidade);
        cbCidade.setBounds(260, 30, 150, 30);

        lblNome.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblNome.setForeground(new java.awt.Color(116, 116, 116));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNome.setText("ID Aministrador");
        jPanel3.add(lblNome);
        lblNome.setBounds(20, 10, 100, 20);

        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });
        jPanel3.add(txtLocal);
        txtLocal.setBounds(20, 160, 390, 30);

        txtIdAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAdmActionPerformed(evt);
            }
        });
        jPanel3.add(txtIdAdm);
        txtIdAdm.setBounds(20, 30, 220, 30);

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(116, 116, 116));
        jLabel15.setText("Local");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(20, 140, 130, 16);

        lblIdade.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(116, 116, 116));
        jPanel3.add(lblIdade);
        lblIdade.setBounds(290, 80, 130, 20);

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(116, 116, 116));
        jLabel13.setText("Dias de pratica");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 70, 130, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-dados-user.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 0, 440, 250);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-dados-user.png"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 0, 440, 250);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 440, 250));

        jPanel2.setLayout(null);

        btnEditarPerfil3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnEditarPerfil3.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil3.setText("Adicionar Jogador");
        btnEditarPerfil3.setBorderPainted(false);
        btnEditarPerfil3.setContentAreaFilled(false);
        btnEditarPerfil3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfil3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditarPerfil3);
        btnEditarPerfil3.setBounds(220, 400, 160, 20);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoEditarPerfil.png"))); // NOI18N
        jPanel2.add(jLabel23);
        jLabel23.setBounds(220, 390, 160, 40);

        btnEditarPerfil2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnEditarPerfil2.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil2.setText("Remover Jogador");
        btnEditarPerfil2.setBorderPainted(false);
        btnEditarPerfil2.setContentAreaFilled(false);
        btnEditarPerfil2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfil2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditarPerfil2);
        btnEditarPerfil2.setBounds(40, 400, 160, 20);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoEditarPerfil.png"))); // NOI18N
        jPanel2.add(jLabel22);
        jLabel22.setBounds(40, 390, 160, 40);

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "POS", "NOME", "CIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 420, 380);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-user-time.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 420, 440);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 420, 440));

        jPanel1.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(180, 60, 250, 100);

        btnAddFoto.setText("Adicionar Escudo");
        btnAddFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddFoto);
        btnAddFoto.setBounds(180, 10, 250, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudo-placeholder150x150.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 154, 154);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(116, 116, 116));
        jLabel5.setText("Sobre");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(174, 37, 248, 16);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-usuario.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 440, 170);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 440, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-padrao.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPerfil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfil2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPerfil2ActionPerformed

    private void btnEditarPerfil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfil3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPerfil3ActionPerformed

    private void btnAddFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFotoActionPerformed
        EscolherFotoVIEW j = new EscolherFotoVIEW();
        j.setVisible(true);
    }//GEN-LAST:event_btnAddFotoActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalActionPerformed

    private void cbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeActionPerformed
        
    }//GEN-LAST:event_cbCidadeActionPerformed

    private void cbEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEsporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEsporteActionPerformed

    private void checkMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMascActionPerformed

    private void checkMasc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMasc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMasc1ActionPerformed

    private void checkMasc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMasc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMasc2ActionPerformed

    private void checkMasc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMasc3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMasc3ActionPerformed

    private void checkMasc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMasc4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMasc4ActionPerformed

    private void checkMasc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMasc5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMasc5ActionPerformed

    private void checkMasc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMasc6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMasc6ActionPerformed

    private void txtIdAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAdmActionPerformed

    private void btnEditarPerfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPerfil1ActionPerformed

    private void btnEditarPerfil5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfil5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPerfil5ActionPerformed

    private void btnEditarPerfil4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfil4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPerfil4ActionPerformed

    private void btnEditarEquipePerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEquipePerfilActionPerformed
        TelaPerfilVIEW j = new TelaPerfilVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarEquipePerfilActionPerformed

    private void btnEditarPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPesquisarActionPerformed
        TelaPesquisaVIEW j = new TelaPesquisaVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarPesquisarActionPerformed

    private void btnEditarEquipeEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEquipeEquipeActionPerformed
        TelaEquipeVIEW j = new TelaEquipeVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarEquipeEquipeActionPerformed

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
            java.util.logging.Logger.getLogger(FormEditarEquipeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditarEquipeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditarEquipeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditarEquipeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditarEquipeVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFoto;
    private javax.swing.JButton btnEditarEquipeEquipe;
    private javax.swing.JButton btnEditarEquipePerfil;
    private javax.swing.JButton btnEditarPerfil1;
    private javax.swing.JButton btnEditarPerfil2;
    private javax.swing.JButton btnEditarPerfil3;
    private javax.swing.JButton btnEditarPerfil4;
    private javax.swing.JButton btnEditarPerfil5;
    private javax.swing.JButton btnEditarPesquisar;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbEsporte;
    private javax.swing.JCheckBox checkMasc;
    private javax.swing.JCheckBox checkMasc1;
    private javax.swing.JCheckBox checkMasc2;
    private javax.swing.JCheckBox checkMasc3;
    private javax.swing.JCheckBox checkMasc4;
    private javax.swing.JCheckBox checkMasc5;
    private javax.swing.JCheckBox checkMasc6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCidade1;
    private javax.swing.JLabel lblCidade2;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel menuTopo;
    private javax.swing.JTextField txtIdAdm;
    private javax.swing.JTextField txtLocal;
    // End of variables declaration//GEN-END:variables
}
