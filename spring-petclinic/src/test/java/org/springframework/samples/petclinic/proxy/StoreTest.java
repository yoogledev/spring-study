package org.springframework.samples.petclinic.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    public void testPay() {
        Payment cashPerg = new CashPerf();
        Store store = new Store(cashPerg);
        store.buySomething(100);
    }

}
