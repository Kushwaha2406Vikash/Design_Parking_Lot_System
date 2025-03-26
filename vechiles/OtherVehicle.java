package com.parkingLotSystem.vechiles;

public class OtherVehicle extends Vehicle {

    public static final  double RATE = 15.0;

    public OtherVehicle (String licensePlate){
        super(licensePlate,"Other");
    }


    @Override
    public double calculateFee(int stayhour) {
        return stayhour*RATE;
    }
}
