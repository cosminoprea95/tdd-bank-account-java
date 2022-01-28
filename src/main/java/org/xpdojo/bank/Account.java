package org.xpdojo.bank;

public class Account {
    private Double balance;

    public Account(){
        this.balance = 0.0;
    }

    public Account(Double balance){
        this.balance = balance;
    }

    public void deposit(Double deposit) {
        this.balance +=deposit;
    }

    public Double balance() {
        return balance;
    }
}
