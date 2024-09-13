package StrategyDesignPattern.WithStatergy.VehicleClass;

import StrategyDesignPattern.WithStatergy.DriveCapabilityStatergy.A1Drive;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new A1Drive());
    }

    @Override
    public void driveVehicle() {
        drive.driveCapability();
    }
}
