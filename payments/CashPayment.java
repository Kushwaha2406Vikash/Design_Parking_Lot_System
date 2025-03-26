package com.parkingLotSystem.payments;

public class CashPayment implements PaymentStrategy{

    public void processPayment(double amount){

        System.out.println("Processing Cash payment of $:"+ amount);
    }

}
