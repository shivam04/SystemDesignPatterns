package zf.compoundpattern.d.allPrev.abstractfactorypattern;

/**
 * Created by shivam.si on 02/04/22 5:42 pm
 */

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
