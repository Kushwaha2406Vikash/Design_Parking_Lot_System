package com.parkingLotSystem.payments;

public class Payment {

    double amount;
    PaymentStrategy paymentstrategy;

    public Payment(double amount, PaymentStrategy pamentstrategy){

        this.amount=amount;
        this.paymentstrategy=pamentstrategy;
    }


    public  void processPayment(){
        if(amount > 0){
            paymentstrategy.processPayment(amount);
        }else{
            System.out.println("Invalid Payment amount");
        }
    }


}
