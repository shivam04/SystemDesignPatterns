package zf.compoundpattern.c.example1adapterdecorator;

/**
 * Created by shivam.si on 02/04/22 5:41 pm
 */

public class RedHeadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
