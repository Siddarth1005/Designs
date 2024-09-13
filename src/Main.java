import ObserverDesignPattern.ObserverUnderstanding.Impl.Observable.ObserverableConcreteClass1;
import ObserverDesignPattern.ObserverUnderstanding.Interfaces.ObservableInterface;
import StrategyDesignPattern.WithStatergy.VehicleClass.PassengerVehicle;
import StrategyDesignPattern.WithStatergy.VehicleClass.SportsVehicle;
import StrategyDesignPattern.WithStatergy.VehicleClass.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Strategy Design Pattern
        Vehicle ferrari = new SportsVehicle();
        ferrari.driveVehicle();

        Vehicle maruti800 = new PassengerVehicle();
        maruti800.driveVehicle();


//        Observer Design Pattern
        ObservableInterface stateChange = new ObserverableConcreteClass1();
    }
}