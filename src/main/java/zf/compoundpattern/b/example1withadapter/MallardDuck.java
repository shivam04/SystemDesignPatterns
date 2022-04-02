package zf.compoundpattern.b.example1withadapter;

/**
 * Created by shivam.si on 02/04/22 5:40 pm
 */

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
