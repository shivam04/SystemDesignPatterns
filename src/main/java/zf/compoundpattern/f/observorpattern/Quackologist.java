package zf.compoundpattern.f.observorpattern;

/**
 * Created by shivam.si on 02/04/22 6:33 pm
 */

public class Quackologist implements Observer{
    @Override
    public void update(QuackableObservable duck) {
        System.out.println("Quackologist: " + duck + " just Quack");
    }
}
