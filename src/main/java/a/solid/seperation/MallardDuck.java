package a.solid.seperation;

/**
 * Created by shivam.si on 29/03/22 8:16 am
 */

public class MallardDuck extends Duck{

    public MallardDuck() {

        //implementing like that is a bad behaviour
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
