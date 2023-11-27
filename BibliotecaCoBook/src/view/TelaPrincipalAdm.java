/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package view;

/**
 *
 * @author Guilherme
 */
public class TelaPrincipalAdm extends javax.swing.JFrame {

    /** Creates new form TelaPrincipalAdm */
    public TelaPrincipalAdm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelAdmPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuLivrariaAdm = new javax.swing.JMenu();
        jMenuItemVLivrosAdm = new javax.swing.JMenuItem();
        jMenuCadastrarAdm = new javax.swing.JMenu();
        jMenuItemCadastrarUsuariosAdm = new javax.swing.JMenuItem();
        jMenuItemCadastroLivrosAdm = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSairAdm = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Administrador");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        jLabelAdmPrincipal.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabelAdmPrincipal.setText("Administração");

        jMenuLivrariaAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-livros-64.png"))); // NOI18N
        jMenuLivrariaAdm.setText("Livraria");
        jMenuLivrariaAdm.setFocusable(false);
        jMenuLivrariaAdm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItemVLivrosAdm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemVLivrosAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.png"))); // NOI18N
        jMenuItemVLivrosAdm.setText("Visualizar Livros");
        jMenuItemVLivrosAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVLivrosAdmActionPerformed(evt);
            }
        });
        jMenuLivrariaAdm.add(jMenuItemVLivrosAdm);

        jMenuBar1.add(jMenuLivrariaAdm);

        jMenuCadastrarAdm.setText("Cadastrar");
        jMenuCadastrarAdm.setToolTipText("");
        jMenuCadastrarAdm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItemCadastrarUsuariosAdm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemCadastrarUsuariosAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.png"))); // NOI18N
        jMenuItemCadastrarUsuariosAdm.setText("Usuários");
        jMenuItemCadastrarUsuariosAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarUsuariosAdmActionPerformed(evt);
            }
        });
        jMenuCadastrarAdm.add(jMenuItemCadastrarUsuariosAdm);

        jMenuItemCadastroLivrosAdm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemCadastroLivrosAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.png"))); // NOI18N
        jMenuItemCadastroLivrosAdm.setText("Livros");
        jMenuItemCadastroLivrosAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroLivrosAdmActionPerformed(evt);
            }
        });
        jMenuCadastrarAdm.add(jMenuItemCadastroLivrosAdm);

        jMenuBar1.add(jMenuCadastrarAdm);

        jMenuSair.setText("Sair");
        jMenuSair.setToolTipText("");
        jMenuSair.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItemSairAdm.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemSairAdm.setText("Sair");
        jMenuItemSairAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairAdmActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSairAdm);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabelAdmPrincipal)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelAdmPrincipal)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemVLivrosAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVLivrosAdmActionPerformed
        // TODO add your handling code here:]
        TelaVisualizadorDeLivros telaVisualizadorDeLivros = new TelaVisualizadorDeLivros();
        telaVisualizadorDeLivros.setVisible(true);
    }//GEN-LAST:event_jMenuItemVLivrosAdmActionPerformed

    private void jMenuItemCadastrarUsuariosAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarUsuariosAdmActionPerformed
     dispose();
    // Crie uma instância da tela de cadastro de usuários
    TelaCadastroUsuarios telaCadastroUsuarios = new TelaCadastroUsuarios();
    // Torna a tela de cadastro de usuários visível
    telaCadastroUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarUsuariosAdmActionPerformed

    private void jMenuItemCadastroLivrosAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroLivrosAdmActionPerformed
    dispose();
    TelaCadastroLivros telaCadastroLivros = new TelaCadastroLivros(true);

    telaCadastroLivros.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroLivrosAdmActionPerformed

    private void jMenuItemSairAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairAdmActionPerformed

    dispose();
    Login login = new Login();

    login.setVisible(true);
  
    }//GEN-LAST:event_jMenuItemSairAdmActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAdmPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrarAdm;
    private javax.swing.JMenuItem jMenuItemCadastrarUsuariosAdm;
    private javax.swing.JMenuItem jMenuItemCadastroLivrosAdm;
    private javax.swing.JMenuItem jMenuItemSairAdm;
    private javax.swing.JMenuItem jMenuItemVLivrosAdm;
    private javax.swing.JMenu jMenuLivrariaAdm;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
