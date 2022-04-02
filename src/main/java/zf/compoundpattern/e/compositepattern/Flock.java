package zf.compoundpattern.e.compositepattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by shivam.si on 02/04/22 6:08 pm
 */

public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable duck) {
        quackers.add(duck);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = iterator.next();
            duck.quack();
        }
    }
}
