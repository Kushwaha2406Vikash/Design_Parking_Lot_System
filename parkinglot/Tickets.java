package com.parkingLotSystem.parkinglot;
import com.parkingLotSystem.vechiles.Vehicle;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Tickets {
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private LocalDateTime startTime;


    // Constructor to initialize ticket with parking spot and vehicle
    public Tickets(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.startTime = LocalDateTime.now();  // Set current time as the start time
    }

}