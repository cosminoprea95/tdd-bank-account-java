package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void balanceCheckAfterDeposit(){
        Account account = new Account();
        account.deposit(10.0);
        assertThat(account.balance()).isEqualTo(10.0);
    }

    @Test
    public void checkBalanceAfterRetrievingAccount(){
        Account account = new Account(100.0);
        account.deposit(10.0);
        assertThat(account.balance()).isEqualTo(110.0);
    }
}
