package zf.compoundpattern.f.observorpattern;

/**
 * Created by shivam.si on 02/04/22 5:42 pm
 */

public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }

    @Override
    public String toString() {
        return "Rubber Duck";
    }
}
