/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import REPOSITORY.BancoDeDados;
import SERVICES.UsuarioService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author netoi
 */
public class FormEditarPerfilVIEW extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public FormEditarPerfilVIEW() {
        initComponents();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        txtBiografia.setLineWrap(true);
        txtBiografia.setWrapStyleWord(true);
        
        txtNome.setText(BancoDeDados.usuarioLogado.getNome());
        txtEmail.setText(BancoDeDados.usuarioLogado.getEmail());
        txtDataDeNascimento.setText(formato.format(BancoDeDados.usuarioLogado.getNascimento()));
        cbCidade.setSelectedItem(BancoDeDados.usuarioLogado.getCidade());
        txtBiografia.setText(BancoDeDados.usuarioLogado.getSobre());
        String esportes[] = BancoDeDados.usuarioLogado.getEsporte();
        for (int i = 0; i < 5; i++) {
            System.out.println(esportes[i]);
        }
        if (esportes[0].equals("Futsal")) checkFutsal.setSelected(true);
        else checkFutsal.setSelected(false);
        if (esportes[1].equals("Futebol")) checkFutebol.setSelected(true);
        else checkFutebol.setSelected(false);
        if (esportes[2].equals("FutVolei")) checkFutVolei.setSelected(true);
        else checkFutVolei.setSelected(false);
        if (esportes[3].equals("Volei")) checkVolei.setSelected(true);
        else checkVolei.setSelected(false);
        if (esportes[4].equals("Basquete")) checkBasquete.setSelected(true);
        else checkBasquete.setSelected(false);
        char sexo = BancoDeDados.usuarioLogado.getSexo();
        if (sexo == 'M') checkMasc.setSelected(true);
        else if (sexo == 'F') checkFem.setSelected(true);
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
        btnEditarPerfilPerfil = new javax.swing.JButton();
        btnEditarPerfilPesquisar = new javax.swing.JButton();
        btnEditarPerfilEquipe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        checkMasc = new javax.swing.JCheckBox();
        checkFem = new javax.swing.JCheckBox();
        checkFutVolei = new javax.swing.JCheckBox();
        checkVolei = new javax.swing.JCheckBox();
        checkBasquete = new javax.swing.JCheckBox();
        checkFutsal = new javax.swing.JCheckBox();
        checkFutebol = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtDataDeNascimento = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBiografia = new javax.swing.JTextArea();
        btnaddFoto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTopo.setLayout(null);

        btnEditarPerfilPerfil.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEditarPerfilPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfilPerfil.setText("Perfil");
        btnEditarPerfilPerfil.setBorderPainted(false);
        btnEditarPerfilPerfil.setContentAreaFilled(false);
        btnEditarPerfilPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfilPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilPerfilActionPerformed(evt);
            }
        });
        menuTopo.add(btnEditarPerfilPerfil);
        btnEditarPerfilPerfil.setBounds(832, 10, 90, 30);

        btnEditarPerfilPesquisar.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEditarPerfilPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfilPesquisar.setText("Pesquisar");
        btnEditarPerfilPesquisar.setBorderPainted(false);
        btnEditarPerfilPesquisar.setContentAreaFilled(false);
        btnEditarPerfilPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfilPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilPesquisarActionPerformed(evt);
            }
        });
        menuTopo.add(btnEditarPerfilPesquisar);
        btnEditarPerfilPesquisar.setBounds(540, 10, 130, 30);

        btnEditarPerfilEquipe.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEditarPerfilEquipe.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfilEquipe.setText("Equipe");
        btnEditarPerfilEquipe.setBorderPainted(false);
        btnEditarPerfilEquipe.setContentAreaFilled(false);
        btnEditarPerfilEquipe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfilEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilEquipeActionPerformed(evt);
            }
        });
        menuTopo.add(btnEditarPerfilEquipe);
        btnEditarPerfilEquipe.setBounds(680, 10, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-menu-topo.png"))); // NOI18N
        menuTopo.add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 50);

        getContentPane().add(menuTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        btnSalvar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorderPainted(false);
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalvar);
        btnSalvar.setBounds(260, 210, 160, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoEditarPerfil.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(260, 200, 160, 40);

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(116, 116, 116));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Sexo");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 190, 26, 14);

        checkMasc.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkMasc.setForeground(new java.awt.Color(116, 116, 116));
        checkMasc.setText("Masc");
        checkMasc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMascActionPerformed(evt);
            }
        });
        jPanel3.add(checkMasc);
        checkMasc.setBounds(20, 210, 60, 19);

        checkFem.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkFem.setForeground(new java.awt.Color(116, 116, 116));
        checkFem.setText("Fem");
        checkFem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFemActionPerformed(evt);
            }
        });
        jPanel3.add(checkFem);
        checkFem.setBounds(80, 210, 47, 19);

        checkFutVolei.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkFutVolei.setForeground(new java.awt.Color(116, 116, 116));
        checkFutVolei.setText("Futevôlei");
        checkFutVolei.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkFutVolei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFutVoleiActionPerformed(evt);
            }
        });
        jPanel3.add(checkFutVolei);
        checkFutVolei.setBounds(160, 160, 80, 19);

        checkVolei.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkVolei.setForeground(new java.awt.Color(116, 116, 116));
        checkVolei.setText("Vôlei");
        checkVolei.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkVolei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVoleiActionPerformed(evt);
            }
        });
        jPanel3.add(checkVolei);
        checkVolei.setBounds(250, 160, 70, 19);

        checkBasquete.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkBasquete.setForeground(new java.awt.Color(116, 116, 116));
        checkBasquete.setText("Basquete");
        checkBasquete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkBasquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBasqueteActionPerformed(evt);
            }
        });
        jPanel3.add(checkBasquete);
        checkBasquete.setBounds(320, 160, 90, 19);

        checkFutsal.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkFutsal.setForeground(new java.awt.Color(116, 116, 116));
        checkFutsal.setText("Futsal");
        checkFutsal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkFutsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFutsalActionPerformed(evt);
            }
        });
        jPanel3.add(checkFutsal);
        checkFutsal.setBounds(20, 160, 70, 19);

        checkFutebol.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkFutebol.setForeground(new java.awt.Color(116, 116, 116));
        checkFutebol.setText("Futebol");
        checkFutebol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkFutebol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFutebolActionPerformed(evt);
            }
        });
        jPanel3.add(checkFutebol);
        checkFutebol.setBounds(80, 160, 70, 19);

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(116, 116, 116));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Esportes praticados");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(20, 140, 120, 14);

        lblCidade.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade.setText("Cidade");
        jPanel3.add(lblCidade);
        lblCidade.setBounds(260, 80, 50, 14);

        cbCidade.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guanambi-BA", "Caetité-BA", "Igaporã-BA" }));
        cbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidadeActionPerformed(evt);
            }
        });
        jPanel3.add(cbCidade);
        cbCidade.setBounds(260, 100, 140, 30);

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(116, 116, 116));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Data De Nascimento");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(260, 20, 120, 14);

        txtDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataDeNascimentoActionPerformed(evt);
            }
        });
        jPanel3.add(txtDataDeNascimento);
        txtDataDeNascimento.setBounds(260, 40, 130, 30);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail);
        txtEmail.setBounds(20, 100, 200, 30);

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(116, 116, 116));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Email");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 80, 32, 14);

        lblNome.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblNome.setForeground(new java.awt.Color(116, 116, 116));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNome.setText("Nome");
        jPanel3.add(lblNome);
        lblNome.setBounds(20, 20, 40, 14);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel3.add(txtNome);
        txtNome.setBounds(20, 40, 200, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-dados-user.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 0, 440, 250);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 440, 250));

        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(116, 116, 116));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sem equipe");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(60, 380, 310, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudo-placeholder.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 20, 330, 330);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-user-time.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 420, 440);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 420, 440));

        jPanel1.setLayout(null);

        txtBiografia.setColumns(20);
        txtBiografia.setRows(5);
        jScrollPane1.setViewportView(txtBiografia);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 60, 250, 100);

        btnaddFoto.setText("Adicionar Foto de Perfil");
        btnaddFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddFoto);
        btnaddFoto.setBounds(180, 10, 250, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boy-profile.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 154, 154);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(116, 116, 116));
        jLabel5.setText("Adicionar biografia");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 40, 248, 15);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-usuario.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 440, 170);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 440, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-padrao.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        
        String sobre = txtBiografia.getText();
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        Date nascimento = null;
        try {
            nascimento = formato.parse(txtDataDeNascimento.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data de nascimento invalida!");
            Logger.getLogger(FormCadastroLoginVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        String cidade = (String) cbCidade.getSelectedItem();
        char sexo = 'N';
        
        if (checkMasc.isSelected()) {
            sexo = 'M';
        } else if (checkFem.isSelected()) {
            sexo = 'F';
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecione o sexo");
        }
        
        String futsal, futebol, futvolei, volei, basquete;
        if (checkFutsal.isSelected()) futsal = "Futsal";
        else futsal = "<html><s>Futsal</s><html>";
        if (checkFutebol.isSelected()) futebol = "Futebol";
        else futebol = "<html><s>Futebol</s><html>";
        if (checkFutVolei.isSelected()) futvolei = "FutVolei";
        else futvolei = "<html><s>FutVolei</s><html>";
        if (checkVolei.isSelected()) volei = "Volei";
        else volei = "<html><s>Volei</s><html>";
        if (checkBasquete.isSelected()) basquete = "Basquete";
        else basquete = "<html><s>Basquete</s><html>";
        
        String esportes[] = {futsal, futebol, futvolei, volei, basquete};
        
        UsuarioService service = new UsuarioService();
        service.alterarDados(nome, email, cidade, nascimento, sexo, sobre, esportes);
        
        TelaPerfilVIEW j = new TelaPerfilVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataDeNascimentoActionPerformed

    private void cbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCidadeActionPerformed

    private void checkFutebolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFutebolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkFutebolActionPerformed

    private void checkFutVoleiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFutVoleiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkFutVoleiActionPerformed

    private void checkVoleiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVoleiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkVoleiActionPerformed

    private void checkBasqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBasqueteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBasqueteActionPerformed

    private void btnaddFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddFotoActionPerformed
        EscolherFotoVIEW j = new EscolherFotoVIEW();
        j.setVisible(true);
    }//GEN-LAST:event_btnaddFotoActionPerformed

    private void btnEditarPerfilPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilPerfilActionPerformed
        TelaPerfilVIEW j = new TelaPerfilVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarPerfilPerfilActionPerformed

    private void btnEditarPerfilPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilPesquisarActionPerformed
        TelaPesquisaVIEW j = new TelaPesquisaVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarPerfilPesquisarActionPerformed

    private void btnEditarPerfilEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilEquipeActionPerformed
        TelaEquipeVIEW j = new TelaEquipeVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarPerfilEquipeActionPerformed

    private void checkMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMascActionPerformed
        checkFem.setSelected(false);
    }//GEN-LAST:event_checkMascActionPerformed

    private void checkFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFemActionPerformed
        checkMasc.setSelected(false);
    }//GEN-LAST:event_checkFemActionPerformed

    private void checkFutsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFutsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkFutsalActionPerformed

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
            java.util.logging.Logger.getLogger(FormEditarPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditarPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditarPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditarPerfilVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormEditarPerfilVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPerfilEquipe;
    private javax.swing.JButton btnEditarPerfilPerfil;
    private javax.swing.JButton btnEditarPerfilPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnaddFoto;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JCheckBox checkBasquete;
    private javax.swing.JCheckBox checkFem;
    private javax.swing.JCheckBox checkFutVolei;
    private javax.swing.JCheckBox checkFutebol;
    private javax.swing.JCheckBox checkFutsal;
    private javax.swing.JCheckBox checkMasc;
    private javax.swing.JCheckBox checkVolei;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel menuTopo;
    private javax.swing.JTextArea txtBiografia;
    private javax.swing.JTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
