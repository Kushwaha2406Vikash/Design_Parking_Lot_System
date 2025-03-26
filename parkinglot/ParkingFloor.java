package com.parkingLotSystem.parkinglot;
import java.util.*;
public class ParkingFloor {

    List<ParkingSpot>spots;
    int floornum;
    int  numofcarsopt;
    int  numofbikespot;

    public ParkingFloor(int floornum,int numofcarsopt,int numofbikespot){
        this.floornum=floornum;
        this.spots=new ArrayList<>();

        for(int i=0;i<numofcarsopt;i++){
            spots.add(new CarParkingSpot(i+1));
        }

        for(int i=numofbikespot;i<numofcarsopt+numofbikespot;i++){
            spots.add(new BikeParkingSpot(i+1));
        }
    }

    public ParkingSpot findAvailableSpot(String vehicleType) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupid() && spot.getSpotType().equalsIgnoreCase(vehicleType)) {
                return spot;  // Return the first available spot for the vehicle type
            }
        }
        return null;  // No available spot found for the given vehicle type
    }



    // Method to return all parking spots on this floor
    public List<ParkingSpot> getParkingSpots() {
        return spots;
    }





}
