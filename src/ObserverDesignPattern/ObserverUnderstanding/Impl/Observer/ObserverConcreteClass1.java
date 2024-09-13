package ObserverDesignPattern.ObserverUnderstanding.Impl.Observer;

import ObserverDesignPattern.ObserverUnderstanding.Interfaces.ObservableInterface;
import ObserverDesignPattern.ObserverUnderstanding.Interfaces.ObserverInterface;

public class ObserverConcreteClass1 implements ObserverInterface {
    ObservableInterface obj;
    ObserverConcreteClass1(ObservableInterface observalbeObj){
        this.obj = observalbeObj;
    }
    @Override
    public void update() {
        System.out.println("The state of the observable object has been changed");
    }
}
