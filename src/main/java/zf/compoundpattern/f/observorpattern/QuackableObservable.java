package zf.compoundpattern.f.observorpattern;

/**
 * Created by shivam.si on 02/04/22 6:22 pm
 */

public interface QuackableObservable {
    public void registerObserver(Observer observer);
    public void notifyObserver();
}
