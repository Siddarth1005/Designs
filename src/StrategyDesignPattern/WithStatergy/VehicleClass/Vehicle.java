package StrategyDesignPattern.WithStatergy.VehicleClass;

import StrategyDesignPattern.WithStatergy.DriveCapabilityStatergy.DriveCapabilityStatergy;


public class Vehicle {
    DriveCapabilityStatergy drive;

//    constructor injection.
    public Vehicle(DriveCapabilityStatergy drive){
        this.drive = drive;
    }
    public void driveVehicle(){
        drive.driveCapability();
    }
}
