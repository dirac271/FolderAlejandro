/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whatever.proyectocajero;

import java.math.BigDecimal;

public class SharedUserDATA {
    public static String UserLoginName;
    public static int id_usuario;
    public static String PIN;
    public static int TokenTipo;
    public static String token;
    public static String NumeroTarjeta;
    public static BigDecimal montoMax;
    public static BigDecimal saldoUser;
    public static BigDecimal MontoRetiradoHoy;

    public static BigDecimal getMontoRetiradoHoy() {
        return MontoRetiradoHoy;
    }

    public static void setMontoRetiradoHoy(BigDecimal MontoRetiradoHoy) {
        SharedUserDATA.MontoRetiradoHoy = MontoRetiradoHoy;
    }
    
    
    public static BigDecimal getMontoMax() {
        return montoMax;
    }

    public static void setMontoMax(BigDecimal montoMax) {
        SharedUserDATA.montoMax = montoMax;
    }

    public static BigDecimal getSaldoUser() {
        return saldoUser;
    }

    public static void setSaldoUser(BigDecimal saldoUser) {
        SharedUserDATA.saldoUser = saldoUser;
    }

    
    public static String getUserLoginName() {
        return UserLoginName;
    }

    public static void setUserLoginName(String UserLoginName) {
        SharedUserDATA.UserLoginName = UserLoginName;
    }

    public static int getId_usuario() {
        return id_usuario;
    }

    public static void setId_usuario(int id_usuario) {
        SharedUserDATA.id_usuario = id_usuario;
    }

    public static String getPIN() {
        return PIN;
    }

    public static void setPIN(String PIN) {
        SharedUserDATA.PIN = PIN;
    }

    public static int getTokenTipo() {
        return TokenTipo;
    }

    public static void setTokenTipo(int TokenTipo) {
        SharedUserDATA.TokenTipo = TokenTipo;
    }

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        SharedUserDATA.token = token;
    }

    public static String getNumeroTarjeta() {
        return NumeroTarjeta;
    }

    public static void setNumeroTarjeta(String NumeroTarjeta) {
        SharedUserDATA.NumeroTarjeta = NumeroTarjeta;
    }
       
    
}
