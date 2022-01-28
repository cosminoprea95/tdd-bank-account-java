package org.xpdojo.bank;

import java.util.Date;

public class Loan {

    private Double balance;
    private final Date loanCreated;
    private final Date loanFinised;

    public Loan(Double balance, Date loanCreated, Date loanFinised){
        this.balance = balance;
        this.loanCreated = loanCreated;
        this.loanFinised = loanFinised;
    }

    public Double getBalance(){
        return balance;
    }

    public Date getLoanCreated(){
        return this.loanCreated;
    }
    public Date getLoanFinised(){
        return this.loanFinised;
    }

    public void payRate(Double rate){
        this.balance+=rate;
    }

}
