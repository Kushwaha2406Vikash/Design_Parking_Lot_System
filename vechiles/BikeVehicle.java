package com.parkingLotSystem.vechiles;

public class BikeVehicle extends Vehicle{

    public static final  double RATE = 5.0;

    public BikeVehicle(String licensePlate){
        super(licensePlate,"Bike");
    }


    @Override
    public double calculateFee(int stayhour) {
        return stayhour*RATE;
    }
}
