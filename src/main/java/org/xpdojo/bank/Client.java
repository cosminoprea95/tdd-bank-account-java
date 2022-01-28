package org.xpdojo.bank;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private final Account account;
    private final List<Loan> loans;

    public Client(){
        this.account = Account.emptyAccount();
        this.loans = new ArrayList<>();
    }

    public Account getAccount() {
        return account;
    }

    public List<org.xpdojo.bank.Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        this.loans.add(loan);
    }
}
