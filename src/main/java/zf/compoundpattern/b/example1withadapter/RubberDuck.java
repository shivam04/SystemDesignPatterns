package zf.compoundpattern.b.example1withadapter;

/**
 * Created by shivam.si on 02/04/22 5:42 pm
 */

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
