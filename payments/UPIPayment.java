package com.parkingLotSystem.payments;

public class UPIPayment implements PaymentStrategy{

    public void processPayment(double amount){

        System.out.println("Processing UPI payment of $:"+ amount);
    }
}
