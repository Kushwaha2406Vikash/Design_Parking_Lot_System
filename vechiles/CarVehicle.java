package com.parkingLotSystem.vechiles;

public class CarVehicle extends Vehicle{

    public static final  double RATE = 10.0;

    public CarVehicle(String licensePlate){
        super(licensePlate,"CAR");
    }


    @Override
    public double calculateFee(int stayhour) {
        return stayhour*RATE;
    }
}
