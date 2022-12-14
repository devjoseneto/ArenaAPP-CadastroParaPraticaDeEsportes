/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import MODELS.UsuarioModel;
import SERVICES.UsuarioService;
import javax.swing.JOptionPane;

/**
 *
 * @author netoi
 */
public class FormLoginVIEW extends javax.swing.JFrame {

    /**
     * Creates new form FormLoginVIEW
     */
    public FormLoginVIEW() {
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
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLoginTelaInicial = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnRecuperarSenha = new javax.swing.JButton();
        esqueciSenha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnMudarParaCadastreSe = new javax.swing.JButton();
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

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 250, 30));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 250, 30));

        btnLoginTelaInicial.setBorderPainted(false);
        btnLoginTelaInicial.setContentAreaFilled(false);
        btnLoginTelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginTelaInicialActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginTelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 250, 40));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Logar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 150, -1));

        btnRecuperarSenha.setBorderPainted(false);
        btnRecuperarSenha.setContentAreaFilled(false);
        btnRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecuperarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 110, 10));

        esqueciSenha.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        esqueciSenha.setForeground(new java.awt.Color(116, 116, 116));
        esqueciSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        esqueciSenha.setText("Esqueci minha senha");
        getContentPane().add(esqueciSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 110, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoBotao.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(116, 116, 116));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Senha");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 110, 10));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(116, 116, 116));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 110, 10));

        btnMudarParaCadastreSe.setBorderPainted(false);
        btnMudarParaCadastreSe.setContentAreaFilled(false);
        btnMudarParaCadastreSe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMudarParaCadastreSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMudarParaCadastreSeActionPerformed(evt);
            }
        });
        getContentPane().add(btnMudarParaCadastreSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 140, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(116, 116, 116));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastre-se");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 150, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 144, 53));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 150, -1));

        imgBarraLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barra-Login.png"))); // NOI18N
        getContentPane().add(imgBarraLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, 10));

        imgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image-login.png"))); // NOI18N
        getContentPane().add(imgLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoLogin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMudarParaCadastreSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMudarParaCadastreSeActionPerformed
        FormCadastroLoginVIEW j = new FormCadastroLoginVIEW();
        this.dispose();
        j.setVisible(true);
    }//GEN-LAST:event_btnMudarParaCadastreSeActionPerformed

    private void btnRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarSenhaActionPerformed
        String email = txtEmail.getText();
        JOptionPane.showInputDialog(rootPane, "Digite seu email:", "Recuperar Senha", JOptionPane.INFORMATION_MESSAGE, null, null, email);

    }//GEN-LAST:event_btnRecuperarSenhaActionPerformed

    private void btnLoginTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginTelaInicialActionPerformed
        efetuarLogin();
    }//GEN-LAST:event_btnLoginTelaInicialActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

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
            java.util.logging.Logger.getLogger(FormLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLoginVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLoginTelaInicial;
    private javax.swing.JButton btnMudarParaCadastreSe;
    private javax.swing.JButton btnRecuperarSenha;
    private javax.swing.JLabel esqueciSenha;
    private javax.swing.JLabel imgBarraLogin;
    private javax.swing.JLabel imgLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    public void efetuarLogin() {
        String email = txtEmail.getText();
        String senha = new String(txtPassword.getPassword());

        UsuarioModel usuario = new UsuarioModel();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        UsuarioService service = new UsuarioService();
        boolean autenticacao = service.efetuarLogin(usuario);
        
        if (autenticacao){
            if (TelaInicialVIEW.navegacao.equals("criarEquipe")) {
                FormEditarEquipeVIEW j = new FormEditarEquipeVIEW();
                j.setVisible(true);
                this.dispose();
            } else {
                TelaInicialVIEW j = new TelaInicialVIEW();
                j.setVisible(true);
                this.dispose();
            }
        }
    }

}
