package org.xpdojo.bank;

import java.util.Date;

public class Loan {

    private Double balance;
    private final Date date;

    public Loan(Double balance, Date date){
        this.balance = balance;
        this.date = date;
    }

    public Double getBalance(){
        return balance;
    }

    public Date getDate(){
        return this.date;
    }

    public void payRate(Double rate){
        this.balance+=rate;
    }

}
