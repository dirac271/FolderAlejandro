/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whatever.proyectocajero;

public class SharedAdminData {
    public static String loginName;
    public static String PassUser;
    
    public static void setLoginName(String loginame){
        SharedAdminData.loginName = loginame;
    }
    
    public static String getLoginName(){
        return SharedAdminData.loginName;
    }
    
    public static void setPassword(String pass){
        SharedAdminData.PassUser = pass;
    }
    
    public static String getPassword(){
        return SharedAdminData.PassUser;
    }
}
