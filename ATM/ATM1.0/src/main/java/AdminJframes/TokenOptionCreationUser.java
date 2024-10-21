/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminJframes;

import whatever.proyectocajero.SharedAdminData;


/**
 *
 * @author ALEJANDRO REQUENA
 */
public class TokenOptionCreationUser extends javax.swing.JFrame {
    public TokenOptionCreationUser() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Upperbg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackLobby = new javax.swing.JButton();
        CenterBg = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TokenUserStaticBtn = new javax.swing.JButton();
        TokenUserDynBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(942, 549));

        jPanel1.setLayout(new java.awt.BorderLayout());

        Upperbg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(6, 90, 216));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Opcion de token");
        jLabel1.setAutoscrolls(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 6, 27, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        BackLobby.setBackground(new java.awt.Color(255, 255, 255));
        BackLobby.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        BackLobby.setForeground(new java.awt.Color(204, 0, 51));
        BackLobby.setText("Regresar");
        BackLobby.setBorder(null);
        BackLobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackLobbyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpperbgLayout = new javax.swing.GroupLayout(Upperbg);
        Upperbg.setLayout(UpperbgLayout);
        UpperbgLayout.setHorizontalGroup(
            UpperbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperbgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackLobby, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        UpperbgLayout.setVerticalGroup(
            UpperbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperbgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(UpperbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BackLobby, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(Upperbg, java.awt.BorderLayout.PAGE_START);

        CenterBg.setBackground(new java.awt.Color(204, 0, 51));
        CenterBg.setForeground(new java.awt.Color(218, 218, 218));

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Para el usuario que creará a continuacion desea que su token sea dinamico o estatico?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Si lo desea estatico usted escogera el token y se lo entregara a el usuario para su utilidad como");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("para cambiar su PIN o retirar dinero y otros, por otra parte si es dinamico el programa actual");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 50, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("generara un token automaticamente y lo conectara con los datos del usuario para su seguridad.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 24, 12, 6);
        jPanel3.add(jLabel5, gridBagConstraints);

        TokenUserStaticBtn.setBackground(new java.awt.Color(255, 11, 79));
        TokenUserStaticBtn.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        TokenUserStaticBtn.setForeground(new java.awt.Color(255, 255, 255));
        TokenUserStaticBtn.setText("Estatico");
        TokenUserStaticBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TokenUserStaticBtnActionPerformed(evt);
            }
        });

        TokenUserDynBtn.setBackground(new java.awt.Color(255, 11, 79));
        TokenUserDynBtn.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        TokenUserDynBtn.setForeground(new java.awt.Color(255, 255, 255));
        TokenUserDynBtn.setText("Dinamico");
        TokenUserDynBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TokenUserDynBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CenterBgLayout = new javax.swing.GroupLayout(CenterBg);
        CenterBg.setLayout(CenterBgLayout);
        CenterBgLayout.setHorizontalGroup(
            CenterBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CenterBgLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(TokenUserStaticBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(189, 189, 189)
                .addComponent(TokenUserDynBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(108, 108, 108))
        );
        CenterBgLayout.setVerticalGroup(
            CenterBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterBgLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(62, 62, 62)
                .addGroup(CenterBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TokenUserStaticBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TokenUserDynBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jPanel1.add(CenterBg, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackLobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackLobbyActionPerformed
        MainAdminLobby LobbyAdmin = new MainAdminLobby(SharedAdminData.getLoginName(),SharedAdminData.getPassword());
        LobbyAdmin.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_BackLobbyActionPerformed
 
    private void TokenUserStaticBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TokenUserStaticBtnActionPerformed
        UserCreationPlusToken userPanelStaticToken = new UserCreationPlusToken();
        userPanelStaticToken.setVisible(true);
        this.dispose();  
          
    }//GEN-LAST:event_TokenUserStaticBtnActionPerformed

    private void TokenUserDynBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TokenUserDynBtnActionPerformed
        UserCreation userPanelDynamicToken = new UserCreation();
        userPanelDynamicToken.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TokenUserDynBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TokenOptionCreationUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TokenOptionCreationUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TokenOptionCreationUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TokenOptionCreationUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TokenOptionCreationUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackLobby;
    private javax.swing.JPanel CenterBg;
    private javax.swing.JButton TokenUserDynBtn;
    private javax.swing.JButton TokenUserStaticBtn;
    private javax.swing.JPanel Upperbg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
