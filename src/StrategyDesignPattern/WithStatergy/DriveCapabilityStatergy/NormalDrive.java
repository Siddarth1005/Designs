package StrategyDesignPattern.WithStatergy.DriveCapabilityStatergy;

public class NormalDrive implements DriveCapabilityStatergy{
    @Override
    public void driveCapability() {
        System.out.println("Hey i use normal driveVehicle capability");
    }
}
