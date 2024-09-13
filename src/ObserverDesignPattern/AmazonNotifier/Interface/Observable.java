package ObserverDesignPattern.AmazonNotifier.Interface;

public interface Observable {
    void addObservers(Observer obj);
    void removeObserver(Observer obj);
    void notifyObserve();
    void updateData(int stockCount);
}
