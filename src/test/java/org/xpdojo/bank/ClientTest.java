package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClientTest {

    @Test
    public void isNewClientHaving0Balance() {
        Client client = new Client();
        client.getAccount().balance();
        assertThat(client.getAccount().balance()).isEqualTo(0.0);
    }
}
