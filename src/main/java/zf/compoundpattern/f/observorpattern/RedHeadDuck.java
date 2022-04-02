package zf.compoundpattern.f.observorpattern;

/**
 * Created by shivam.si on 02/04/22 5:41 pm
 */

public class RedHeadDuck implements Quackable {

    Observable observable;

    public RedHeadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
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
        return "Red Head Duck";
    }
}
