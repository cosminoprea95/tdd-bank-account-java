package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ClientTest {

    @Test
    public void isNewClientHavingEmptyBalance() {
        Client client = new Client();
        client.getAccount().balance();
        assertThat(client.getAccount().balance()).isEqualTo(0.0);
    }

    @Test
    public void checkAddLoan(){
        Client client = new Client();
        Date date = new Date();
        Loan loan = new Loan(10000.0, date);
        client.addLoan(loan);
        assertThat(client.getLoans().get(0).getBalance()).isEqualTo(-10000);
        assertThat(client.getLoans().get(0).getDate()).isEqualTo(date);
    }

    @Test
    public void testPayRate(){
        Client client = new Client();
        Date date = new Date();
        Loan loan = new Loan(-10000.0, date);
        client.addLoan(loan);
        client.getLoans().get(0).payRate(1000.0);
        assertThat(client.getLoans().get(0).getBalance()).isEqualTo(-9000.0);
    }

    @Test
    public void checkLoanBalanceIsNegative(){
        Client client = new Client();
        Date date = new Date();
        Loan loan = new Loan(-10000.0, date);
        client.addLoan(loan);
        assertThat(client.getLoans().get(0).getBalance()).isLessThan(0.0);
    }
}
