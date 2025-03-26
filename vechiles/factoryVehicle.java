package com.parkingLotSystem.vechiles;

public class factoryVehicle {

    public static Vehicle createVehicle(String licensePlate, String vehicleType){

        if(vehicleType.equalsIgnoreCase("Car")){
            return new CarVehicle(licensePlate);
        } else if (vehicleType.equalsIgnoreCase("Bike")) {

            return new BikeVehicle(licensePlate);
        } else if (vehicleType.equalsIgnoreCase("Other")) {

            return new OtherVehicle(licensePlate);
        }

        return null;
    }
}
