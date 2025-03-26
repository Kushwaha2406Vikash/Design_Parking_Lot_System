package com.parkingLotSystem.payments;

public class CreditCardPayment implements PaymentStrategy{

    public void processPayment(double amount){

        System.out.println("Processing Credit payment of $:"+ amount);
    }
}
