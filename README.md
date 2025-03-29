# Design Parking Lot System - Low-Level Design

## Overview
The **Parking Lot System** is a Java-based implementation of a parking management system. This project demonstrates the low-level design of a system that handles vehicle parking, spot allocation, fee calculation, and spot vacating using object-oriented principles.

## Features
- Multi-floor parking management
- Entrance and exit gate handling
- Dynamic parking spot allocation
- Payment service for calculating parking fees

## Technologies Used
- **Java** (Core programming language)
- **Object-Oriented Programming (OOP)** (Encapsulation, Abstraction, Polymorphism, Inheritance)
- **Scanner Class** (For user interaction in the console-based interface)

## Project Structure
```
com.parkingLotSystem
│── main
│   ├── Main.java                 # Entry point of the application
│
├── gates
│   ├── EntranceGate.java         # Handles vehicle entry and parking allocation
│   ├── ExitGate.java             # Handles vehicle exit and payment processing
│
├── parkinglot
│   ├── ParkingFloor.java         # Represents a parking floor with vehicle spots
│   ├── ParkingLot.java           # Manages multiple floors and spot availability
│
├── payments
│   ├── PaymentServices.java      # Handles payment calculations and transactions
```

## How It Works
1. **Parking Lot Initialization:**
   - A parking lot is created with floors and parking spots for cars and bikes.
   - `ParkingFloor` manages individual floor-level parking slots.
   - `ParkingLot` holds all floors and manages spot allocation.

2. **Entrance & Parking:**
   - The `EntranceGate` is used to process vehicle entry and allocate parking spots.

3. **Exit & Payment:**
   - The `ExitGate` processes vehicle exit, calculates parking fees based on duration, and collects payments via `PaymentServices`.

4. **User Interaction:**
   - The system runs an interactive session allowing users to park a vehicle, vacate a spot, or exit the system.

## Usage
### Running the Application
Ensure you have **Java installed**. Compile and run the `Main.java` file:
```sh
javac -d . Main.java
java com.parkingLotSystem.main.Main
```

### Sample Execution Output
```
=========================================
   Welcome to the Parking Lot System!   
=========================================

******************************************************
Please choose an option from below:
1. Park a vehicle
2. Vacate a vehicle spot
3. Exit the system
******************************************************
```

## Future Enhancements
- Implement real-time parking spot tracking.
- Introduce dynamic pricing based on peak and off-peak hours.
- Enable reservation-based parking.

## Author
Developed as a low-level design project for a Parking Lot Management System.

## License
This project is licensed under the MIT License.

