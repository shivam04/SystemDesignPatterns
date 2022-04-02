package zf.compoundpattern.f.observorpattern;

/**
 * Created by shivam.si on 02/04/22 5:51 pm
 */

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks += 1;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        duck.notifyObserver();
    }

    public String toString() {
        return duck.toString();
    }
}
