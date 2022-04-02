package zf.compoundpattern.f.observorpattern;

import java.util.ArrayList;

/**
 * Created by shivam.si on 02/04/22 6:26 pm
 */

public class Observable implements QuackableObservable{
    ArrayList<Observer> observers = new ArrayList<>();
    QuackableObservable duck;

    public Observable(QuackableObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(duck);
        }
    }
}
