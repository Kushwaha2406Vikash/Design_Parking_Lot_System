package com.parkingLotSystem.parkinglot;

import com.parkingLotSystem.vechiles.Vehicle;

public class CarParkingSpot extends ParkingSpot{

    public CarParkingSpot(int spotNumber){
        super(spotNumber,"Car");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Car".equalsIgnoreCase(vehicle.getVechileType());
    }
}
