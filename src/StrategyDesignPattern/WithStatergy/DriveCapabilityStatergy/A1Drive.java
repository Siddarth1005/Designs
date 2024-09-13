package StrategyDesignPattern.WithStatergy.DriveCapabilityStatergy;

public class A1Drive implements DriveCapabilityStatergy{
    @Override
    public void driveCapability() {
        System.out.println("Hey i use A1 type driveVehicle capability");
    }
}
