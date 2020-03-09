package org.springframework.samples.petclinic.proxy;

public class Cash implements Payment{
    @Override
    public void pay(int ammount) {
        System.out.println(ammount + "현금 결제");
    }
}
