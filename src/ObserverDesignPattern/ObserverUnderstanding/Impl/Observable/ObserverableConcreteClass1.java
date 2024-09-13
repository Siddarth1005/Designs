package ObserverDesignPattern.ObserverUnderstanding.Impl.Observable;

import ObserverDesignPattern.ObserverUnderstanding.Interfaces.ObservableInterface;
import ObserverDesignPattern.ObserverUnderstanding.Interfaces.ObserverInterface;

public class ObserverableConcreteClass1 implements ObservableInterface {
    @Override
    public void addObserver(ObserverInterface obj) {
        OBSERVER_INTERFACE_LIST.add(obj);
    }
    @Override
    public void removeObserver(ObserverInterface obj) {
        OBSERVER_INTERFACE_LIST.remove(obj);
    }

    @Override
    public void notifyAllObservers() {
        for (ObserverInterface i : OBSERVER_INTERFACE_LIST){
            i.update();
        }
    }
}
