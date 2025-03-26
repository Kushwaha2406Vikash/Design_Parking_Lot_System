package com.parkingLotSystem.payments;

import java.util.Scanner;

public class PaymentServices {

    private Scanner sc;

    public PaymentServices(Scanner sc){
        this.sc=sc;
    }


    public void processPayment(double fee){
        choicePaymentMethod(fee);
    }

    public void  choicePaymentMethod(double fee){
        System.out.println("Total fee: " + fee);
        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");
        System.out.println("3. UPI");

        int choice = sc.nextInt();

        Payment payment;

        switch (choice){
            case 1:
                payment = new Payment(fee, new CreditCardPayment());
                break;
            case 2:
                payment = new Payment(fee, new CashPayment());
                break;
            case 3:
                payment = new Payment(fee, new UPIPayment());
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Cash payment.");
                payment = new Payment(fee, new CashPayment());
                break;
        }

        payment.processPayment();
    }
}
