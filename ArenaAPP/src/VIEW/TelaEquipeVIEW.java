/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import MODELS.EnderecoModel;
import MODELS.EquipeModel;
import REPOSITORY.UsuarioRepository;
import SERVICES.EnderecoService;
import SERVICES.EquipeService;

/**
 *
 * @author netoi
 */
public class TelaEquipeVIEW extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public TelaEquipeVIEW() {
        initComponents();
        readEquipe();
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
        btnHome = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        btnEditarPesquisar1 = new javax.swing.JButton();
        btnEditarEquipePerfil = new javax.swing.JButton();
        btnEditarPesquisar = new javax.swing.JButton();
        btnEditarEquipeEquipe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        btnEditarPerfil1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btnEditarPerfil5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        checkSeg = new javax.swing.JCheckBox();
        checkTer = new javax.swing.JCheckBox();
        checkQua = new javax.swing.JCheckBox();
        checkQui = new javax.swing.JCheckBox();
        checkSex = new javax.swing.JCheckBox();
        checkSab = new javax.swing.JCheckBox();
        checkDom = new javax.swing.JCheckBox();
        lblCidade5 = new javax.swing.JLabel();
        lblCidade6 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lblCidade2 = new javax.swing.JLabel();
        cbEsporte = new javax.swing.JComboBox<>();
        lblCidade1 = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        lblNome2 = new javax.swing.JLabel();
        lblCidade3 = new javax.swing.JLabel();
        lblCidade4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDono = new javax.swing.JLabel();
        lblDono_ = new javax.swing.JLabel();
        lblArenaID = new javax.swing.JLabel();
        lblArenaID_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArenaAPP");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/ArenaAPP-Logo.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTopo.setLayout(null);

        btnHome.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        menuTopo.add(btnHome);
        btnHome.setBounds(30, 10, 100, 30);

        Logo.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Logo.setText("ArenaAPP");
        menuTopo.add(Logo);
        Logo.setBounds(40, 10, 110, 30);

        btnEditarPesquisar1.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        btnEditarPesquisar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPesquisar1.setText("Pesquisar");
        btnEditarPesquisar1.setBorderPainted(false);
        btnEditarPesquisar1.setContentAreaFilled(false);
        btnEditarPesquisar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPesquisar1ActionPerformed(evt);
            }
        });
        menuTopo.add(btnEditarPesquisar1);
        btnEditarPesquisar1.setBounds(540, 10, 130, 30);

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
        jPanel3.setForeground(new java.awt.Color(180, 180, 180));
        jPanel3.setLayout(null);

        btnSalvar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Editar");
        btnSalvar.setBorderPainted(false);
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalvar);
        btnSalvar.setBounds(50, 400, 120, 20);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao120x30.png"))); // NOI18N
        jPanel3.add(jLabel24);
        jLabel24.setBounds(50, 390, 120, 40);

        btnEditarPerfil1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnEditarPerfil1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil1.setText("Whatsapp");
        btnEditarPerfil1.setBorderPainted(false);
        btnEditarPerfil1.setContentAreaFilled(false);
        btnEditarPerfil1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfil1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarPerfil1);
        btnEditarPerfil1.setBounds(310, 400, 120, 20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao120x30.png"))); // NOI18N
        jPanel3.add(jLabel21);
        jLabel21.setBounds(310, 390, 120, 40);

        btnEditarPerfil5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnEditarPerfil5.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil5.setText("Instagram");
        btnEditarPerfil5.setBorderPainted(false);
        btnEditarPerfil5.setContentAreaFilled(false);
        btnEditarPerfil5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPerfil5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfil5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarPerfil5);
        btnEditarPerfil5.setBounds(180, 400, 124, 20);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao120x30.png"))); // NOI18N
        jPanel3.add(jLabel25);
        jLabel25.setBounds(180, 390, 120, 40);

        checkSeg.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkSeg.setForeground(new java.awt.Color(116, 116, 116));
        checkSeg.setText("Seg");
        checkSeg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSegActionPerformed(evt);
            }
        });
        jPanel3.add(checkSeg);
        checkSeg.setBounds(80, 200, 50, 19);

        checkTer.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkTer.setForeground(new java.awt.Color(116, 116, 116));
        checkTer.setText("Ter");
        checkTer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkTer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTerActionPerformed(evt);
            }
        });
        jPanel3.add(checkTer);
        checkTer.setBounds(130, 200, 50, 19);

        checkQua.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkQua.setForeground(new java.awt.Color(116, 116, 116));
        checkQua.setText("Qua");
        checkQua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkQuaActionPerformed(evt);
            }
        });
        jPanel3.add(checkQua);
        checkQua.setBounds(180, 200, 50, 19);

        checkQui.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkQui.setForeground(new java.awt.Color(116, 116, 116));
        checkQui.setText("Qui");
        checkQui.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkQui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkQuiActionPerformed(evt);
            }
        });
        jPanel3.add(checkQui);
        checkQui.setBounds(240, 200, 50, 19);

        checkSex.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkSex.setForeground(new java.awt.Color(116, 116, 116));
        checkSex.setText("Sex");
        checkSex.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSexActionPerformed(evt);
            }
        });
        jPanel3.add(checkSex);
        checkSex.setBounds(300, 200, 50, 19);

        checkSab.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkSab.setForeground(new java.awt.Color(116, 116, 116));
        checkSab.setText("Sab");
        checkSab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkSab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSabActionPerformed(evt);
            }
        });
        jPanel3.add(checkSab);
        checkSab.setBounds(360, 200, 50, 19);

        checkDom.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkDom.setForeground(new java.awt.Color(116, 116, 116));
        checkDom.setText("Dom");
        checkDom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkDom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDomActionPerformed(evt);
            }
        });
        jPanel3.add(checkDom);
        checkDom.setBounds(20, 200, 60, 19);

        lblCidade5.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblCidade5.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade5.setText("Número:");
        jPanel3.add(lblCidade5);
        lblCidade5.setBounds(340, 260, 50, 20);

        lblCidade6.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblCidade6.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade6.setText("Bairro:");
        jPanel3.add(lblCidade6);
        lblCidade6.setBounds(20, 320, 60, 20);

        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        jPanel3.add(txtNum);
        txtNum.setBounds(340, 280, 64, 30);

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        jPanel3.add(txtBairro);
        txtBairro.setBounds(20, 340, 230, 30);

        lblCidade2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblCidade2.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade2.setText("Endereço");
        jPanel3.add(lblCidade2);
        lblCidade2.setBounds(20, 240, 70, 20);

        cbEsporte.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        cbEsporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futebol", "Futsal", "FutVolei", "Volei", "Basquete" }));
        cbEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEsporteActionPerformed(evt);
            }
        });
        jPanel3.add(cbEsporte);
        cbEsporte.setBounds(260, 30, 150, 30);

        lblCidade1.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblCidade1.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade1.setText("Cidade");
        jPanel3.add(lblCidade1);
        lblCidade1.setBounds(260, 320, 50, 20);

        cbCidade.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guanambi-BA", "Caetité-BA", "Igaporã-BA" }));
        cbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidadeActionPerformed(evt);
            }
        });
        jPanel3.add(cbCidade);
        cbCidade.setBounds(260, 340, 150, 30);

        lblNome.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblNome.setForeground(new java.awt.Color(116, 116, 116));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNome.setText("Dias de pratica");
        jPanel3.add(lblNome);
        lblNome.setBounds(20, 180, 100, 20);

        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });
        jPanel3.add(txtRua);
        txtRua.setBounds(20, 280, 310, 30);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel3.add(txtNome);
        txtNome.setBounds(20, 30, 220, 30);

        lblIdade.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(116, 116, 116));
        jPanel3.add(lblIdade);
        lblIdade.setBounds(290, 270, 130, 20);

        lblNome1.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(116, 116, 116));
        lblNome1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNome1.setText("Nome");
        jPanel3.add(lblNome1);
        lblNome1.setBounds(20, 10, 100, 20);

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane2.setViewportView(txtDesc);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 90, 390, 86);

        lblNome2.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(116, 116, 116));
        lblNome2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNome2.setText("Descrição");
        jPanel3.add(lblNome2);
        lblNome2.setBounds(20, 70, 100, 20);

        lblCidade3.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblCidade3.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade3.setText("Rua:");
        jPanel3.add(lblCidade3);
        lblCidade3.setBounds(20, 260, 30, 20);

        lblCidade4.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblCidade4.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade4.setText("Esporte");
        jPanel3.add(lblCidade4);
        lblCidade4.setBounds(260, 10, 50, 20);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 440, 440));

        jPanel2.setLayout(null);

        lblDono.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblDono.setForeground(new java.awt.Color(116, 116, 116));
        lblDono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDono.setText("Nome");
        jPanel2.add(lblDono);
        lblDono.setBounds(240, 410, 50, 20);

        lblDono_.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblDono_.setForeground(new java.awt.Color(116, 116, 116));
        lblDono_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDono_.setText("Criado por:");
        jPanel2.add(lblDono_);
        lblDono_.setBounds(160, 410, 70, 20);

        lblArenaID.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblArenaID.setForeground(new java.awt.Color(116, 116, 116));
        lblArenaID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblArenaID.setText("ID");
        jPanel2.add(lblArenaID);
        lblArenaID.setBounds(70, 410, 50, 20);

        lblArenaID_.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblArenaID_.setForeground(new java.awt.Color(116, 116, 116));
        lblArenaID_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblArenaID_.setText("Arena ID:");
        jPanel2.add(lblArenaID_);
        lblArenaID_.setBounds(10, 410, 60, 20);

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
        jScrollPane1.setBounds(0, 0, 420, 400);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-user-time.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 420, 440);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 420, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-padrao.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void cbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeActionPerformed

    }//GEN-LAST:event_cbCidadeActionPerformed

    private void cbEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEsporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEsporteActionPerformed

    private void checkDomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDomActionPerformed

    private void checkSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSegActionPerformed

    private void checkTerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTerActionPerformed

    private void checkQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkQuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkQuaActionPerformed

    private void checkQuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkQuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkQuiActionPerformed

    private void checkSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSexActionPerformed

    private void checkSabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSabActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnEditarPerfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPerfil1ActionPerformed

    private void btnEditarPerfil5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfil5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPerfil5ActionPerformed

    private void btnEditarEquipePerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEquipePerfilActionPerformed
        if (UsuarioRepository.usuarioLogado.isLogado()) {
            TelaPerfilVIEW j = new TelaPerfilVIEW();
            this.dispose();
            j.setVisible(true);
        } else {
            FormLoginVIEW j = new FormLoginVIEW();
            this.dispose();
            j.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarEquipePerfilActionPerformed

    private void btnEditarPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPesquisarActionPerformed
        TelaPesquisaVIEW j = new TelaPesquisaVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarPesquisarActionPerformed

    private void btnEditarEquipeEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEquipeEquipeActionPerformed
        if (UsuarioRepository.usuarioLogado.isLogado()) {
            if (UsuarioRepository.usuarioLogado.getId_equipe() != 0) {
                TelaEquipeVIEW j = new TelaEquipeVIEW();
                this.dispose();
                j.setVisible(true);
            } else {
                FormEditarEquipeVIEW j = new FormEditarEquipeVIEW();
                this.dispose();
                j.setVisible(true);
            }
        } else {
            FormLoginVIEW j = new FormLoginVIEW();
            this.dispose();
            j.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarEquipeEquipeActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void btnEditarPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPesquisar1ActionPerformed
        TelaPesquisaVIEW j = new TelaPesquisaVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnEditarPesquisar1ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        TelaInicialVIEW j = new TelaInicialVIEW();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        FormEditarEquipeVIEW j = new FormEditarEquipeVIEW();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    public static boolean getBoolean(String valor) {
        return !valor.equals("0");
    }

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
            java.util.logging.Logger.getLogger(TelaEquipeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEquipeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEquipeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEquipeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaEquipeVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnEditarEquipeEquipe;
    private javax.swing.JButton btnEditarEquipePerfil;
    private javax.swing.JButton btnEditarPerfil1;
    private javax.swing.JButton btnEditarPerfil5;
    private javax.swing.JButton btnEditarPesquisar;
    private javax.swing.JButton btnEditarPesquisar1;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbEsporte;
    private javax.swing.JCheckBox checkDom;
    private javax.swing.JCheckBox checkQua;
    private javax.swing.JCheckBox checkQui;
    private javax.swing.JCheckBox checkSab;
    private javax.swing.JCheckBox checkSeg;
    private javax.swing.JCheckBox checkSex;
    private javax.swing.JCheckBox checkTer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblArenaID;
    private javax.swing.JLabel lblArenaID_;
    private javax.swing.JLabel lblCidade1;
    private javax.swing.JLabel lblCidade2;
    private javax.swing.JLabel lblCidade3;
    private javax.swing.JLabel lblCidade4;
    private javax.swing.JLabel lblCidade5;
    private javax.swing.JLabel lblCidade6;
    private javax.swing.JLabel lblDono;
    private javax.swing.JLabel lblDono_;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JPanel menuTopo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables

    public void readEquipe() {
        if (UsuarioRepository.usuarioLogado.getId_equipe() != 0) {
            EquipeModel equipe = new EquipeModel();
            EnderecoModel endereco = new EnderecoModel();
            equipe.setIdEquipe(UsuarioRepository.usuarioLogado.getId_equipe());

            EquipeService service = new EquipeService();
            EnderecoService serviceEnde = new EnderecoService();
            equipe = service.readEquipe(equipe);
            endereco = serviceEnde.readEndereco(equipe);

            txtNome.setText(equipe.getNome());
            txtDesc.setText(equipe.getDescricao());
            cbEsporte.setSelectedItem(equipe.getEsporte());
            checkDom.setSelected(getBoolean(equipe.getDom()));
            checkSeg.setSelected(getBoolean(equipe.getSeg()));
            checkTer.setSelected(getBoolean(equipe.getTer()));
            checkQua.setSelected(getBoolean(equipe.getQua()));
            checkQui.setSelected(getBoolean(equipe.getQui()));
            checkSex.setSelected(getBoolean(equipe.getSex()));
            checkSab.setSelected(getBoolean(equipe.getSab()));
            txtRua.setText(endereco.getRua());
            txtBairro.setText(endereco.getBairro());
            txtNum.setText(endereco.getNum());
            cbCidade.setSelectedItem(endereco.getCidade());

            txtNome.setEnabled(false);
            txtDesc.setEnabled(false);
            cbEsporte.setEnabled(false);
            checkDom.setEnabled(false);
            checkSeg.setEnabled(false);
            checkTer.setEnabled(false);
            checkQua.setEnabled(false);
            checkQui.setEnabled(false);
            checkSex.setEnabled(false);
            checkSab.setEnabled(false);
            txtRua.setEnabled(false);
            txtBairro.setEnabled(false);
            txtNum.setEnabled(false);
            cbCidade.setEnabled(false);
        }
    }
}
