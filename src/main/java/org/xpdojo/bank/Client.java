package org.xpdojo.bank;

public class Client {

    private final Account account;

    public Client(){
        this.account = Account.emptyAccount();
    }

    public Account getAccount() {
        return account;
    }
}
