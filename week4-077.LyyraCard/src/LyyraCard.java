/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teruaki
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (2.5 <= this.balance) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (4.0 <= this.balance) {
            this.balance -= 4.0;
        }
    }

    public void loadMoney(double amount) {
        if (0 < amount) {
            this.balance += amount;
        }
        if (150 <= this.balance) {
            this.balance = 150;
        }
    }
}
