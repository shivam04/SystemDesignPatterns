package zf.compoundpattern.f.observorpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by shivam.si on 02/04/22 6:08 pm
 */

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable duck) {
        quackers.add(duck);
    }

    @Override
    public void quack() {
        for (Quackable duck : quackers) {
            duck.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for(Quackable duck : quackers) {
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObserver() { }
}
