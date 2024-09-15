package FactoryDesignPattern;

import FactoryDesignPattern.Dialogs.HTMLDialogConrete;
import FactoryDesignPattern.Dialogs.WindowsDialogConcrete;
import ObserverDesignPattern.ObserverUnderstanding.Impl.Observable.ObserverableConcreteClass1;
import ObserverDesignPattern.ObserverUnderstanding.Interfaces.ObservableInterface;
import StrategyDesignPattern.WithStatergy.VehicleClass.PassengerVehicle;
import StrategyDesignPattern.WithStatergy.VehicleClass.SportsVehicle;
import StrategyDesignPattern.WithStatergy.VehicleClass.Vehicle;

public class ClientMain {
    public static void main(String[] args) {
        String input = "Windows";

        if (input.equals("Windows")){
            System.out.println(new WindowsDialogConcrete());
        }else{
            System.out.println(new HTMLDialogConrete());
        }
    }
}
