/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserJframes;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import whatever.proyectocajero.MenuPrincipal;
import whatever.proyectocajero.SQLConection;
import whatever.proyectocajero.SharedAdminData;
import whatever.proyectocajero.SharedUserDATA;

/**
 *
 * @author ALEJANDRO REQUENA
 */
public class LoginUser extends javax.swing.JFrame {

    /**
     * Creates new form LoginUser
     */
    public LoginUser() {
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
        jPanel5 = new javax.swing.JPanel();
        LeftPanelLogin6 = new javax.swing.JPanel();
        LoginText6 = new javax.swing.JLabel();
        AdminText6 = new javax.swing.JLabel();
        TxtFieldAdminKeyTarget = new javax.swing.JTextField();
        PasswordTextAdmin6PIN = new javax.swing.JLabel();
        TxtPasswordFielAdminPIN = new javax.swing.JPasswordField();
        SignUpBtnAdmin6 = new javax.swing.JButton();
        HighRighPanelAdmin6 = new javax.swing.JPanel();
        RighPanelAdmin6 = new javax.swing.JPanel();
        ComeHomeBtn6 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(762, 364));

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        LeftPanelLogin6.setBackground(new java.awt.Color(255, 255, 255));
        LeftPanelLogin6.setPreferredSize(new java.awt.Dimension(382, 320));
        LeftPanelLogin6.setLayout(new java.awt.GridBagLayout());

        LoginText6.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        LoginText6.setForeground(new java.awt.Color(255, 11, 79));
        LoginText6.setText("Iniciar sesion de usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 28, 0, 6);
        LeftPanelLogin6.add(LoginText6, gridBagConstraints);

        AdminText6.setBackground(new java.awt.Color(0, 0, 0));
        AdminText6.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        AdminText6.setForeground(new java.awt.Color(0, 0, 0));
        AdminText6.setText("No. Tarjeta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 28, 0, 6);
        LeftPanelLogin6.add(AdminText6, gridBagConstraints);

        TxtFieldAdminKeyTarget.setBackground(new java.awt.Color(255, 255, 255));
        TxtFieldAdminKeyTarget.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        TxtFieldAdminKeyTarget.setForeground(new java.awt.Color(0, 0, 0));
        TxtFieldAdminKeyTarget.setCaretColor(new java.awt.Color(0, 0, 0));
        TxtFieldAdminKeyTarget.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtFieldAdminKeyTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldAdminKeyTargetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 269;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 0);
        LeftPanelLogin6.add(TxtFieldAdminKeyTarget, gridBagConstraints);

        PasswordTextAdmin6PIN.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        PasswordTextAdmin6PIN.setForeground(new java.awt.Color(0, 0, 0));
        PasswordTextAdmin6PIN.setText("PIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 239;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 28, 0, 6);
        LeftPanelLogin6.add(PasswordTextAdmin6PIN, gridBagConstraints);

        TxtPasswordFielAdminPIN.setBackground(new java.awt.Color(255, 255, 255));
        TxtPasswordFielAdminPIN.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        TxtPasswordFielAdminPIN.setForeground(new java.awt.Color(0, 0, 0));
        TxtPasswordFielAdminPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasswordFielAdminPINActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 271;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 0);
        LeftPanelLogin6.add(TxtPasswordFielAdminPIN, gridBagConstraints);

        SignUpBtnAdmin6.setBackground(new java.awt.Color(255, 11, 79));
        SignUpBtnAdmin6.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        SignUpBtnAdmin6.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtnAdmin6.setText("Entrar");
        SignUpBtnAdmin6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnAdmin6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 249;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 28, 32, 0);
        LeftPanelLogin6.add(SignUpBtnAdmin6, gridBagConstraints);

        jPanel5.add(LeftPanelLogin6);

        HighRighPanelAdmin6.setBackground(new java.awt.Color(255, 11, 79));

        RighPanelAdmin6.setBackground(new java.awt.Color(255, 65, 118));
        RighPanelAdmin6.setLayout(new java.awt.GridBagLayout());

        ComeHomeBtn6.setBackground(new java.awt.Color(255, 255, 255));
        ComeHomeBtn6.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        ComeHomeBtn6.setForeground(new java.awt.Color(255, 11, 79));
        ComeHomeBtn6.setText("Regresar");
        ComeHomeBtn6.setBorder(null);
        ComeHomeBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComeHomeBtn6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(94, 62, 91, 61);
        RighPanelAdmin6.add(ComeHomeBtn6, gridBagConstraints);

        javax.swing.GroupLayout HighRighPanelAdmin6Layout = new javax.swing.GroupLayout(HighRighPanelAdmin6);
        HighRighPanelAdmin6.setLayout(HighRighPanelAdmin6Layout);
        HighRighPanelAdmin6Layout.setHorizontalGroup(
            HighRighPanelAdmin6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HighRighPanelAdmin6Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(RighPanelAdmin6, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        HighRighPanelAdmin6Layout.setVerticalGroup(
            HighRighPanelAdmin6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HighRighPanelAdmin6Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(RighPanelAdmin6, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );

        jPanel5.add(HighRighPanelAdmin6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFieldAdminKeyTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldAdminKeyTargetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFieldAdminKeyTargetActionPerformed

    private void TxtPasswordFielAdminPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordFielAdminPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordFielAdminPINActionPerformed
private String verificarCredencialesYObtenerNombre(String numeroTarjeta, String pin) {
    SQLConection sqlConnection = new SQLConection();
    Connection conn = sqlConnection.StartSQLConnection();

    if (conn == null) {
        JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    String query = "SELECT id_usuario, nombre,PIN,token,TokenTipo,saldo,monto_maximo,monto_retirado_hoy FROM CREAR_USUARIOS WHERE numero_tarjeta = ? AND PIN = ?";

    try (PreparedStatement pstmt = conn.prepareStatement(query)) {
        pstmt.setString(1, numeroTarjeta);
        pstmt.setString(2, pin);

        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String nombreUsuario = rs.getString("nombre");
                String PIN = rs.getString("PIN");
                String token = rs.getString("token");
                int tokenTipo = rs.getInt("TokenTipo");
                BigDecimal montoMax = rs.getBigDecimal("monto_maximo");
                BigDecimal saldo = rs.getBigDecimal("saldo");
                BigDecimal montoRetiradoHOY = rs.getBigDecimal("monto_retirado_hoy");
                actualizarUltimoAcceso(conn, idUsuario);
                SharedUserDATA.setId_usuario(idUsuario);
                SharedUserDATA.setUserLoginName(nombreUsuario);
                SharedUserDATA.setPIN(PIN);
                SharedUserDATA.setToken(token);
                SharedUserDATA.setTokenTipo(tokenTipo);
                SharedUserDATA.setNumeroTarjeta(numeroTarjeta);
                SharedUserDATA.setMontoMax(montoMax);
                SharedUserDATA.setSaldoUser(saldo);
                SharedUserDATA.setMontoRetiradoHoy(montoRetiradoHOY);
                
                return nombreUsuario;
            } else {
                JOptionPane.showMessageDialog(this, "Te amo Dulce De La Cruz Pereira ", "Error", JOptionPane.WARNING_MESSAGE);
                return null;
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al verificar las credenciales: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}

private void actualizarUltimoAcceso(Connection conn, int idUsuario) {
    String updateQuery = "UPDATE CREAR_USUARIOS SET ultimo_acceso = GETDATE() WHERE id_usuario = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
        pstmt.setInt(1, idUsuario);
        pstmt.executeUpdate();
        String UpdateConsulta = "UPDATE CONSULTA_USUARIO SET ultimo_acceso = GETDATE() WHERE id_usuario = ?";
        try(PreparedStatement UpdateStmt = conn.prepareStatement(UpdateConsulta)){
            UpdateStmt.setInt(1, idUsuario);
            UpdateStmt.executeUpdate();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar el último acceso: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    private void SignUpBtnAdmin6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnAdmin6ActionPerformed
    String numeroTarjeta = TxtFieldAdminKeyTarget.getText();  
    String pin = new String(TxtPasswordFielAdminPIN.getPassword());      

    if (numeroTarjeta.isEmpty() || pin.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar el número de tarjeta y el PIN", "Cuéntame siquiera qué animales viste en las nubes", JOptionPane.WARNING_MESSAGE);
        return;
    }
    if(numeroTarjeta.length() != 16 || pin.length() != 4){
        JOptionPane.showMessageDialog(this, "Las tarjetas pueden tener unicamente 16 caracteres y el PIN 4 caracteres");
        return;
    }

    String nombreUsuario = verificarCredencialesYObtenerNombre(numeroTarjeta, pin);
    
    if (nombreUsuario != null) {
        JOptionPane.showMessageDialog(this,"Bienvenido, " + nombreUsuario);
        MainUserLobby mainUserWindow = new MainUserLobby();
        mainUserWindow.setVisible(true);

        this.dispose();
        }
    }//GEN-LAST:event_SignUpBtnAdmin6ActionPerformed

    private void ComeHomeBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComeHomeBtn6ActionPerformed
        MenuPrincipal MenuMain = new MenuPrincipal();
        MenuMain.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_ComeHomeBtn6ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminText6;
    private javax.swing.JButton ComeHomeBtn6;
    private javax.swing.JPanel HighRighPanelAdmin6;
    private javax.swing.JPanel LeftPanelLogin6;
    private javax.swing.JLabel LoginText6;
    private javax.swing.JLabel PasswordTextAdmin6PIN;
    private javax.swing.JPanel RighPanelAdmin6;
    private javax.swing.JButton SignUpBtnAdmin6;
    private javax.swing.JTextField TxtFieldAdminKeyTarget;
    private javax.swing.JPasswordField TxtPasswordFielAdminPIN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
