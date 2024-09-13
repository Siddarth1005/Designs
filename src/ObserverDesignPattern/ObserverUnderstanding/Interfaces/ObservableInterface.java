package ObserverDesignPattern.ObserverUnderstanding.Interfaces;

import java.util.ArrayList;
import java.util.List;

public interface ObservableInterface {
    List<ObserverInterface> OBSERVER_INTERFACE_LIST = new ArrayList<>();
    void addObserver(ObserverInterface obj);
    void removeObserver(ObserverInterface obj);
    void notifyAllObservers();
}
