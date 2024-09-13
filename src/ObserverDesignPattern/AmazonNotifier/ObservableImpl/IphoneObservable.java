package ObserverDesignPattern.AmazonNotifier.ObservableImpl;

import ObserverDesignPattern.AmazonNotifier.Interface.Observable;
import ObserverDesignPattern.AmazonNotifier.Interface.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable {
    List<Observer> allIphoneObservers = new ArrayList<>();
    int stockCount;
    @Override
    public void addObservers(Observer obj) {
        allIphoneObservers.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        allIphoneObservers.remove(obj);
    }

    @Override
    public void notifyObserve() {
        for (Observer i : allIphoneObservers){
            i.update();
        }
    }

    @Override
    public void updateData(int newStock) {
        if(stockCount == 0){
            notifyObserve();
        }
        stockCount += newStock;
    }
}
