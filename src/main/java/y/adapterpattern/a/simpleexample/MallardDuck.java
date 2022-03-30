package y.adapterpattern.a.simpleexample;

/**
 * Created by shivam.si on 30/03/22 3:11 pm
 */

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack Quack!!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying!!");
    }
}
