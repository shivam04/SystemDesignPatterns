package y.adapterpattern.a.simpleexample;

/**
 * Created by shivam.si on 30/03/22 3:14 pm
 */

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey Says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck Says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe TurkeyAdapter Says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
