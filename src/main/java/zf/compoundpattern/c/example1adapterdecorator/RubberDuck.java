package zf.compoundpattern.c.example1adapterdecorator;

/**
 * Created by shivam.si on 02/04/22 5:42 pm
 */

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
