/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whatever.proyectocajero;

import AdminJframes.MainAdminLobby;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdminDataSQL {
    private String User;
    private String Password;
    public AdminDataSQL(){
       
    }
    public AdminDataSQL(String name,String pass){
        this.User = name;
        this.Password = pass;
    }
    
    public String getUsername(){
        return this.User;
    }

    public String getPassword() {
        return this.Password;
    }
    
    public boolean CheckLoginAdminData(String username,String pass){
        SQLConection sqlConnection = new SQLConection();
        Connection conn = sqlConnection.StartSQLConnection();
        String sql = "SELECT * FROM ADMINSTRADOR WHERE username = ? AND password = ?";
        Boolean flag = false;
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, username);
            pstmt.setString(2, pass);
            ResultSet rs = pstmt.executeQuery();
            /* 
            Es que te veo y sonaban las viejas de Feid
            Como flor delicada, me dejas caer
            Solo funciona si te portas bien
            Solo funciona si te portas bien
            Es que te veo y recuerdo esa n
            oche en París
            Que dijiste "por siempre" y yo te creí
            Solo funciona si te portas bien
            Y tú no eres así.
            No no no corazon, nunca fuiste así
            */
            if(rs.next()){
                String dbUsername = rs.getString("username");
                String dbPassword = rs.getString("password");
                if(username.equals(dbUsername) && pass.equals(dbPassword) != false){
                    SharedAdminData.setLoginName(dbUsername);
                    SharedAdminData.setPassword(pass);
                    flag = true;    
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error" + e.getMessage());
        }
        return flag;
    }
}
