package y.adapterpattern.a.simpleexample;

/**
 * Created by shivam.si on 30/03/22 3:11 pm
 */

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble!!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying short distance!!");
    }
}
