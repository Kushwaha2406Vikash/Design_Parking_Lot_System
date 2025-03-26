package com.parkingLotSystem.parkinglot;

import com.parkingLotSystem.vechiles.Vehicle;

public abstract class ParkingSpot {

   private int spotNumber;
  private   boolean isOccupid;
    Vehicle vehicle;
  private   String spotType;

    public ParkingSpot(int spotNumber, String spotType){
        this.spotNumber=spotNumber;
        this.isOccupid=false;
        this.spotType=spotType;
    }

    public boolean isOccupid(){
        return  isOccupid;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);


    public void parkVehicle(Vehicle vehicle){

        if(isOccupid){
            throw  new IllegalStateException("Spot is already full");
        }

        if(!canParkVehicle(vehicle)){

            throw new IllegalArgumentException("Spot is not sutibale for this types of Vehicle"+ vehicle.getVechileType());
        }

        this.isOccupid=true;
        this.vehicle=vehicle;
    }

    public void vocate(){

        if(!isOccupid){
            throw new IllegalStateException("Spot is already vocate");
        }

        this.isOccupid=false;
        this.vehicle=null;
    }

    public int getSpotNumber(){
        return spotNumber;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public String toString(){
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", isOccupied=" + isOccupid+
                ", vehicle=" + (vehicle != null ? vehicle.getLicensePlate() : "None") +
                '}';
    }

    public String getSpotType(){
        return spotType;
    }
}
