package StrategyDesignPattern.WithoutStatergy;

public class SportsVehicle extends Vehicle{

//    Code has been dupluicated as the same functionality is being used in the OffRoadVehicle claas.
//    STATERGY pattern resolves this issue.
    @Override
    public void drive() {
        System.out.println("Hey i'm a Sports Vehicle and i need a A1 type of capability");
    }
}
