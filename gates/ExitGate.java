package com.parkingLotSystem.gates;
import java.util.*;
import com.parkingLotSystem.parkinglot.ParkingLot;
import  com.parkingLotSystem.vechiles.Vehicle;

import  com.parkingLotSystem.parkinglot.ParkingSpot;
import  com.parkingLotSystem.payments.PaymentServices;


public class ExitGate {

    private ParkingLot parkingLot;
    private PaymentServices paymentService;

    public ExitGate(ParkingLot parkingLot, PaymentServices paymentService) {
        this.parkingLot = parkingLot;
        this.paymentService = paymentService;
    }

    public void processExit(int spotNumber, int hoursStayed) {
        // Find the spot by number
        ParkingSpot spot = parkingLot.getSpotByNumber(spotNumber);

        if (spot == null || !spot.isOccupid()) {
            System.out.println("Invalid or vacant spot!");
            return;
        }

        // Get the vehicle in the spot
        Vehicle vehicle = spot.getVehicle();
        if (vehicle == null) {
            System.out.println("No vehicle found in the spot!");
            return;
        }

        // Calculate the parking fee
        double fee = vehicle.calculateFee(hoursStayed);

        // Delegate payment processing to PaymentService
        paymentService.processPayment(fee);

        // Vacate the spot after payment
        parkingLot.vacateSpot(spot, vehicle);
        System.out.println("Spot vacated successfully!");
    }
}
