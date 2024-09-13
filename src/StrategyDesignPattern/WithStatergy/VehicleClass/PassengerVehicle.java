package StrategyDesignPattern.WithStatergy.VehicleClass;

import StrategyDesignPattern.WithStatergy.DriveCapabilityStatergy.DriveCapabilityStatergy;
import StrategyDesignPattern.WithStatergy.DriveCapabilityStatergy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDrive());
    }

    @Override
    public void driveVehicle() {
        drive.driveCapability();
    }
}
