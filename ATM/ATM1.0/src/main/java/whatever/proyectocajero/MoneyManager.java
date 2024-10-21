/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whatever.proyectocajero;

import java.math.BigDecimal;

public class MoneyManager {
    private int money_1;
    private int money_5;
    private int money_10;
    private int money_20;
    private int money_50;
    private int money_100;
    private int money_200;
    private BigDecimal TotalMoney;
    
    public MoneyManager(){
        this.money_1 = 0;
        this.money_5 = 0;
        this.money_10 = 0;
        this.money_20 = 0;
        this.money_50 = 0;
        this.money_100 = 0;
        this.money_200 = 0;
        this.TotalMoney = BigDecimal.valueOf(0.0);
    }

    public BigDecimal getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(BigDecimal TotalMoney) {
        this.TotalMoney = TotalMoney;
    }

    public int getMoney_1() {
        return money_1;
    }

    public void setMoney_1(int money_1) {
        this.money_1 = money_1;
    }

    public int getMoney_5() {
        return money_5;
    }

    public void setMoney_5(int money_5) {
        this.money_5 = money_5;
    }

    public int getMoney_10() {
        return money_10;
    }

    public void setMoney_10(int money_10) {
        this.money_10 = money_10;
    }

    public int getMoney_20() {
        return money_20;
    }

    public void setMoney_20(int money_20) {
        this.money_20 = money_20;
    }

    public int getMoney_50() {
        return money_50;
    }

    public void setMoney_50(int money_50) {
        this.money_50 = money_50;
    }

    public int getMoney_100() {
        return money_100;
    }

    public void setMoney_100(int money_100) {
        this.money_100 = money_100;
    }

    public int getMoney_200() {
        return money_200;
    }

    public void setMoney_200(int money_200) {
        this.money_200 = money_200;
    }
    
}
