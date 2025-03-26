package com.parkingLotSystem.parkinglot;

import com.parkingLotSystem.vechiles.Vehicle;

public class BikeParkingSpot extends ParkingSpot{



    public BikeParkingSpot(int spotNuber){
         super(spotNuber,"Bike");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Bike".equalsIgnoreCase(vehicle.getVechileType());
    }
}
