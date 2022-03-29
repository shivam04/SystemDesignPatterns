package e.observerPattern.codes;

/**
 * Created by shivam.si on 29/03/22 11:43 am
 */

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
