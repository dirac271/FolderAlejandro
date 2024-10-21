/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminJframes;

import AdminJframes.MainAdminLobby;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import whatever.proyectocajero.SQLConection;
import whatever.proyectocajero.SharedAdminData;

/**
 *
 * @author ALEJANDRO REQUENA
 */
public class ModTarget extends javax.swing.JFrame {

    /**
     * Creates new form ModLimit
     */
    public ModTarget() {
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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        ModifyLimitBtn = new javax.swing.JButton();
        FieldOldTarget = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FieldNewTarget = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(942, 549));

        jPanel1.setPreferredSize(new java.awt.Dimension(1028, 519));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Regresar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(6, 90, 216));
        jLabel1.setText("Modificar Tarjeta");
        jPanel4.add(jLabel1, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(6, 90, 216));

        jPanel5.setBackground(new java.awt.Color(7, 117, 228));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(7, 117, 228));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar el numero de tarjeta del usuario que desea cambiar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 136, 0, 0);
        jPanel6.add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recordatorio: Aunque le cambiemos el numero de tarjeta a un usuario, su limite de retiro diario sigue siendo el mismo de su tarjeta anterior ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 65, 0, 89);
        jPanel6.add(jLabel4, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("aunque haya cambiado de numero de tarjeta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 346, 12, 0);
        jPanel6.add(jLabel3, gridBagConstraints);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(7, 117, 228));

        ModifyLimitBtn.setBackground(new java.awt.Color(255, 11, 79));
        ModifyLimitBtn.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        ModifyLimitBtn.setForeground(new java.awt.Color(255, 255, 255));
        ModifyLimitBtn.setText("Modificar");
        ModifyLimitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyLimitBtnActionPerformed(evt);
            }
        });

        FieldOldTarget.setBackground(new java.awt.Color(255, 255, 255));
        FieldOldTarget.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        FieldOldTarget.setForeground(new java.awt.Color(0, 0, 0));
        FieldOldTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldOldTargetActionPerformed(evt);
            }
        });
        FieldOldTarget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldOldTargetKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No. de Tarjeta original");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No. de Tarjeta Nuevo");

        FieldNewTarget.setBackground(new java.awt.Color(255, 255, 255));
        FieldNewTarget.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        FieldNewTarget.setForeground(new java.awt.Color(0, 0, 0));
        FieldNewTarget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldNewTargetKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(807, 807, 807)
                        .addComponent(ModifyLimitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldOldTarget, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                            .addComponent(FieldNewTarget))))
                .addGap(22, 22, 22))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FieldOldTarget)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FieldNewTarget))
                .addGap(42, 42, 42)
                .addComponent(ModifyLimitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

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

    private void ModifyLimitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyLimitBtnActionPerformed
        SQLConection sqlConnection = new SQLConection();
        Connection conn = sqlConnection.StartSQLConnection();
        
        if(FieldOldTarget.getText().isEmpty() || FieldNewTarget.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Rellena todos los espacios");
            return;
        }
        
        if(FieldOldTarget.getText().length() != 16 || FieldNewTarget.getText().length() != 16){
            JOptionPane.showMessageDialog(this, "Los numeros de las tarjetas solo pueden tener 16 caracteres kajajaj");
            return;
        }
      
      
        String oldTarget = FieldOldTarget.getText();
        String newTarget = FieldNewTarget.getText();
        
        String sqlCheck = "SELECT id_usuario FROM CREAR_USUARIOS WHERE numero_tarjeta = ?";
        try(PreparedStatement checkUser = conn.prepareStatement(sqlCheck)){
            checkUser.setString(1, oldTarget);
            ResultSet rs = checkUser.executeQuery();
            if(!rs.next()){
                JOptionPane.showMessageDialog(this,"No existe el numero de tarjeta en la base de datos");
                return;
            }
            
            int userId = rs.getInt("id_usuario");
            
            String sql = "UPDATE CREAR_USUARIOS SET numero_tarjeta = ?, ultima_modificacion = GETDATE() WHERE numero_tarjeta = ?";
            try(PreparedStatement updateStmt = conn.prepareStatement(sql)){
                updateStmt.setString(1, newTarget);
                updateStmt.setString(2, oldTarget);
                int rowsAffected = updateStmt.executeUpdate();
                
                if(rowsAffected > 0){
                    String insertSQL = "INSERT INTO CAMBIOS_TARJETA (id_usuario,numero_tarjeta_anterior,numero_tarjeta_nuevo,fecha_cambio) VALUES (?,?,?,GETDATE())";
                try(PreparedStatement insertStmt = conn.prepareStatement(insertSQL)){
                    insertStmt.setInt(1, userId);
                    insertStmt.setString(2, oldTarget);
                    insertStmt.setString(3, newTarget);
                    insertStmt.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this, "El numero de tarjeta ha sido modificado con exito");
                    }
                
                } else{
                    JOptionPane.showMessageDialog(this, "Error al modificar el numero de tarjeta");
                    conn.rollback();
                }           
            }  
        } catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error de SQL: " + e.getMessage(),"Error jajajajsajsajdsjd",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ModifyLimitBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainAdminLobby LobbyAdmin = new MainAdminLobby(SharedAdminData.getLoginName(),SharedAdminData.getPassword());
        LobbyAdmin.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FieldOldTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldOldTargetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldOldTargetActionPerformed

    private void FieldOldTargetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldOldTargetKeyTyped
       char c = evt.getKeyChar();
       if(!Character.isDigit(c)){
           evt.consume();
       }
    }//GEN-LAST:event_FieldOldTargetKeyTyped

    private void FieldNewTargetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldNewTargetKeyTyped
       char c = evt.getKeyChar();
       if(!Character.isDigit(c)){
           evt.consume();
       }
    }//GEN-LAST:event_FieldNewTargetKeyTyped

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
            java.util.logging.Logger.getLogger(ModTarget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModTarget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModTarget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModTarget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModTarget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldNewTarget;
    private javax.swing.JTextField FieldOldTarget;
    private javax.swing.JButton ModifyLimitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
