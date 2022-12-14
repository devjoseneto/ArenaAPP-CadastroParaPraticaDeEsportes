/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import SERVICES.UsuarioService;
import java.sql.SQLException;
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
public class FormCadastroLoginVIEW extends javax.swing.JFrame {

    /**
     * Creates new form FormLoginVIEW
     */
    public FormCadastroLoginVIEW() {
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

        btnHome = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        checkFem = new javax.swing.JCheckBox();
        checkMasc = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtDataDeNascimento = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnCadastrarLogin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnMudarParaLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imgBarraLogin = new javax.swing.JLabel();
        imgLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArenaAPP");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/ArenaAPP-Logo.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 220, 50));

        Logo.setFont(new java.awt.Font("Lucida Sans", 1, 40)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Logo.setText("ArenaAPP");
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(116, 116, 116));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Sexo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 110, 10));

        checkFem.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkFem.setForeground(new java.awt.Color(116, 116, 116));
        checkFem.setText("Fem");
        checkFem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFemActionPerformed(evt);
            }
        });
        getContentPane().add(checkFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 50, 30));

        checkMasc.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        checkMasc.setForeground(new java.awt.Color(116, 116, 116));
        checkMasc.setText("Masc");
        checkMasc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMascActionPerformed(evt);
            }
        });
        getContentPane().add(checkMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 60, 30));

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(116, 116, 116));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Data De Nascimento");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 120, 10));

        txtDataDeNascimento.setText("dd/mm/aaaa");
        txtDataDeNascimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDataDeNascimentoMouseClicked(evt);
            }
        });
        txtDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataDeNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 120, 30));

        lblCidade.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(116, 116, 116));
        lblCidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCidade.setText("Cidade");
        getContentPane().add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 110, 10));

        cbCidade.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guanambi-BA", "Caetité-BA", "Igaporã-BA" }));
        cbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cbCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 250, 30));

        txtNome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                txtNomeAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNomeMouseExited(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtNomePropertyChange(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 250, 30));

        lblNome.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblNome.setForeground(new java.awt.Color(116, 116, 116));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNome.setText("Nome");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 110, 10));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 250, 30));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 250, 30));

        btnCadastrarLogin.setBorderPainted(false);
        btnCadastrarLogin.setContentAreaFilled(false);
        btnCadastrarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 250, 40));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cadastra-se");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 150, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoBotao.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(116, 116, 116));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Senha");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 110, 10));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(116, 116, 116));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 110, 10));

        btnMudarParaLogin.setBorderPainted(false);
        btnMudarParaLogin.setContentAreaFilled(false);
        btnMudarParaLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMudarParaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMudarParaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnMudarParaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 150, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 144, 53));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastre-se");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 150, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(116, 116, 116));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 150, -1));

        imgBarraLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barra-cadastro.png"))); // NOI18N
        getContentPane().add(imgBarraLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, 10));

        imgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image-login.png"))); // NOI18N
        getContentPane().add(imgLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoLogin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMudarParaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMudarParaLoginActionPerformed
        FormLoginVIEW j = new FormLoginVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnMudarParaLoginActionPerformed

    private void btnCadastrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLoginActionPerformed
        createLogin();
    }//GEN-LAST:event_btnCadastrarLoginActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void cbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCidadeActionPerformed

    private void txtDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoActionPerformed

    }//GEN-LAST:event_txtDataDeNascimentoActionPerformed

    private void checkMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMascActionPerformed
        checkFem.setSelected(false);
    }//GEN-LAST:event_checkMascActionPerformed

    private void checkFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFemActionPerformed
        checkMasc.setSelected(false);
    }//GEN-LAST:event_checkFemActionPerformed

    private void txtDataDeNascimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoMouseClicked
        if (txtDataDeNascimento.getText().equals("dd/mm/aaaa")) {
            txtDataDeNascimento.setText("");
        }
    }//GEN-LAST:event_txtDataDeNascimentoMouseClicked

    private void txtNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseExited

    }//GEN-LAST:event_txtNomeMouseExited

    private void txtNomePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtNomePropertyChange

    }//GEN-LAST:event_txtNomePropertyChange

    private void txtNomeAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtNomeAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAncestorMoved

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        TelaInicialVIEW j = new TelaInicialVIEW();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroLoginVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnCadastrarLogin;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnMudarParaLogin;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JCheckBox checkFem;
    private javax.swing.JCheckBox checkMasc;
    private javax.swing.JLabel imgBarraLogin;
    private javax.swing.JLabel imgLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    public void createLogin() {
        SimpleDateFormat formatoBR = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoEUA = new SimpleDateFormat("yyyy/MM/dd");

        String nome = txtNome.getText();
        String email = txtEmail.getText();
        char[] senha = txtSenha.getPassword();
        String cidade = cbCidade.getSelectedItem().toString();

        Date nascimento_ = null;
        try {
            nascimento_ = formatoBR.parse(txtDataDeNascimento.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data de nascimento invalida!");
            Logger.getLogger(FormCadastroLoginVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        String nascimento = formatoEUA.format(nascimento_);
        System.out.println(nascimento);

        char sexo = 0;
        boolean verificar = false;

        if (checkMasc.isSelected()) {
            sexo = 'M';
            verificar = true;
        } else if (checkFem.isSelected()) {
            sexo = 'F';
            verificar = true;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecione o sexo");
        }

        UsuarioService service = new UsuarioService();
        try {
            service.cadastrarUsuario(nome, email, senha, cidade, nascimento, sexo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "FormCadastroLoginVIEW: " + ex);
            Logger.getLogger(FormCadastroLoginVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        FormEditarPerfilVIEW j = new FormEditarPerfilVIEW();
        this.dispose();
        j.setVisible(true);
    }
}
