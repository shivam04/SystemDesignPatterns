package a.solid.seperation;

/**
 * Created by shivam.si on 29/03/22 8:23 am
 */

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.swim();
    }
}
