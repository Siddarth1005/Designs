package StrategyDesignPattern.WithStatergy.VehicleClass;

import StrategyDesignPattern.WithStatergy.DriveCapabilityStatergy.NormalDrive;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new NormalDrive());
    }

    @Override
    public void driveVehicle() {
        drive.driveCapability();
    }
}
