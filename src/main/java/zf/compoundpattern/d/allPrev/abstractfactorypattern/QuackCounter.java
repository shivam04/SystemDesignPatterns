package zf.compoundpattern.d.allPrev.abstractfactorypattern;

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
}
