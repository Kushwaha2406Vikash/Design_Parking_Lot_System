package com.parkingLotSystem.vechiles;

 abstract public class Vehicle {
     private String licensePlate;
     private String vechileType;

     public Vehicle(String licensePlate, String vechileType){
         this.licensePlate=licensePlate;
         this.vechileType=vechileType;
     }

     public String getLicensePlate(){
         return licensePlate;
     }

     public String getVechileType(){
         return vechileType;
     }

     public abstract double calculateFee(int stayhour);


}
